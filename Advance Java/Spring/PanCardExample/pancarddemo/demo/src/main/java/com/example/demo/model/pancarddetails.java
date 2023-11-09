package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name = "pancarddetails")
public class pancarddetails {
    @Id
    private int client_id;
    private String client_pan_id;
    private String client_name;
    private String gender;
}
