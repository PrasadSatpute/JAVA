package org.sunbeam.dac.test;

import java.util.Scanner;
class Product{
	private String title;
	private float price;
	public Product() {
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
class Book extends Product{
	private int pageCount;
	public Book() {
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}
class Tape extends Product{
	private int playTime;
	public Tape() {
	}
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
}
public class Program {
	private static Scanner sc = new Scanner( System.in );
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Book");
		System.out.println("2.Tape");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	private static void acceptRecord(Book book) {
		System.out.print("Title		:	");
		sc.nextLine();
		book.setTitle(sc.nextLine());
		System.out.print("Price		:	");
		book.setPrice(sc.nextFloat());
		System.out.print("Page Count	:	");
		book.setPageCount(sc.nextInt());
	}
	private static void printRecord(Book book) {
		System.out.println("Tile		:	"+book.getTitle());
		System.out.println("Price		:	"+book.getPrice());
		System.out.println("Page Count	:	"+book.getPageCount());
	}
	private static void acceptRecord(Tape tape) {
		sc.nextLine();
		System.out.print("Title		:	");
		tape.setTitle(sc.nextLine());
		System.out.print("Price		:	");
		tape.setPrice(sc.nextFloat());
		System.out.print("Play Time	:	");
		tape.setPlayTime(sc.nextInt());		
	}
	private static void printRecord(Tape tape) {
		System.out.println("Tile		:	"+tape.getTitle());
		System.out.println("Price		:	"+tape.getPrice());
		System.out.println("Play Time	:	"+tape.getPlayTime());
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Book book = new Book();
				Program.acceptRecord( book );
				Program.printRecord( book );
				break;
			case 2:
				Tape tape = new Tape();
				Program.acceptRecord( tape );
				Program.printRecord( tape );
				break;
			}
		}
	}
	
	public static void main1(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Book book = new Book();
				
				System.out.print("Title		:	");
				sc.nextLine();
				book.setTitle(sc.nextLine());
				System.out.print("Price		:	");
				book.setPrice(sc.nextFloat());
				System.out.print("Page Count	:	");
				book.setPageCount(sc.nextInt());
				
				System.out.println("Tile		:	"+book.getTitle());
				System.out.println("Price		:	"+book.getPrice());
				System.out.println("Page Count	:	"+book.getPageCount());
				break;
			case 2:
				Tape tape = new Tape();
				sc.nextLine();
				System.out.print("Title		:	");
				tape.setTitle(sc.nextLine());
				System.out.print("Price		:	");
				tape.setPrice(sc.nextFloat());
				System.out.print("Play Time	:	");
				tape.setPlayTime(sc.nextInt());
				
				System.out.println("Tile		:	"+tape.getTitle());
				System.out.println("Price		:	"+tape.getPrice());
				System.out.println("Play Time	:	"+tape.getPlayTime());
				break;
			}
		}
	}
}
