package Throws;

public class ThrowsWithUnchecked {
	
	static void length() throws NullPointerException
	{
		String s=null;
		System.out.println(s.length());
	}
	
	public static void main(String[] args) {
		
		ThrowsWithUnchecked.length();
		
	}
	
 }
