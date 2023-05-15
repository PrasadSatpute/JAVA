package org.sunbeam.dac.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	public static String toString( long lastModified ) {
		return new SimpleDateFormat("dd MMMM,yyyy").format(new Date(lastModified));
	}
	private static void printFileInfo(File file) {
		if( file != null ) {
			System.out.println("Name		:	"+file.getName());
			System.out.println("Parent		:	"+file.getParent());
			System.out.println("Length		:	"+file.length());
			System.out.println("Last Modified	:	"+Program.toString(file.lastModified()));
		}
	}
	private static void printDirectoryInfo(File file) {
		if( file != null ) {
			File[] fileReferences = file.listFiles();
			for (File fileRef : fileReferences) {
				System.out.println(fileRef.getName());
			}
		}
	}
	public static void main(String[] args) {
		//String pathname = "/Users/sandeepkulange/SunBeam/Full-Time/DAC/oopswithjava/Day1/ReadMe.md";
		String pathname = "/Users/sandeepkulange/SunBeam/Full-Time/DAC/oopswithjava/Day1";
		File file = new File( pathname );
		if( file.exists()) {
			if( file.isDirectory()) {
				Program.printDirectoryInfo( file );
			}else {
				Program.printFileInfo( file );
			}
		}else
			System.out.println(pathname+" does not exist");
	}
}
