package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("ABC","XYZ");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("ABCD1", "XYZ"));
		students.add(new Student("ABCD2", "XYZ"));
		students.add(new Student("ABCD3", "XYZ"));
		students.add(new Student("ABCD4", "XYZ"));
		return students;
	}
	
	@GetMapping("student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name="firstName") String firstName,
			@RequestParam(name="lastName") String lastName) {
		return new Student(firstName, lastName);
	}
}
