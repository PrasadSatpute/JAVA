package collectionConcept.Iterable;

import static java.lang.String.format;
import java.util.*;

class Employee {
	   private String firstName, lastName;
	   private int employeeId;
	   public Employee(){ }
	   public Employee(String firstName, String lastName, int employeeId) {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.employeeId = employeeId;
	   }
	   public String getFirstName() {
	      return firstName;
	   }
	   public String getLastName() {
	      return lastName;
	   }
	   public int getEmployeeId() {
	      return employeeId;
	   }
	   public void setFirstName(String firstName) {
	      this.firstName = firstName;
	   }
	   public void setLastName(String lastName) {
	      this.lastName = lastName;
	   }
	   public void setEmployeeId(int employeeId) {
	      this.employeeId = employeeId;
	   }
	   @Override
	   public String toString() {
	      return format("First Name: %s Last Name: %s EmployeeId: %d", firstName, lastName, employeeId);
	   }
	}

	class EmployeeListIterator implements Iterable<Employee> {
	   private List<Employee> employees;
	  
	   public EmployeeListIterator() {
	      employees = new ArrayList<Employee>();
	   }
	   public EmployeeListIterator(int employeeId) {
	      employees = new ArrayList<Employee>(employeeId);
	   }
	   public void addEmployee(Employee employee) {
	      employees.add(employee);
	   }
	   public void removeEmployee(Employee employee) {
	      employees.remove(employee);
	   }
	   public int employeesListSize() {
	      return employees.size();
	   }
	   @Override
	   public Iterator<Employee> iterator() {
	      return employees.iterator();
	   }

	}
	 
	public class EmployeeIterator {
	   public static void main(String[] args) {
	      Employee emp1 = new Employee("John", "Smith", 21);
	      Employee emp2 = new Employee("George","Smith", 41);
	      EmployeeListIterator empList = new EmployeeListIterator();
	      empList.addEmployee(emp1);
	      empList.addEmployee(emp2);
	      empList.removeEmployee(emp2);
	      for (Employee emp : empList) {
	         System.out.println(emp +"         " + empList.employeesListSize());
	      }
	   }
	}