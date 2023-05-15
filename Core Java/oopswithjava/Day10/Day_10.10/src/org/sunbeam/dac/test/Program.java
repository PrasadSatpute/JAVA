package org.sunbeam.dac.test;

import java.util.Scanner;

class Book{
	private String title;
	private float price;
	private int pageCount;
	public Book() {
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Title		:	");
		this.title = sc.nextLine();
		System.out.print("Price		:	");
		this.price = sc.nextFloat();
		System.out.print("Page Count	:	");
		this.pageCount = sc.nextInt();
	}
	public void printRecord() {
		System.out.println("Title		:	"+this.title);
		System.out.println("Price		:	"+this.price);
		System.out.println("Page Count	:	"+this.pageCount);
	}	
}
class Tape{
	private String title;
	private float price;
	private int playTime;
	public Tape() {
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Title		:	");
		this.title = sc.nextLine();
		System.out.print("Price		:	");
		this.price = sc.nextFloat();
		System.out.print("Play Time	:	");
		this.playTime = sc.nextInt();
	}
	public void printRecord() {
		System.out.println("Title		:	"+this.title);
		System.out.println("Price		:	"+this.price);
		System.out.println("Play Time	:	"+this.playTime);
	}	
}
public class Program {
	public static void main(String[] args) {
		Tape tape = new Tape();
		tape.acceptRecord( );
		tape.printRecord( );
	}
	public static void main1(String[] args) {
		Book book = new Book();
		book.acceptRecord( );
		book.printRecord( );
	}
}
