package org.sunbeam.test;

import java.util.Arrays;
import java.util.Scanner;

interface Collection{
	void acceptRecord( );
	int[] toArray( );
	public void printRecord( );
	static void swap( int[] arr ) {	//Utility / Helper method
		int temp = arr[ 0 ];
		arr[ 0 ] = arr [ 1 ];
		arr[ 1 ]  = temp;
	}
	default void sort( ) {
		int[] arr = this.toArray();
		for( int i = 0; i < arr.length - 1; ++ i ) {
			for( int j = i + 1; j < arr.length; ++ j ) {
				if( arr[ i ] > arr[ j ] ) {
					int[] temp = new int[ ] { arr[ i ], arr[ j ] };
					Collection.swap(temp);
					arr[ i ] = temp[ 0 ]; arr[ j ] = temp[ 1 ];
				}
			}
		}
	}
}

class Array implements Collection{
	private int[] arr;
	public Array() {
		this( 5 );
	}
	public Array( int length ) throws IllegalArgumentException{
		if( length <= 0 )
			throw new IllegalArgumentException("Invalid array size ");
		this.arr = new int[ length ];
	}
	@Override
	public void acceptRecord() {
		try( Scanner sc = new Scanner(System.in)){
			for( int index = 0; index < arr.length; ++ index ) {
				System.out.print("Enter element	:	");
				this.arr[ index ] = sc.nextInt();
			}
		}
	}
	@Override
	public int[] toArray() {
		return this.arr;
		//return Arrays.copyOf(this.arr, this.arr.length); //defensive copy
	}
	@Override
	public void sort() {
		for( int i = 0; i < arr.length - 1; ++ i ) {
			for( int j = 0; j < arr.length - 1 - i ; ++ j ) {
				if( arr[ j ] > arr[ j + 1 ] ) {
					int[] temp = new int[ ] { arr[ j ], arr[ j + 1 ] };
					Collection.swap(temp);
					arr[ j ] = temp[ 0 ]; arr[ j + 1 ] = temp[ 1 ];
				}
			}
		}
	}
	@Override
	public void printRecord() {
		for( int index = 0; index < arr.length; ++ index ) 
			System.out.print(this.arr[ index ] +"	");
		System.out.println();
	}
}
public class Program {
	public static void main(String[] args) {
		Collection c = new Array( 5 );	//Upcasting
		
		c.acceptRecord();
		
		c.printRecord();
		
		c.sort();
		
		c.printRecord();
	}
}
