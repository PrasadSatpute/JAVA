package org.sunbeam.dac;
public class Program {
	private static int binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length  - 1;
		while( left <= right ) {
			int mid = ( left + right ) / 2;
			if( arr[ mid ] == key  )
				return mid;
			else if( key > arr[ mid ] )
				left = mid + 1;
			else
				right = mid - 1;
		}	
		return -1;
	}
	public static void main(String[] args) {
		int key = 40;
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int index = Program.binarySearch( arr, key );
		if( index == - 1 )
			System.out.println(key+" not found.");
		else
			System.out.println(key+" found at index : "+index);
	}
}
