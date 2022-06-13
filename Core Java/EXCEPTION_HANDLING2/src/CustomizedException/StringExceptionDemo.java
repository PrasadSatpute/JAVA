package CustomizedException;

import java.util.Scanner;

public class StringExceptionDemo {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String:");
			String str = sc.nextLine();
			
			try {
			if(str.equalsIgnoreCase("Mumbai"))
				System.out.println("Strings matched");
			else
				throw new StringException("String mismatched");
			}
			catch(StringException se)
			{
				System.out.println("Prints the exception: "+se);
			}
	}
}
