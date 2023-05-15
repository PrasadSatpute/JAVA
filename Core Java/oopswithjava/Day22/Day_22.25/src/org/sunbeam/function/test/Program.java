package org.sunbeam.function.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
 		Stream<Integer> s = list.stream();
	}

	public static void main2(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		IntStream stream = Arrays.stream(arr);
	}

	public static void main1(String[] args) {
		Stream<Integer> intStream = Stream.of(10, 20, 30, 40, 50);

		Stream<String> stringStream = Stream.of("DAC", "KDAC", "DMC", "DESD", "DBDA");
	}
}
