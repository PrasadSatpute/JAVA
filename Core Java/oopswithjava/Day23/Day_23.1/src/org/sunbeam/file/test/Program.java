package org.sunbeam.file.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	private static void printFileInfo(File file) {
		String fileName = file.getName();
		System.out.println("Name		:	"+fileName);
		String parentName = file.getParent();
		System.out.println("Parent		:	"+parentName);
		long size = file.length();
		System.out.println("Size		:	"+size);
		String lastModified = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format(new Date(file.lastModified()));
		System.out.println("Last Modified	:	"+lastModified);
	}
	private static void printDirectoryInfo(File file) {
		File[] arr = file.listFiles();
		for (File fileRef : arr) {
			String lastModified = new SimpleDateFormat("dd/MM/yyyy hh:mm: a").format(new Date(file.lastModified()));
			System.out.println(lastModified+" "+fileRef.getName());
		}
	}
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter path	:	");
			String pathname = sc.nextLine();
			
			File file = new File(pathname);
			if(file.exists()) {
				if( file.isDirectory())
					Program.printDirectoryInfo( file );
				else
					Program.printFileInfo( file );
			}else
				System.out.println(pathname+" does not exist");
			
		}catch( Exception ex ) {
			ex.printStackTrace();
		}
	}	
}
