/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.List;

public class UnderstandStreamFilter {
    public static void main(String[] args) {
        Product p1 = new Product(1, "HP Laptop", 50000f);
        Product p2 = new Product(2, "DELL Laptop", 60000f);
        Product p3 = new Product(3, "ASUS Laptop", 40000f);
        Product p4 = new Product(4, "LENOVA Laptop", 45000f);
        Product p5 = new Product(5, "ACCER Laptop", 40000f);
        
        List<Product> ProductList = new ArrayList<Product>();
        ProductList.add(p1);
        ProductList.add(p2);
        ProductList.add(p3);
        ProductList.add(p4);
        ProductList.add(p5);
        
        for(Product product:ProductList)
        {
            System.out.println(product.getProduct_id()
                    +" "+product.getPname()
                    +" "+product.getPrice());
        }
        System.out.println("-------------------------------------------");
        
        System.out.println("List the Product which is greter than 40000");
        ProductList.stream()
                .filter(p -> p.getPrice() > 40000)
                .map(pm -> pm.getPname()+" "+pm.getPrice())
                .forEach(System.out::println);
        
    }
}
