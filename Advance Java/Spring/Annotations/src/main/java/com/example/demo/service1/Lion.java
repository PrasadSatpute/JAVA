package com.example.demo.service1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.service.Animal;

@Primary
@Service
public class Lion implements Animal{

	@Override
	public String charAnimal() {
		return "Lion Roar";
	}
	
}
