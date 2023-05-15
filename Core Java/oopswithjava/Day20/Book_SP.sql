DELIMITER $$
CREATE PROCEDURE sp_insert_book( IN pBookId INT, IN pSubjectName VARCHAR(50), IN pBookName VARCHAR(100), IN pAuthorName VARCHAR(50), IN pPrice FLOAT )
BEGIN
    INSERT INTO books
        ( book_id, subject_name, book_name, author_name, price)
    VALUES
        ( pBookId, pSubjectName, pBookName, pAuthorName, pPrice );
END $$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE sp_update_book( IN pBookId INT, IN pPrice FLOAT )
BEGIN
    UPDATE books
    SET price = pPrice
    WHERE book_id = pBookId;
END $$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE sp_delete_book( IN pBookId INT )
BEGIN
    DELETE 
    FROM books
    WHERE book_id = pBookId;
END $$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE sp_select_book( )
BEGIN
    SELECT
    * 
    FROM books;
END $$
DELIMITER ;