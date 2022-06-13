package ExceptionHandlingWithMethodOverriding;

//If the superclass method does not declare an exception

//Rule1: If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception.

class Parent{   
	  
	  // defining the method   
	  void msg() {  
	    System.out.println("parent method");  
	  }    
}    
	    
