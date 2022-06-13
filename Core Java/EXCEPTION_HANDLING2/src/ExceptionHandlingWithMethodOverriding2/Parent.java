package ExceptionHandlingWithMethodOverriding2;

//If the superclass method does not declare an exception

//Rule 1: If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception but can declare unchecked exception.

class Parent{   
	  
	  // defining the method   
	  void msg() {  
	    System.out.println("parent method");  
	  }    
}    
	    
