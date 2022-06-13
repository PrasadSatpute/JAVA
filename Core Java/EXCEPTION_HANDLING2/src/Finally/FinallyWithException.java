package Finally;

//finally block with exception

public class FinallyWithException {
	
public static void main(String[] args) {
		
		try
		{
			System.exit(0);
			int []a = new int[5];
			a[6]=20; 
			System.out.println("Hey");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("In finally block");
		}
	}
}
