package org.sunbeam.dac.test;

import java.util.Iterator;
//Top Level class
class LinkedList implements Iterable<Integer>{
	//Static Nested class
	private static class Node{
		int data;
		Node next;
		public Node( int data ) {
			this.data = data;
		}
	}
	
	private Node head;
	private Node tail;
	public boolean empty( ) {
		return this.head == null;
	}
	public void addLast( int data ) {
		Node newNode = new Node( data );
		if( this.empty())
			this.head = newNode;
		else
			this.tail.next = newNode;
		this.tail = newNode;
	}
	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> itr = new LinkedListIterator( this.head );	//Upcasting
		return itr;
	}
	//Non static Nested class / Inner class
	public class LinkedListIterator implements Iterator<Integer>{
		private Node trav;	//null
		public LinkedListIterator(Node head) {
			this.trav = head;
		}
		@Override
		public boolean hasNext() {
			if(  trav != null )
				return true;
			return false;
		}
		@Override
		public Integer next() {
			int data = trav.data;
			trav = trav.next;
			return data;
		}
	}
}
public class Program {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		
		for( int element : list )
			System.out.println(element);
		
		/* Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext()) {
			element = itr.next();
			System.out.println(element);
		} */
	}
}
