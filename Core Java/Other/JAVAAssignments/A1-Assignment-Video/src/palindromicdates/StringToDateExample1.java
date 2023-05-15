package palindromicdates;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;  
import java.time.LocalDate;
public class StringToDateExample1 {  
public static void main(String[] args)throws Exception {  
      int yearNow = LocalDate.now().getYear();
      ArrayList<Date> dateArray =new ArrayList<Date>();
      StringToDateExample1  obj = new StringToDateExample1(); 
      for(int year = yearNow; dateArray.size() < 10; year++ ){
        String reverseYear =  new StringBuilder(String.valueOf(year)).reverse().toString();
        
         String dateString = reverseYear + String.valueOf(year);

         if(obj.isValidDate(dateString)){
        	 System.out.println(dateString);
                 dateArray.add(new SimpleDateFormat("ddMMyyyy").parse(dateString));
         }
     }
}  

Boolean isValidDate(String sDate1){ 
    SimpleDateFormat date1=new SimpleDateFormat("ddMMyyyy");
    date1.setLenient(false);
    try {
      date1.parse(sDate1);  
      return true;
    } catch(Exception e){
      return false;
   }
 }
}