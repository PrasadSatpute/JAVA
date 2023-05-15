package palindromicdates;
public class PalindromDate{
	
	
	static void reversYear(int year) {
		
		int temp = year;
        int revYear = 0;
        int r = 0;
		
		while(temp != 0) {
			r = temp % 10;
	        revYear = (revYear * 10) + r;
	        temp = temp / 10;
		}
		
        System.out.println("Revers Year : "+revYear);
        
        String stringrevYear = Integer.toString(revYear);
        
        System.out.println("Revers String : "+stringrevYear);
    }
	
	
	
	public static void main(String[] args) {
		
		int palindromDayCount = 0;

	    // year to be checked
	    int year = 2021;
	    boolean leap = false;
	    
	    

	    while(palindromDayCount < 20) {
	    
	    	// if the year is divided by 4
		    if (year % 4 == 0) {

		      // if the year is century
		      if (year % 100 == 0) {

		        // if year is divided by 400
		        // then it is a leap year
		        if (year % 400 == 0) {
		        	leap = true;
			        palindromDayCount ++;year++;
			        PalindromDate.reversYear(year);
			        
		        }
		        else {
		        	leap = false;
			        year++;
		        }
		      }
		      
		      // if the year is not century
		      else {
		    	  leap = true;
		    	  palindromDayCount ++;year++;
		    	  PalindromDate.reversYear(year);
		      }
		        
		    }
		    
		    else {
		    	leap = false;
		        year++;
		    }

		    if (leap) {
		    	System.out.println(year + " is a leap year.");
		    	System.out.println(palindromDayCount);
		    }
		    else
		      System.out.println(year + " is not a leap year.");
	    	
	    }
	  }
}