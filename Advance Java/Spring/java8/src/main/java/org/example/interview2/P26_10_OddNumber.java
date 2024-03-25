package org.example.interview2;
import java.util.stream.Stream;
public class P26_10_OddNumber {
    public static void main(String[] args) {
        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
    }
}
