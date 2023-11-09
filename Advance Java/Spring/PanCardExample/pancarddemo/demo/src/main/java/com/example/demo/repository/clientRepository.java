package com.example.demo.repository;

import com.example.demo.model.pancarddetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<pancarddetails,Integer> {
}
