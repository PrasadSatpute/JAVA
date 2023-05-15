package command_line_arguments;

public class Reverse_number {

	public static void main(String[] args) {
		
		long Number = Long.parseLong(args[0]);
		
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
		
		System.out.println("Revers : "+revers);
	}

}
