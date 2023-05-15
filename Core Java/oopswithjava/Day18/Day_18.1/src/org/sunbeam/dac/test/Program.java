package org.sunbeam.dac.test;

import java.io.File;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String pathname = "SunBeam";
		File file = new File(pathname);
		if( file.exists())
			file.delete();
		else
			System.out.println(pathname+"does not exist");
	}
	public static void main3(String[] args) {
		String pathname = "SunBeam";
		File file = new File(pathname);
		boolean fileCreationStatus = file.mkdir();
		if( fileCreationStatus )
			System.out.println("Directory is created.");
	}
	public static void main2(String[] args) {
		String pathname = "File.txt";
		File file = new File(pathname);
		if( file.exists())
			file.delete();
		else
			System.out.println(pathname+"does not exist");
	}
	public static void main1(String[] args) {
		try {
			String pathname = "File.txt";
			File file = new File(pathname);
			boolean fileCreationStatus = file.createNewFile();
			if( fileCreationStatus )
				System.out.println("File is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
