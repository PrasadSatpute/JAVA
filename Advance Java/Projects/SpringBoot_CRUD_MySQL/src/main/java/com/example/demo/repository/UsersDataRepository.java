package com.example.demo.repository;

import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDataRepository extends JpaRepository<Users,Integer> {
}
