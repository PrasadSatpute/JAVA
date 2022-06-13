package Throw;

public class DivideMethodException {
	
	void divide()
	{
		int a=100,b=0,c;
		c=a/b; //exception
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		DivideMethodException t = new DivideMethodException();
		t.divide();		
	}
}
