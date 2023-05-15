package org.sunbeam.dac.test;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeMap;

import org.sunbeam.dac.model.Account;
import org.sunbeam.dac.model.Customer;
public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[] accNumber) {
		System.out.print("Enter account number	:	");
		accNumber[ 0 ] = sc.nextInt();
	}
	private static void printRecord(Customer value) {
		if( value != null )
			System.out.println(value.toString());
		else
			System.out.println("Account not found");
	}
	private static void printRecord(boolean removedStatus) {
		if( removedStatus ) 
			System.out.println("Entry is removed");
		else
			System.out.println("Account not found");
	}
	public static Account[] getKeys( ) {
		Account[] arr = new Account[ 5 ];
		arr[ 0 ] = new Account(4519,"Saving", 50000);
		arr[ 1 ] = new Account(2617,"Current",60000);
		arr[ 2 ] = new Account(9815,"Loan",70000);
		arr[ 3 ] = new Account(5193,"Pention",80000);
		arr[ 4 ] = new Account(6026,"Joint",90000);
		return arr;
	}
	public static Customer[] getValues( ) {
		Customer[] arr = new Customer[ 5 ];
		arr[ 0 ] = new Customer("ABC","abc@gmail.com", "11111");
		arr[ 1 ] = new Customer("PQR","pqr@gmail.com","11111");
		arr[ 2 ] = new Customer("XYZ","xyz@gmail.com","11111");
		arr[ 3 ] = new Customer("LMN","lmn@gmail.com","11111");
		arr[ 4 ] = new Customer("EFG", "efg@gmail.com","11111");
		return arr;
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Entry");
		System.out.println("2.Find Entry");
		System.out.println("3.Remove Entry");
		System.out.println("4.Print Entries");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		MapTest test = new MapTest();
		int[] accNumber = new int[ 1 ];
		//test.setMap(new Hashtable<Account, Customer>());
		//test.setMap(new HashMap<Account, Customer>());
		test.setMap(new TreeMap<Account, Customer>());
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Account[] keys = Program.getKeys();
				Customer[] values = Program.getValues();
				test.addEntry( keys, values );
				break;
			case 2:
				Program.acceptRecord( accNumber );
				Customer value =  test.findEntry( accNumber[ 0 ] );
				Program.printRecord( value );
				break;
			case 3:
				Program.acceptRecord( accNumber );
				boolean removedStatus = test.removeEntry( accNumber[ 0 ] );
				Program.printRecord( removedStatus );
				break;
			case 4:
				test.printEntries( );
				break;
			}
		}
	}
}
