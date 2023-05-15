package org.sunbeam.dac.test;
public class Program {
	public static void main(String[] args) {
		int choice;
		EmployeeTest test = new EmployeeTest();
		while( ( choice = EmployeeTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				test.acceptRecord();
				break;
			case 2:
				test.printRecord();
				break;
			}
		}
		EmployeeTest.close();
	}
}
