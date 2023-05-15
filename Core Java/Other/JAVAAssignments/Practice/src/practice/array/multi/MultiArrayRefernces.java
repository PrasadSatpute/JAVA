package practice.array.multi;

import practice.array.model.Employee;

public class MultiArrayRefernces {

	public static void main(String[] args) {
		
		
		EmployeeTest test = new EmployeeTest(); 
		
//		Employee emp = new Employee();
//		test.setEmp(emp);
//		test.acceptRecord();
//		test.printRecord();
		
		Employee[] emp = new Employee[ 4 ];
		
		for(int index = 0; index < emp.length; ++index) {
			test.setEmp(emp[index]);
			test.acceptRecord();
			test.printRecord();
		}
		
		
	}

}
