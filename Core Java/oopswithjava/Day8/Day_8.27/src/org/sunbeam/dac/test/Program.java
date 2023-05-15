package org.sunbeam.dac.test;

import java.util.Scanner;

import org.sunbeam.dac.lib.Address;
import org.sunbeam.dac.lib.Date;
import org.sunbeam.dac.lib.Person;

public class Program {
	private static Scanner sc = new Scanner(System.in); 
	private static void acceptRecord(Date birthDate) {
		System.out.print("Day	:	");
		birthDate.setDay(sc.nextInt());
		System.out.print("Month	:	");
		birthDate.setMonth(sc.nextInt());
		System.out.print("Year	:	");
		birthDate.setYear(sc.nextInt());
	}
	private static void printRecord(Date birthDate) {
		System.out.println(birthDate.getDay()+" / "+birthDate.getMonth()+" / "+birthDate.getYear());
	} 
	private static void acceptRecord(Address currentAddress) {
		System.out.print("City Name	:	");
		currentAddress.setCityName(sc.nextLine());
		System.out.print("State Name	:	");
		currentAddress.setStateName(sc.nextLine());
		System.out.print("Pin Code	:	");
		currentAddress.setPinCode(sc.nextLine());
	}
	private static void printRecord(Address currentAddress) {
		System.out.println(currentAddress.getCityName()+"  "+currentAddress.getStateName()+"  "+currentAddress.getPinCode());
	}
	private static void acceptRecord(Person person) {
		System.out.print("Name	:	");
		person.setName(sc.nextLine());
		
		System.out.println("Birth Date	:	");
		Date birthDate = person.getBirthDate();
		Program.acceptRecord(birthDate);
		
		System.out.println("Current Addres	:	");
		sc.nextLine();
		Address currentAddress = person.getCurrentAddress();
		Program.acceptRecord(currentAddress);
	}
	private static void printRecord(Person person) {
		System.out.println("Name		:	"+person.getName());
		
		Date birthDate = person.getBirthDate();
		System.out.print("Birth Date	:	");
		Program.printRecord(birthDate);
		
		Address currentAddress = person.getCurrentAddress();
		System.out.print("Current Address	:	");
		Program.printRecord(currentAddress);
	}
	public static void main(String[] args) {
		Person person = new Person();
		Program.acceptRecord( person );
		Program.printRecord( person );
	}
	
	public static void main2(String[] args) {
		Address currentAddress = new Address();
		Program.acceptRecord( currentAddress );
		Program.printRecord( currentAddress );
	}
	
	public static void main1(String[] args) {
		Date birthDate = new Date();
		Program.acceptRecord( birthDate );
		Program.printRecord( birthDate );
	}
}
