package ExceptionHandlingWithMethodOverriding;

import java.io.IOException;

public class Child extends Parent {
	
	void msg() throws IOException
	{
		System.out.println("Child Method");
	}

}
