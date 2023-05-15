package org.sunbeam.dac;
public class Program {
	private static int getHashCode(int data) {	//Hash Function / Method
		int prime = 101;
		int result = 1;
		result = result * data + prime * data;	//It generates, logical integer number
		return result;
	}
	public static final int SIZE = 5;
	public static void main(String[] args) {
		for( int count = 1; count <= 100; ++ count ) {
			int data = count;
			int hashCode = getHashCode( data );
			int slot =  hashCode % SIZE;
			System.out.println(data+"	"+hashCode+"	"+slot);
		}
	}	
	public static void main1(String[] args) {
		int data = 123;
		int hashCode = getHashCode( data );
		System.out.println(data+"	"+hashCode);	//123	12546
	}	
}
