package org.sunbeam.dac.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static final String pathname = "File.dat";
	private static void writeRecord() {
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(new File(pathname));
			byte data = 123;
			outputStream.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void readRecord() {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File(pathname));
			int data = inputStream.read();
			System.out.println(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static Scanner sc = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Write Record");
		System.out.println("2.Read Record");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch(  choice ) {
			case 1:
				Program.writeRecord( );
				break;
			case 2:
				Program.readRecord( );
				break;
			}
		}
	}
}
