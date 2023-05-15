package org.sunbeam.function.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Dish {
	// Nested Type
	public enum Type {
		MEAT, FISH, OTHER
	}

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", type=" + type + "]";
	}
}

public class Program {
	public static List<Dish> getMenuList() {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		return menu;
	}

	public static void main(String[] args) {
 		List<Dish> menu = Program.getMenuList();
 		
 		//Integer calories = menu.stream()
 		Integer calories = menu.parallelStream()
 		.map(Dish::getCalories)
 		.reduce(0, Integer::sum);
 		
 		System.out.println("Calories	:	"+calories);
	}
	public static void main4(String[] args) {
		Stream<Integer> numbers = Stream.of(3,4,5,1,2);
		//Optional<Integer> min = numbers.reduce( Integer::min );
		Optional<Integer> min = numbers.reduce( Integer::min );
		System.out.println("Min	:	"+min.get());	
	}
	
	public static void main3(String[] args) {
		Stream<Integer> numbers = Stream.of(3,4,5,1,2);
		int max =  numbers.reduce( 0, Integer::max );
		System.out.println("Max	:	"+max);	
	}
	public static void main2(String[] args) {
		Stream<Integer> numbers = Stream.of(3,4,5,1,2);
		int sum =  numbers.reduce( 0, Integer::sum );
		System.out.println("Sum	:	"+sum);	
	}
	public static void main1(String[] args) {
		Stream<Integer> numbers = Stream.of(3,4,5,1,2);
		int sum =  numbers.reduce( 0, ( num1, num2 ) -> num1 + num2 );
		System.out.println("Sum	:	"+sum);	
	}
}
