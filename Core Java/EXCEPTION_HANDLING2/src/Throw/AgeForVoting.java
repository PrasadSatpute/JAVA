package Throw;

public class AgeForVoting {
	
	public static void main(String[] args)   {
		
		int age=16;
		
		if(age<18)
		{
			throw new AgeException("Not eligible to vote");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
		
		System.out.println("End of code");
	}
}
