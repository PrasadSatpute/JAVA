package com.example.aerospikedailysalesnewproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document
@AllArgsConstructor
public class Product {
    @Id
    private int productID;
    private String productName;
    private Long productQuantity;
    private double productPrice;
}
