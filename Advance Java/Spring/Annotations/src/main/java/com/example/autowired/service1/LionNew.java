package com.example.autowired.service1;
import com.example.autowired.service.Animal;
public class LionNew implements Animal{

	@Override
	public String charAnimal() {
		return "Lion Roar";
	}
	
	public String animalName() {
		return "Lion King";
	}
	
}
