package Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWrite {
	
	
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}

	
	void saveFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	
}
