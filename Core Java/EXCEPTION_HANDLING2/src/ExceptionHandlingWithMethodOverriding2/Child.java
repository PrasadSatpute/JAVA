package ExceptionHandlingWithMethodOverriding2;

import java.io.IOException;

public class Child extends Parent {
	
	void msg() throws ArithmeticException
	{
		System.out.println("Child Method");
	}

}
