package org.sunbeam.dac.test;

import java.util.Scanner;
class Product{
	private String title;
	private float price;
	public Product() {
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Title		:	");
		this.title = sc.nextLine();
		System.out.print("Price		:	");
		this.price = sc.nextFloat();
	}
	public void printRecord() {
		System.out.println("Title		:	"+this.title);
		System.out.println("Price		:	"+this.price);
	}	
}
class Book extends Product{
	private int pageCount;
	public Book() {
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		super.acceptRecord();
		System.out.print("Page Count	:	");
		this.pageCount = sc.nextInt();
	}
	public void printRecord() {
		super.printRecord();
		System.out.println("Page Count	:	"+this.pageCount);
	}	
}
class Tape extends Product{
	private int playTime;
	public Tape() {
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		super.acceptRecord();
		System.out.print("Play Time	:	");
		this.playTime = sc.nextInt();
	}
	public void printRecord() {
		super.printRecord();
		System.out.println("Play Time	:	"+this.playTime);
	}	
}
public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Book");
		System.out.println("2.Tape");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			Product product = null;
			switch( choice ) {
			case 1:
				product = new Book();	//Upcasting
				break;
			case 2:
				product = new Tape( );	//Upcasting
				break;
			}
			if( product != null ) {
				//Process of calling method of sub class using reference of super class is called dynamic method dispatch.
				product.acceptRecord();	//Dynamic Method Dispatch
				product.printRecord();	//Dynamic Method Dispatch
			}
		}
	}
	public static void main2(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			Product product;
			switch( choice ) {
			case 1:
				product = new Book();	//Upcasting
				product.acceptRecord();
				product.printRecord();
				break;
			case 2:
				product = new Tape( );	//Upcasting
				product.acceptRecord();
				product.printRecord();
				break;
			}
		}
	}
	public static void main1(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			Book book;
			Tape tape;
			switch( choice ) {
			case 1:
				book = new Book();
				book.acceptRecord();
				book.printRecord();
				break;
			case 2:
				tape = new Tape( );
				tape.acceptRecord();
				tape.printRecord();
				break;
			}
		}
	}
}
