package org.sunbeam.dac.test;

class Person{
	String name;	//null
	int age;		//0
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showRecord( /*Person this = p */) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}
public class Program {
	public static void main(String[] args) {
		Person p = new Person( "Sandeep", 37 );
		p.showRecord( );
	}
	public static void main1(String[] args) {
		Person p = new Person( );
		p.showRecord( );
	}
}
