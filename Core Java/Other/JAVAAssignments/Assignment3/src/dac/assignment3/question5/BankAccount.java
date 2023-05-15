package dac.assignment3.question5;

import java.util.Scanner;

class  FixDeposit
{
	
	
	 double depositAmount;
	 int year;
	 
	 public void getAmount()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Deposit Amount : ");
		 double amount = sc.nextDouble();
		 depositAmount = amount;
		 
		 System.out.println("Enter Year for Investment : ");
		 year = sc.nextInt();
	 }
	 
	 public double calculateCompundInterest()
	 {
		int rate;
		if(depositAmount < 2000)
		{
			rate = 5;
			return compoundInterest(rate);
		}
		else
		{
			return 0.0;
		}
	 }
	 
	 public double compoundInterest(int rate)
	 {
		 return (depositAmount * Math.pow(1 + (rate/100), year));
	 }
	 
	 public void printCompundIterst() {
		
		 System.out.println("Compound Interest : "+calculateCompundInterest());
		 
	}
}


public class BankAccount {
	
	public static void main(String[] args) {
		
		FixDeposit FD = new FixDeposit();
		FD.getAmount();
		FD.printCompundIterst();
		
	}

}
