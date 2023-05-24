package com.example.entity;

import com.aerospike.mapper.annotations.AerospikeKey;
import com.aerospike.mapper.annotations.AerospikeRecord;

@AerospikeRecord(namespace = "test", set = "baseprice")
public class Base_Price {
    @AerospikeKey
    public  String product_name;
    public int product_id;
    public int product_price;

    public Base_Price() {
    }

    public Base_Price(String product_name, int product_id, int product_price) {
        this.product_name = product_name;
        this.product_id = product_id;
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return "Base_Price{" +
                "product_name='" + product_name + '\'' +
                ", product_id=" + product_id +
                ", product_price=" + product_price +
                '}';
    }
}
