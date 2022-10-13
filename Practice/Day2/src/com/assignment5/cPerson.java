/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5;

import java.util.Scanner;

public class cPerson {
    private String Name;
    private int Age;

    public cPerson() {
        Name = "ABC";
        Age = 21;
    }

    public cPerson(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void inputData(){
        System.out.println("Name    :   ");
        setName(sc.nextLine());
        System.out.println("Age :   ");
        setAge(sc.nextInt());
    }

    
    public void showData() {
        System.out.println("cPerson Name = " + Name + ", Age = " + Age);
    }
    
}
