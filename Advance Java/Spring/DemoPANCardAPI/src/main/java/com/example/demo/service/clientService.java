package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.pancarddetails;
import com.example.demo.repository.clientObjectRepository;
import com.example.demo.repository.clientRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class clientService {
	
	@Autowired
    clientRepository repository;
	
//	@Autowired
//	clientObjectRepository objectRepository;

    public pancarddetails createUsers(pancarddetails pancarddetails){
        return repository.save(pancarddetails);
    }

    public List<Object> readAllUsers()
    {
    	
//    	List<pancarddetails> getAllList = repository.findAll();
//    	
//    	List<Object> objectList = objectRepository.findAll();
    	
//    	for (pancarddetails pancarddetails : getAllList) {
//			
//		}
    	
//        return repository.findAll();
    	
//    	return objectRepository.findAll();
    	return null;
    	
    }

}
