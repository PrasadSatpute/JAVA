package com.example.autowired.service;

import org.springframework.stereotype.Service;

@Service
public class Cat implements Animal{

	@Override
	public String charAnimal() {
		return "Cat Meow";
	}

}
