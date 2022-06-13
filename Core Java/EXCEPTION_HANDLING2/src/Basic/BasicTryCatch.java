package Basic;

public class BasicTryCatch {
	
	public static void main(String[] args) {
		
		try {
				int a=10,b=0;
				int c=a/b; //exception
				System.out.println(c);
			}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
	
	}
}
