package ExceptionHandlingWithMethodOverriding3;

//If the superclass method declares an exception

//Example in case subclass overridden method declares parent exception

//Rule 1: If the superclass method declares an exception,
//subclass overridden method can declare the same subclass exception or no exception but cannot declare parent exception.

class Parent{   
	  
	  // defining the method   
	  void msg() throws ArithmeticException {  
	    System.out.println("parent method");  
	  }    
}    
	    
