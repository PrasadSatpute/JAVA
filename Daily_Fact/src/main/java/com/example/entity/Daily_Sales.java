package com.example.entity;

import com.aerospike.mapper.annotations.AerospikeBin;
import com.aerospike.mapper.annotations.AerospikeEmbed;
import com.aerospike.mapper.annotations.AerospikeKey;
import com.aerospike.mapper.annotations.AerospikeRecord;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

@AerospikeRecord(namespace = "test", set = "sale")
public class Daily_Sales {
    @AerospikeKey
    private int saleId;

    @AerospikeEmbed
    private List<Product_Details> products;

    @JsonFormat(pattern = "dd-mm-yy")
    private String saleDate;


    public Daily_Sales() {
    }

    public Daily_Sales(int saleId, List<Product_Details> products, String saleDate) {
        this.saleId = saleId;
        this.products = products;
        this.saleDate = saleDate;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public List<Product_Details> getProducts() {
        return products;
    }

    public void setProducts(List<Product_Details> products) {
        this.products = products;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "Daily_Sales{" +
                "saleId=" + saleId +
                ", products=" + products +
                ", saleDate='" + saleDate + '\'' +
                '}';
    }
}
