package org.sunbeam.file.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {
	public static void main(String[] args) {
		Path path = Paths.get("/Users/sandeepkulange/Desktop/Java8/ReadMe.txt");
		System.out.println("File Name	:	"+path.getFileName());
		System.out.println("Parent		:	"+path.getParent());
		System.out.println("File System	:	"+path.getFileSystem());
		System.out.println("Seperator	:	"+path.getFileSystem().getSeparator());
	}
	public static void main2(String[] args) {
		Path path = Paths.get("/Users/sandeepkulange/Desktop/Java8","ReadMe.txt");
		System.out.println("File Name	:	"+path.getFileName());
		System.out.println("Parent		:	"+path.getParent());
		System.out.println("File System	:	"+path.getFileSystem());
		System.out.println("Seperator	:	"+path.getFileSystem().getSeparator());
	}
	public static void main1(String[] args) {
		Path path = Paths.get("/Users/sandeepkulange/Desktop", "Java8", "ReadMe.txt");
		System.out.println("File Name	:	"+path.getFileName());
		System.out.println("Parent		:	"+path.getParent());
		System.out.println("File System	:	"+path.getFileSystem());
		System.out.println("Seperator	:	"+path.getFileSystem().getSeparator());
	}	
}
