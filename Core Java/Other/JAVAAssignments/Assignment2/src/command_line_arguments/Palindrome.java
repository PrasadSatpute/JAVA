package command_line_arguments;

public class Palindrome {

	public static void main(String[] args) {
		
		long Number = Long.parseLong(args[0]);
		
		long org = Number;
		
			long revers = 0;
			
			long temp ;
			
			if(Number != 0)
			{
				temp = Number % 10;
				revers = (revers * 10) + temp;
				Number = Number / 10;
				
				if(Number != 0)
				{
					temp = Number % 10;
					revers = (revers * 10) + temp;
					Number = Number / 10;
					
					if(Number != 0)
					{
						temp = Number % 10;
						revers = (revers * 10) + temp;
						Number = Number / 10;
						
						if(Number != 0)
						{
							temp = Number % 10;
							revers = (revers * 10) + temp;
							Number = Number / 10;
						}
					}
				}
			}
			
			if(revers == org)
			{
				System.out.println("Palindrome");
			}
			
			if(revers != org)
			{
				System.out.println("Not Palindrome");
			}

	}

}
