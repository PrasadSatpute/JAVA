/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;

public class TestThrow2 {
    
    public static void readingFile()throws FileNotFoundException, IOException{
        String datafile;
        FileReader file = new FileReader("./Data");
        BufferedReader fileinput = new BufferedReader(file);
        datafile = fileinput.readLine();
        throw new FileNotFoundException();
    }
    
    public static void main(String[] args){
        try {
            readingFile();
        } catch (IOException ex) {
            Logger.getLogger(TestThrow2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
