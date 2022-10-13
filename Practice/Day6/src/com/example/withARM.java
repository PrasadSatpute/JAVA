/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class withARM {
    public static void main(String[] args) throws IOException {
        try(FileInputStream inputStream  = new FileInputStream(new File("Data.txt"));)
        {
            Scanner sc = new Scanner(inputStream);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("File not Found");
        }
    }
}
