package org.sunbeam.dac;
public class Program {
	private static int linearSearch(int[] arr, int key) {
		for( int index = 0; index < arr.length; ++ index ) {
			if( arr[ index ] == key )
				return index;
		}
		return -1;
	}
	public static void main(String[] args) {
		int key = 10;
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int index = Program.linearSearch( arr, key );
		if( index == - 1 )
			System.out.println(key+" not found.");
		else
			System.out.println(key+" found at index : "+index);
	}
}
