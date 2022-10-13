import java.time.LocalDate;
import java.util.Arrays;

class Date{
	private int day;
	private int month;
	private int year;
	public Date() {
		          LocalDate ldt = LocalDate.now();
		this.day = ldt.getDayOfMonth();
		this.month = ldt.getMonthValue();
		this.year = ldt.getYear();
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
public class Program {
	public static void main(String[] args) {
		Date[] arr = new Date[ 3 ];	//Array of references
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Date( );
		
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ].toString());
	}
	public static void main3(String[] args) {
		Date[] arr = new Date[ 3 ];	//Array of references
		arr[ 0 ] = new Date( );
		arr[ 1 ] = new Date( );
		arr[ 2 ] = new Date( );
		
	}
	public static void main2(String[] args) {
		Date[] arr = new Date[ 3 ];	//Array of references
		System.out.println(Arrays.toString(arr));	//[null, null, null]
		
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ].toString());
	}
	public static void main1(String[] args) {
		//Date[] arr = null;	//array reference.
		
		/*
			Date dt1 = null;
			Date dt2 = null;
			Date dt3 = null;
		*/
		Date[] arr = new Date[ 3 ];
		System.out.println(arr[ 0 ]);
		System.out.println(arr[ 1 ]);
		System.out.println(arr[ 2 ]);
	}
}