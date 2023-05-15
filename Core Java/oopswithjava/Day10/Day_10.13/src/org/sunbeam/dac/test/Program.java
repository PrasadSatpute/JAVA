package org.sunbeam.dac.test;

import java.util.Scanner;

class Book{
	private String title;
	private float price;
	private int pageCount;
	public Book() {
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
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}
class Tape{
	private String title;
	private float price;
	private int playTime;
	public Tape() {
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
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
}
public class Program {
	private static Scanner sc = new Scanner( System.in );
	public static void main(String[] args) {
		Tape tape = new Tape();
		
		System.out.print("Title		:	");
		tape.setTitle(sc.nextLine());
		System.out.print("Price		:	");
		tape.setPrice(sc.nextFloat());
		System.out.print("Play Time	:	");
		tape.setPlayTime(sc.nextInt());
		
		System.out.println("Tile		:	"+tape.getTitle());
		System.out.println("Price		:	"+tape.getPrice());
		System.out.println("Play Time	:	"+tape.getPlayTime());
	}
	public static void main1(String[] args) {
		Book book = new Book();
		
		System.out.print("Title		:	");
		book.setTitle(sc.nextLine());
		System.out.print("Price		:	");
		book.setPrice(sc.nextFloat());
		System.out.print("Page Count	:	");
		book.setPageCount(sc.nextInt());
		
		System.out.println("Tile		:	"+book.getTitle());
		System.out.println("Price		:	"+book.getPrice());
		System.out.println("Page Count	:	"+book.getPageCount());
	}
}
