package com.Examples.java8Features.Optional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) { 
        String[] str = new String[10]; 
        System.out.print(str); 
        Optional<String>checkNull = Optional.ofNullable(str[5]); 
        if (checkNull.isPresent()) { 
            String word = str[5].toLowerCase(); 
            System.out.print(str); 
         } else
           System.out.println("string is null"); 
    } 
}
