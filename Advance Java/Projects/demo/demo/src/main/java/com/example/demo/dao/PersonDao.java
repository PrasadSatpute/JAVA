package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

	@Query(value = "select * from person where name= :nm",nativeQuery = true)
	List<Person> getByName(String nm);
	
	
	
}
