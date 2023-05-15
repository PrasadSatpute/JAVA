package dac.assignment4.question1;

public class Program {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		
		for(int i = arr.length; i >= 1; i--) {
			
			for(int j = i; j >= 1; j--) {
				
				System.out.print(" "+j+" ");
				
			}
			
			System.out.println();
			
		}

	}

}
