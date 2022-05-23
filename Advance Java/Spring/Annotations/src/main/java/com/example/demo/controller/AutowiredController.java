package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Animal;
import com.example.demo.service.Cat;
import com.example.demo.service.Dog;
import com.example.demo.service1.Lion;

@RestController
@RequestMapping("/autowire")
public class AutowiredController {
	
	@Autowired
	private Animal animal;
	
//	@Qualifier("cat")
//	@Autowired
//	private Animal animal;
	
//	@Autowired
//	private Animal dog;
	
//	private Animal animal;
//	@Autowired
//	public AutowiredController(@Qualifier("dog") Animal animal) {
//		this.animal = animal;
//	}
	
//	private Animal animal = new Dog();
//	private Animal animal = new Cat();
	
//	private Animal animal;
//	
//	@Autowired(required = false)
//	public void setAnimal(@Qualifier("cat") Animal animal) {
//		this.animal = animal;
//	}
	
	@GetMapping("/animal")
	public String fetchAnimal() {
		return animal.charAnimal();
	}
	
//	@Autowired
//	private Lion animal;
//	
//	@GetMapping("/animal")
//	public String fetchAnimal() {
//		return animal.animalName();
//	}
	
//	@GetMapping("/animal")
//	public String fetchDog() {
//		return dog.charAnimal();
//	}
	
}
