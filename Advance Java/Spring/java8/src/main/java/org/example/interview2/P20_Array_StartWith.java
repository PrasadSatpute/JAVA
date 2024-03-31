package org.example.interview2;
import java.util.Arrays;
import java.util.List;
public class P20_Array_StartWith {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStrings
                .stream()
                .filter(str -> Character.isDigit(str.charAt(0)))
                .forEach(System.out::println);
    }
}