package Finally;

//finally block without exception

public class FinallyWithoutException {
	
	public static void main(String[] args) {
		
		try
		{
			int []a = new int[5];
			a[3]=20;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("In finally block");
		}
		
	}

}
