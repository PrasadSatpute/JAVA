package ExceptionHandlingWithMethodOverriding;

public class ParentChildTest {
	
	public static void main(String[] args) {
		
		Child p = new Child();
		p.msg();
		
	}

}


//Rule1: If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception.