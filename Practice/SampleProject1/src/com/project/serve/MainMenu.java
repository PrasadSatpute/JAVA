/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.serve;
import java.util.Scanner;

public class MainMenu {

    public static Scanner sc = new Scanner(System.in);
    
    public int menu(){
        
        System.out.println("0.Exit  1.Student   2.Teacher   3.Subject   4.Attendance");
        return sc.nextInt();
        
    }
    
    public MainMenu() {
        int choice ;
        while((choice = menu()) != 0)
        {
            switch(choice)
            {
                case 1:
                    StudentMenu studentmenu = new StudentMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please choose correct Option");
            }
        }
        
    }
    
}
