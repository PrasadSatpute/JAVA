package org.sunbeam.file.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("/Users/sandeepkulange/Desktop", "Java8", "ReadMe.txt");
			Files.delete(path);
			System.out.println("File is deleted.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) {
		try {
			Path path = Paths.get("/Users/sandeepkulange/Desktop", "Java8", "ReadMe.txt");
			Files.createFile(path);
			System.out.println("File is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try {
			Path path = Paths.get("/Users/sandeepkulange/Desktop", "Java8");
			Files.createDirectory(path);
			System.out.println("Directory is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
