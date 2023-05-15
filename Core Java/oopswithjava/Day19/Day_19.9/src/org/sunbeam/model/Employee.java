package org.sunbeam.model;

import org.sunbeam.annotations.Column;
import org.sunbeam.annotations.Entity;
import org.sunbeam.annotations.Id;
import org.sunbeam.annotations.Table;

@Entity
@Table( name = "employees" )
public class Employee {
	@Column( name = "emp_name", columnDefinition="VARCHAR(50)")
	private String name;
	
	@Id
	@Column( name = "emp_id", columnDefinition="INT")
	private int empid;
	
	@Column( name = "sal", columnDefinition="FLOAT")
	private float salary;
	//TODO : Constructor, Getter/Setter, toString
	
}
