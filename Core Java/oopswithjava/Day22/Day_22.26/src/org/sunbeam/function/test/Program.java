package org.sunbeam.function.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15, 12, 14 );

 		Stream<Integer> stream = list.stream();
 		stream.distinct().forEach(System.out::println);	//OK
 		
 		stream.distinct().forEach(System.out::println); //IllegalStateException
		
	}
	public static void main3(String[] args) {
		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15, 12, 14 );

		List<Integer> intList = list.stream()
		.distinct()
		.collect( Collectors.toList());
		
		intList.forEach(System.out::println);
	}
	public static void main2(String[] args) {
		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15, 12, 14 );
		
		//list.stream().forEach(System.out::println);	//OK

		//boolean test(T t)

		/* list.stream()
		.filter( number ->  number % 2 == 0 )
		.forEach(System.out::println); */
		
		/* list.stream()
		.filter( number ->  number % 2 == 0 )
		.distinct()
		.forEach(System.out::println); */
		
		/* list.stream()
		.distinct()
		.limit(3)
		.forEach(System.out::println); */
		
		/* list.stream()
		.distinct()
		.skip(2)
		.forEach(System.out::println); */
		
		/* list.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println); */
		
		//long count = list.stream().count();	//7
		long count = list.stream().distinct().count(); //5
		System.out.println(count);
	}
	public static void main1(String[] args) {
		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15, 12, 14 );
		
		Set<Integer> set = new TreeSet<Integer>( list );
		for( Integer element : set ) {
			if( element % 2 == 0 )
				System.out.println(element);
		}
	}
}
