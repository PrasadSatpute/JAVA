package com.example.autowired.service1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.autowired.service.Animal;

@Primary  // 2nd step
@Service
public class Lion implements Animal{

	@Override
	public String charAnimal() {
		return "Lion Roar";
	}
	
	public String animalName() {
		return "Lion King";
	}
	
}
