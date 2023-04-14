package interview.Cognizant;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartingWith1 {
	
	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(10,13,8,49,17,96,31);
		arrayList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);;
	}

}
