package org.sunbeam.dac.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static final String pathname = "File.txt";
	private static void writeRecord()throws Exception {
		try ( BufferedWriter writer = new BufferedWriter(new FileWriter(new File(pathname)))){
			writer.write("Diploma in advanced computing");
			writer.newLine();
			writer.write("SunBeam institute of information technology");
			writer.newLine();
			writer.write("CDAC ATC");
			writer.newLine();
			writer.write("Pune. 411057");
		}
	}
	private static void readRecord() throws Exception{
		try(BufferedReader reader = new BufferedReader(new FileReader(new File(pathname)))) {
			String line = null;
			while( ( line = reader.readLine( ) ) != null )
				System.out.println(line);
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
			try {
				switch(  choice ) {
				case 1:
					Program.writeRecord( );
					break;
				case 2:
					Program.readRecord( );
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
