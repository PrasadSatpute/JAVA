package MethodsToPrintException;

//1) printStackTrace()

public class StackTrace {
	
	public static void main(String[] args) {
		
		try 
		{ 
	        System.out.println("Inside the try block");    
	        int data=25/0;    
	    }     
	      catch(ArithmeticException e){  
	    	e.printStackTrace();  
	      }  	
	}
}
