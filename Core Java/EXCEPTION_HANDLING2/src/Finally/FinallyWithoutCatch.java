package Finally;

//finally block without catch block with exception

public class FinallyWithoutCatch {
	
public static void main(String[] args) {
		
		try
		{
			int []a = new int[5];
			a[6]=20;
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e);
//		}
		
		finally
		{
			System.out.println("In finally block");
		}
	}


}
