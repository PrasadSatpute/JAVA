/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment1;

import java.util.Scanner;

class cVisitor {
    
    Scanner sc = new Scanner(System.in);
    
    static int count = 0;       //static data member of integer kind
    String name = "ABC";            // non-static data member
    int age = 22;                // non-static data member

    public cVisitor() {
    }
    
    
    public void inputData(){            //instance method  
        System.out.println("Enter Name  :   ");
        name=sc.nextLine();
        System.out.println("Enter Age   :   ");
        age=sc.nextInt();
    }
    
    public void showData(){             //instance method
        System.out.println("Name    =   "+name+" Age    =   "+age+" Count   =   "+count);
    }
    public static void TotalCount(){     //class method [static method]
        count++;
        System.out.println("Static Count = "+count);
    }
}

public class TestVisitor {
    public static void main(String[] args) {
        cVisitor obj1 = new cVisitor();
        obj1.inputData();
        obj1.showData();
        cVisitor.TotalCount();
        cVisitor obj2 = new cVisitor();
        obj2.inputData();
        obj2.showData();
        cVisitor.TotalCount();
        cVisitor obj3 = new cVisitor();
        obj3.inputData();
        obj3.showData();
        cVisitor.TotalCount();
        cVisitor obj4 = new cVisitor();
        obj4.inputData();
        obj4.showData();
        cVisitor.TotalCount();
    }
}
