
package com.Examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fout=new FileOutputStream("testout.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");
             
             try{    
            FileInputStream fin=new FileInputStream("testout.txt");    
            int i=fin.read();
            System.out.print((char)i);
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
            try {  
                Reader reader = new FileReader("testout.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
    }
}
