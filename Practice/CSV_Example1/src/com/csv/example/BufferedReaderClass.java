/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csv.example;


import java.io.*;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderClass {
    


  public static void main(String[] args) {
    String line = "";
    String splitBy = ",";
    try {
      //parsing a CSV file into BufferedReader class constructor  
      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\AVENGER'S\\Documents\\NetBeansProjects\\CSV_Example1\\src\\com\\csv\\example\\Data.csv"));
      while ((line = br.readLine()) != null)
      //returns a Boolean value  
      {
        String[] employee = line.split(splitBy);
        //use comma as separator  
        System.out.println("First Name=" + employee[1] + ", Last Name=" + employee[2] + ", Contact=" + employee[3] + ", City= " + employee[4]);
      }
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
}