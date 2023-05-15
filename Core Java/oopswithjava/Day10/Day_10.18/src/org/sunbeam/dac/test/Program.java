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
class ProductFactory{
	public static Product getInstance( int choice ) {	//Factory method
		switch( choice ) {
		case 1:	return new Book( );
		case 2:	return new Tape( );
		}
		return null;
	}
	/* public static Product getInstance( int choice ) {
		Product product = null;
		switch( choice ) {
		case 1:
			product = new Book( );	//Upcasting
			break;
		case 2:
			product = new Tape( );	//Upcasting
			break;
		}
		return product;
	} */
}
class ProductTest{
	private static Scanner sc = new Scanner( System.in );
	private Product product;	//null
	public void setProduct(Product product) {
		this.product = product;
	}
	public void acceptRecord( ) {
		if( this.product != null ) {
			System.out.print("Title		:	");
			sc.nextLine();
			product.setTitle(sc.nextLine());
			System.out.print("Price		:	");
			product.setPrice(sc.nextFloat());
			if( product instanceof Book  ) {
				Book book = (Book) product;	//Doncasting
				System.out.print("Page Count		:	");
				book.setPageCount(sc.nextInt());
			}else {
				Tape tape = (Tape) product;//Doncasting
				System.out.print("Play Time		:	");
				tape.setPlayTime(sc.nextInt());
			}
		}
	}
	public void printRecord( ) {
		if( this.product != null ) {
			System.out.println("Title		:	"+product.getTitle());
			System.out.println("Price		:	"+product.getPrice());
			if( product instanceof Book  ) {
				Book book = (Book) product;	//Doncasting
				System.out.println("Page Count		:	"+book.getPageCount());
			}else {
				Tape tape = (Tape) product;//Doncasting
				System.out.println("Play Time		:	"+tape.getPlayTime());
			}
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Book");
		System.out.println("2.Tape");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}

public class Program {
	public static void main(String[] args) {
		int choice;
		ProductTest test = new ProductTest(); 
		while( ( choice = ProductTest.menuList( ) ) != 0 ) {
			test.setProduct(ProductFactory.getInstance(choice));
			test.acceptRecord();
			test.printRecord();
		}
	}
}
