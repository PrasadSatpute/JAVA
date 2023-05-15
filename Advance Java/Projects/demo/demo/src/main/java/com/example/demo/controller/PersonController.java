package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoApplication;
import com.example.demo.beans.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	static Logger logger = LogManager.getLogger(DemoApplication.class);
	
	@Autowired
	PersonService pservice;

	@GetMapping("/getAllPerson")
	public List<Person> getAllPerson() {
		logger.info("Logger Info Controller");
		List<Person> plist = pservice.getAllPerson();
		return plist;
	}
	
	@GetMapping("/getLogger")
	public String getLogger() {
		logger.info("Logger Info Controller");
		return "Hello Logger Controller";
	}

	@GetMapping("/getById/{pid}")
	public Person getById(@PathVariable int pid) {
		System.out.println("PID -------------------" + pid);
		Optional<Person> p = pservice.getPersonById(pid);
		return p.get();
	}

	@GetMapping("/deletePerson/{pid}")
	public void deletePerson(@PathVariable int pid) {
		pservice.deleteById(pid);
	}

	@PostMapping("/savePerson")
	public Person savePerson(@RequestParam int pid,@RequestParam String name,@RequestParam int age) {
		Person p=pservice.addPerson(new Person(pid,name,age));
		return p;
	}
	
	@PostMapping("/updatePerson")
	public Person updatePerson(@RequestParam int pid,@RequestParam String name,@RequestParam int age) {
		return pservice.updatePerson(new Person(pid,name,age));
	}
	@PostMapping("/getByName")
	public List<Person> getByName(@RequestParam String name) {
		List<Person> p = pservice.getPersonByName(name);
		return p;
	}
	

}
