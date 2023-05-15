CREATE TABLE accounts
( 
    acc_number INT PRIMARY KEY,
    balance FLOAT
);

INSERT INTO accounts
VALUES
( 1001, 95000),
( 1002, 30000);

SELECT * FROM accounts;


DELIMITER $$
CREATE PROCEDURE sp_fund_transfer( IN pSrcAccountNumber INT,  IN pDestAccountNumber INT, IN pAmount float, OUT pSrcBalance FLOAT, OUT pDestBalance FLOAT)
BEGIN
    UPDATE accounts 
    SET balance = balance - pAmount
    WHERE acc_number = pSrcAccountNumber;

    UPDATE accounts 
    SET balance = balance + pAmount
    WHERE acc_number = pDestAccountNumber;

    SELECT 
    balance 
    INTO pSrcBalance
    FROM accounts
    WHERE acc_number = pSrcAccountNumber;

    SELECT 
    balance 
    INTO pDestBalance
    FROM accounts
    WHERE acc_number = pDestAccountNumber;
END $$
DELIMITER ;