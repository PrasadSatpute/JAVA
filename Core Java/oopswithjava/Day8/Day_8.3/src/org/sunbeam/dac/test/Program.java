package org.sunbeam.dac.test;

import java.util.Scanner;

class Array{
	//private int[] arr = new int[ 5 ];
	private int[] arr;
	public Array() {
		//this.arr = new int[ 5 ];
		this( 5 );	//Constructor Chaining
	}
	public Array( int length ) {
		this.arr = new int[ length  ];
	}
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord( ) {
		for( int index = 0; index < arr.length; ++ index ) {
			System.out.print("Enter element	:	");
			this.arr[ index ] = sc.nextInt();
		}
	}
	public void printRecord( ) {
		for( int element : this.arr )
			System.out.print(element+"	");
		System.out.println();
	}
	public static void close( ) {
		sc.close();
	}
}
public class Program {
	public static void main(String[] args) {
		Array a1 = new Array( );
		
		a1.acceptRecord();
		
		a1.printRecord();
		
		Array.close();
		
	}
}
