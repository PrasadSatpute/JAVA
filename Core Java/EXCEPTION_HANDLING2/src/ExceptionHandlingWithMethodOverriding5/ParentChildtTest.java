package ExceptionHandlingWithMethodOverriding5;

public class ParentChildtTest {
	
	 public static void main(String args[]){    
		   Parent p = new Child();    
		     
		   try {    
		   p.msg();    
		   }  
		   catch(Exception e) {}    
		  }    

}
