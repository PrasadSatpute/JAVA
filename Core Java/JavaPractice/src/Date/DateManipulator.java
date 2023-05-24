package Date;

import java.util.Calendar;
import java.util.Date;

public class DateManipulator {

	public static void main(String[] args) {
		
		DateManipulator dm = new DateManipulator();
        Date curDate = new Date();
        System.out.println("Current date is "+curDate);
         
        Date after5Days = dm.addDays(curDate,5);
        System.out.println("Date after 5 days is "+after5Days);
         
        Date before5Days = dm.addDays(curDate,-5);
        System.out.println("Date before 5 days is "+before5Days);
         
        Date after5Months = dm.addMonths(curDate,5);
        System.out.println("Date after 5 months is "+after5Months);
         
        Date after5Years = dm.addYears(curDate,5);
        System.out.println("Date after 5 years is "+after5Years);

	}
	
	// Add days to a date in Java
    public Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
     
  // Add months to a date in Java
    public Date addMonths(Date date, int months) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, months);
        return cal.getTime();
    }
     
  // Add years to a date in Java
    public Date addYears(Date date, int years) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, years);
        return cal.getTime();
    }
}
