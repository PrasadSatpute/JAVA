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
	public static final String pathname = "/Users/sandeepkulange/SunBeam/Full-Time/DAC/oopswithjava/Day18/Day_18.12/src/org/sunbeam/dac/test/Program.java";

	private static void readRecord() throws Exception {
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(pathname)))) {
			String line = null;
			while ((line = reader.readLine()) != null)
				System.out.println(line);
		}
	}
	public static void main(String[] args) {
		try {
			Program.readRecord();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
