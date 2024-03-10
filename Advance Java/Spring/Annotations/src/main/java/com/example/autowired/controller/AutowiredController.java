package com.example.autowired.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.autowired.service.Animal;
@RestController
@RequestMapping("/autowire")
public class AutowiredController {
//	1 step
//	@Qualifier("cat")
//	@Autowired
//	private Animal animal;
//@GetMapping("/animal")
//public String fetchAnimal() {
//	return animal.charAnimal();
//}


//	2nd step  where @Primary used in Service Class
//	@Autowired
//	private Animal animal;
//@GetMapping("/animal")
//public String fetchAnimal() {
//	return animal.charAnimal();
//}

//	3rd step
//  private Animal animal;
//	@Autowired
//	public void setAnimal(@Qualifier("cat") Animal animal) {
//		this.animal = animal;
//	}
//@GetMapping("/animal")
//public String fetchAnimal() {
//	return animal.charAnimal();
//}


//	4th step
//  private Animal animal;
//	@Autowired
//	public AutowiredController(@Qualifier("dog") Animal animal) {
//		this.animal = animal;
//	}


//  5th step
// 	@Autowired
//	private Lion animal;
//
//	@GetMapping("/animal")
//	public String fetchAnimal() {
//		return animal.animalName();
//	}

//  6th step
//    @Autowired
//  private Animal dog;
//	@GetMapping("/animal")
//	public String fetchDog() {
//		return dog.charAnimal();
//	}

//  7th step
// 	private Animal animal = new Dog();
//	private Animal animal = new Cat();
//    @GetMapping("/animal")
//    public String fetchAnimal() {
//        return animal.charAnimal();
//    }

    //  8th step
//     	private Animal animal = new LionNew();
//    @GetMapping("/animal")
//    public String fetchAnimal() {
//        return animal.charAnimal();
//    }


    @Autowired
    private Animal animal;
	@GetMapping("/animal")
	public String fetchDog() {
		return animal.charAnimal();
	}
}
