package ExceptionHandlingWithMethodOverriding3;

import java.io.IOException;

public class Child extends Parent {
	
	void msg() throws Exception
	{
		System.out.println("Child Method");
	}

}
