/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csv.example;

import java.io. * ;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\AVENGER'S\\Documents\\NetBeansProjects\\CSV_Example1\\src\\com\\csv\\example\\Data.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScannerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        //parsing a CSV file into the constructor of Scanner class 
        sc.useDelimiter(",");
        //setting comma as delimiter pattern
        while (sc.hasNext()) {
          System.out.print(sc.next());
        }
        sc.close();
        //closes the scanner
    }
}
