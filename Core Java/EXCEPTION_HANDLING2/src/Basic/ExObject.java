package Basic;

public class ExObject {

	void divide()
	{
		try {
			int a=100,b=0,c;
			c=a/b;  //exception occurs
			System.out.println(c);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		ExObject e = new ExObject();
		e.divide();
		
	}
}
