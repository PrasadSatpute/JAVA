package org.sunbeam.dac.test;
//java.lang.Exception
	//java.lang.InterruptedException

//public static void sleep(long millis)throws InterruptedException
public class Program {
	public static void showRecord( ) {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		Program.showRecord();
	}
	
	public static void displayRecord( ) throws InterruptedException{
		for( int count = 1; count <= 10; ++ count ) {
			System.out.println("Count	:	"+count);
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args){
		try {
			Program.displayRecord();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
