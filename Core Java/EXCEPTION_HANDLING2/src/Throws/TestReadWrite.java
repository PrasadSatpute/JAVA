package Throws;

import java.io.FileNotFoundException;

public class TestReadWrite {
	
	public static void main(String[] args) {
		
		ReadWrite rw = new ReadWrite();
		
		try {
			rw.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			rw.saveFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of code");
	
	} 
}
