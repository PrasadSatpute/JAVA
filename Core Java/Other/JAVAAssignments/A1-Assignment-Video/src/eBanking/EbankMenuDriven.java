package eBanking;

import java.util.ArrayList;
import java.util.Scanner;

public class EbankMenuDriven {
	
	static Scanner sc = new Scanner(System.in);
	ArrayList<Accounts> accounts = new ArrayList<Accounts>();
	
	public void showMenu() {
		
//		1. Add Account
//		2. Display an Account
//		3. Display All Accounts
//		4. Remove an Account
//		5. withdraw
//		6. deposit
//		7. transfer
//		8. search account using name
//		9. search account using email
//		10.search account using phone
//		11. exit
		
		
		
			System.out.println("1. 	Add Account");
			System.out.println("2. 	Display an Account");
			System.out.println("3. 	Display All Accounts");
			System.out.println("4. 	Remove an Account");
			System.out.println("5. 	withdraw");
			System.out.println("6. 	deposit");
			System.out.println("7. 	transfer");
			System.out.println("8. 	search account using name");
			System.out.println("9. 	search account using email");
			System.out.println("10.	search account using phone");
			System.out.println("11. exit");
			System.out.print("Enter Your Choice : ");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				addAccount();
				break;
			case 2:
				displayAccounts();
				break;
			case 3:
				displayAllAccounts();
				break;
			case 4:
				removeAnAccount();
				break;
			case 5:
				depositeAccounts();
				break;
			case 6:
				break;
			case 7:
				
				break;
			case 8:
				displayAccountsName();
				break;
			case 9:
				displayAccountsEmail();
				break;
			case 10:
				displayAccountsPhone();
				break;
			case 11:
				break;
			default:
				System.out.println("Invalid Case");
				break;
					
			}
	
	}
	
	void addAccount() {
		Accounts account = new Accounts();
		account.addAccount();
		accounts.add(account);
	}
	
	void displayAccounts(){
		System.out.println("Enter Account No");
		String accNo = sc.nextLine();
		Accounts account = (Accounts) accounts.stream().filter(acc -> acc.accNumber.equals(accNo));
		account.toString();	
	}
	void displayAllAccounts() {
		 for(Accounts account : accounts) {
			 account.toString();	 
		 }
	}
	void removeAnAccount() {
		System.out.println("Enter Account No");
		String accNo = sc.nextLine();
		accounts.removeIf(acc -> acc.accNumber.contains(accNo));
	}
	void depositeAccounts(){
		System.out.println("Enter Account No");
		String accNo = sc.nextLine();
		Accounts account = (Accounts) accounts.stream().filter(acc -> acc.accNumber.equals(accNo));
		System.out.println("Enter Balance");
		Double bal = sc.nextDouble();
		account.balance = account.balance + bal;
	}
	void displayAccountsName(){
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		Accounts account = (Accounts) accounts.stream().filter(acc -> acc.name.equals(name));
		account.toString();	
	}
	void displayAccountsEmail(){
		System.out.println("Enter Email : ");
		String Email = sc.nextLine();
		Accounts account = (Accounts) accounts.stream().filter(acc -> acc.email.equals(Email));
		account.toString();	
	}
	void displayAccountsPhone(){
		System.out.println("Enter Phone : ");
		String phone = sc.nextLine();
		Accounts account = (Accounts) accounts.stream().filter(acc -> acc.phone.equals(phone));
		account.toString();	
	}
}
