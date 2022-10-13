/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment4;

public class Assignment4 {
    
    public static void main(String[] args) {
        
        Student[] std = new Student[2];	//Array of references
        for( int index = 0; index < std.length; ++index ){
        std[ index ] = new Student();
    }
    	
    for( int index = 0; index < std.length; index++ ){
            std[index].acceptRecord();
        }
    
        System.out.println("List All Array of Students");
        
    for( int index = 0; index < std.length; index++ ){
            std[index].printRecord();
        }
        
    }
	
}
