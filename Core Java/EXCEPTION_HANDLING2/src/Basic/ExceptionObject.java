package Basic;

// take simple example for exception object

public class ExceptionObject {

	public static void main(String[] args) {
				
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(3);
				int c=10/0; ///exception occurred
				System.out.println(4);
				System.out.println(5);
				System.out.println(6);
			}
		catch(ArithmeticException e)
		{
			System.out.println(7);
			System.out.println(8);
			System.out.println("Cannot divide by zero");
			System.out.println(9);
		}
		System.out.println(10);

		System.out.println();
		
//		String s=null;
//		System.out.println(s.length());
		
	}
	
}
