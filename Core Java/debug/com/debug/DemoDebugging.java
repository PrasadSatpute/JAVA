package debug;

public class DemoDebugging {

	public static void main(String[] args) {

		int first=4;
		int second=6;

		int sum= add(first, second);
		System.out.println("the sum is :"+sum);

	}

	private static int add(int int1, int int2) {
		int sum = int1+int2 ;
		System.out.println("In Add method");
		System.out.println("In Add method2");
		return sum;
	}


}
