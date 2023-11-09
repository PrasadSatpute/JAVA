package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.pancarddetails;

public interface clientRepository extends JpaRepository<pancarddetails,Integer>{
	
}
