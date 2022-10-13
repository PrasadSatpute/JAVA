/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class TestPerson {
    public static void main(String []args)
    {
        person pObj=new person();
        person pObj2=new person();
        person pObj3=new person("CCC",45);
        pObj.inputData();     //runtime initialization
        pObj.showData();
        
        pObj2.setName("AAA");   //runtime initialization
        pObj2.setAge(25);       //runtime initialization
        
        System.out.println("Name="+pObj2.getName());
        System.out.println("Age="+pObj2.getAge());
        
    }
}