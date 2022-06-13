package MultipleTryCatch;

public class MultipleCatchBlock1 {  
	  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[1]=30/0;    //exception occurs
               }    
   
           catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
           
           catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
           
           catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
           
           System.out.println("rest of the code");    
    }  
}  