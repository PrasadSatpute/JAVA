package org.sunbeam.dac.test;

//Top Level class
class LinkedList{	//LinkedList.class
	//Nested class	=> Encapsulation
	class Node{		//LinkedList$Node.class
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
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if( this.empty()) {
			this.head = newNode;
			this.tail = newNode;
		}else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
	}
	public void printList() {
		Node trav = this.head;
		while( trav != null ) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}
}
public class Program {
	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
		 list.addLast( 10 );
		 list.addLast( 20 );
		 list.addLast( 30 );
		 
		 list.printList( );
	}
}
