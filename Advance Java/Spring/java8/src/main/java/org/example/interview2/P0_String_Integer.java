package org.example.interview2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class P0_String_Integer {
    public static void main(String[] args) {
        String name = "Prasad";

        System.out.println("In char Array");
        char[] charName = name.toCharArray();
        System.out.println(charName);

        System.out.println("Print each char in Next line");
        name
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
