package org.sunbeam.test;

import java.util.Arrays;
import java.util.Scanner;

interface Collection{
	void acceptRecord( );
	int[] toArray( );
	public void printRecord( );
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
	public void printRecord() {
		for( int index = 0; index < arr.length; ++ index ) 
			System.out.println(this.arr[ index ] );
	}
}
public class Program {
	public static void main(String[] args) {
		Collection c = new Array( 5 );	//Upcasting
		
		c.acceptRecord();
		
		c.printRecord();
	}
}
