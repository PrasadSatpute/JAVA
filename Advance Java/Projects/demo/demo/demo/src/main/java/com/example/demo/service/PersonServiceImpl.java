package com.example.demo.service;

import java.sql.PseudoColumnUsage;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Person;
import com.example.demo.dao.PersonDao;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;
	
	@Override
	public List<Person> getAllPerson() {
		return personDao.findAll();
	}

	@Override
	public Optional<Person> getPersonById(int pid) {
		Optional<Person> op=personDao.findById(pid);
		return Optional.ofNullable(op.get());
	}

	@Override
	public void deleteById(int pid) {
		personDao.deleteById(pid);
	}

	@Override
	public Person addPerson(Person person) {
		return personDao.save(person);
	}

	@Override
	public Person updatePerson(Person person) {
		Optional<Person> op=personDao.findById(person.getId());
		if(op.isPresent()) {
			Person p1=op.get();
			p1.setName(person.getName());
			p1.setAge(person.getAge());
			return personDao.save(p1);
		}
		return null;
	}

	@Override
	public List<Person> getPersonByName(String name) {
		List<Person> plist=personDao.getByName(name);
		return plist;
	}

}
