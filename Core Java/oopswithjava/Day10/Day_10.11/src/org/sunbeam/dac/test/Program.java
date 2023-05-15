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
	public static void main1(String[] args) {
		Tape tape = new Tape();
		tape.acceptRecord( );
		tape.printRecord( );
	}
	public static void main(String[] args) {
		Book book = new Book();
		book.acceptRecord( );
		book.printRecord( );
	}
}
