package MethodsToPrintException;

// 2) toString() or System.out.println(e)

public class ToString {
	
	public static void main(String[] args) {
		
		try 
		{ 
	        System.out.println("Inside the try block");    
	        int data=25/0;    
	    }     
	      catch(ArithmeticException e){ 
	//    	System.out.println(e);
	    	System.out.println(e.toString());  
	      }  
	}
}
