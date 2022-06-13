package Basic;

public class NullPointer {
	
	public static void main(String[] args) {
		
		System.out.println("1");
		
		try {
			System.out.println("2");
			String s = null;
			System.out.println("3");
			System.out.println(s.length()); //exception occurs
			System.out.println("4");
			System.out.println("5");
		}
		catch(NullPointerException e)
		{
			System.out.println("inside catch block");
			System.out.println(e);
		}
		System.out.println("End of the code");
		

	}

}
