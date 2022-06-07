package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Student implements Comparable<Student> {
		String name;
	    int rollNo;

	    public Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", rollNo=" + rollNo +
	                '}';
	    }

	    @Override
	    public int compareTo(Student that) {
	        return this.rollNo - that.rollNo;
	    }
}

