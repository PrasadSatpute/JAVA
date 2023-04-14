package interview;

import java.util.Random;
import java.util.Scanner;

public class FindRandomNumberUserLimit {
	public static void main(String[] args) {
		System.out.println("Enter the Number which you want to Print Random with given Number of Time : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Random random = new Random();
		random.ints(10,99).limit(number).forEach(System.out::println);
	}
}
