package command_line_arguments;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		
		int add = 0;
		
		if(num != 0)
		{
			add = add + (num % 10);
			num = num/10;
			
			if(num != 0)
			{
				add = add + (num % 10);
				num = num/10;
				
				if(num != 0)
				{
					add = add + (num % 10);
					num = num/10;
					
					if(num != 0)
					{
						add = add + (num % 10);
						num = num/10;
					}
				}
			}
		}
		
		System.out.println("Sum of Digits : "+add);

	}

}
