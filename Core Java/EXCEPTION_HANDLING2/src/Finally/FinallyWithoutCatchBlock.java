package Finally;

//finally block without catch block without exception

public class FinallyWithoutCatchBlock {

public static void main(String[] args) {
		
		try
		{
			int []a = new int[5];
			a[3]=20;
			System.out.println(a[3]);
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
