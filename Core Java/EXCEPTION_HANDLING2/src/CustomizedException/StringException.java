package CustomizedException;

public class StringException extends RuntimeException{
	
	public StringException(String str)
	{
		System.out.println(str);
	}

}
