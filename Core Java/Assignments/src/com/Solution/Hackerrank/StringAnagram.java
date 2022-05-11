package com.Solution.Hackerrank;

import java.util.Arrays;

class Student{  
int rollno;  
String name;  
float fee;  

    public Student() {
        this(113,"ankita",6000f);
        System.out.println("CALL CUNSTRUCTOR");
    }

Student(int rollno,String name,float fee){  
    //this(); //Calling default constructor from parameterized constructor:
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  

public class StringAnagram {
    
     public static void main (String [] args) {  
        String str1="Brag";  
        String str2="Grab";  
        
        Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display(); 
        
  
        
        //Converting both the string to lower case.  
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
  
        //Checking for the length of strings  
        if (str1.length() != str2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
            //Converting both the arrays to character array  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
  
            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(string1);
            System.out.println(string1);
            Arrays.sort(string2);
            System.out.println(string2);
  
            //Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
    }  
}
