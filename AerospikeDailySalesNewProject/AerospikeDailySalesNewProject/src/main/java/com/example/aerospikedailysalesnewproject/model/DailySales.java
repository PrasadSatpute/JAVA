package com.example.aerospikedailysalesnewproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;

@Data
@Document
@AllArgsConstructor
public class DailySales {
    @Id
    private int salesID;
    private long saleDate; // changed from String to long to store Unix timestamp
    @Transient // this field will not be saved in the database
    private String saleDateFormatted; // This is only for displaying the date in "yyyy/MM/dd" format
    private List<Product> productDetail;
}
