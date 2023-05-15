package org.sunbeam.function.test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50 );
		list.forEach( System.out::println );
	}
	public static void main4(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50 );
		//void accept(T t)
		Consumer<Integer> action = System.out::println;
		list.forEach( action );
	}
	public static void main3(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50 );
		//Implicit Iteration
		
		//void accept(T t)
		//Consumer<Integer> action = ( Integer number)->System.out.println( number );
		//Consumer<Integer> action = ( number)->System.out.println( number );
		//Consumer<Integer> action = number->System.out.println( number );
		//list.forEach( action );
		
		list.forEach( number->System.out.println( number ) );
	}
	public static void main2(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50 );
		//Explicit Iteration
		for( Integer element : list )
			System.out.println(element);
	}
	public static void main1(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50 );
		for( int index = 0; index < list.size(); ++ index )
			System.out.println(list.get(index));
	}
}
