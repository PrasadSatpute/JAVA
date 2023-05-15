package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.beans.Person;

public interface PersonService {

	List<Person> getAllPerson();

	Optional<Person> getPersonById(int pid);

	void deleteById(int pid);

	Person addPerson(Person person);

	Person updatePerson(Person person);

	List<Person> getPersonByName(String name);

}
