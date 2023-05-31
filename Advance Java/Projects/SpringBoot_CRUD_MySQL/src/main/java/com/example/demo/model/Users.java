package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @Id
    private int id;
    private String firstName;
    private String lastName;

}
