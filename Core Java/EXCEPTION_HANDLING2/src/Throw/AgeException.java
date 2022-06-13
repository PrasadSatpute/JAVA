package Throw;

//creating a user defined class

public class AgeException extends RuntimeException{
	
	AgeException(String msg)
	{
		super(msg);
	}
}
