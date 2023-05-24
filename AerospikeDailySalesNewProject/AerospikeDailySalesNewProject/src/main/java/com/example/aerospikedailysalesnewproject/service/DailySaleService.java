package com.example.aerospikedailysalesnewproject.service;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.Record;
import com.aerospike.client.ResultCode;
import com.aerospike.client.exp.Exp;
import com.aerospike.client.policy.QueryPolicy;
import com.aerospike.client.policy.ScanPolicy;
import com.aerospike.client.query.Filter;
import com.aerospike.client.query.IndexType;
import com.aerospike.client.query.RecordSet;
import com.aerospike.client.query.Statement;
import com.example.aerospikedailysalesnewproject.model.DailySales;
import com.example.aerospikedailysalesnewproject.model.Product;
import com.example.aerospikedailysalesnewproject.repository.AerospikeDailySalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@AllArgsConstructor
public class DailySaleService {
    AerospikeDailySalesRepository aerospikeDailySalesRepository;

    List<DailySales> dailySalesList = new ArrayList<>();

    @Autowired
    private AerospikeClient client;

    public void addDailySales(DailySales dailySales) {
        aerospikeDailySalesRepository.save(dailySales);
    }

    public Optional<DailySales> readDailySaleById(int id) {
        return aerospikeDailySalesRepository.findById(id);
    }
    // function to calculate the maximum sold products
    public String getMaxSoldProduct() {

        List<DailySales> dailySales = new ArrayList<>();
        aerospikeDailySalesRepository.findAll().forEach(dailySales::add);

        HashMap<String,Long> productListMap=new HashMap<String,Long>();//Creating HashMap

        List<Product> productList1 = new ArrayList<>();

        for (DailySales dailySales1 : dailySales) {

            for (Product product : dailySales1.getProductDetail())
            {
                if (productListMap.isEmpty())
                {
                    productListMap.put(product.getProductName(),product.getProductQuantity());
                    productList1.add(product);
                }
                else
                if(productListMap.containsKey(product.getProductName()))
                {
                    Long oldQuantity = productListMap.get(product.getProductName());
                    productListMap.put(product.getProductName(),oldQuantity+product.getProductQuantity());
                    productList1.add(product);
                }
                else
                {
                    productListMap.put(product.getProductName(),product.getProductQuantity());
                    productList1.add(product);
                }
            }
        }
        for (Map.Entry<String,Long> entry :
                productListMap.entrySet()) {
                System.out.println("Product Name:" + entry.getKey() + " " +entry.getValue());
        }

        Long maxValueInMap = Collections.max(productListMap.values());

        // Iterate through HashMap
        for (Map.Entry<String,Long> entry :
                productListMap.entrySet()) {

            if (entry.getValue() == maxValueInMap) {

                // Print the key with max value
                System.out.println("Max Product : " + entry.getKey());
                return entry.getKey();
            }
        }
        return null;
    }

    // function to calculate the minimum sold products
    public String getMinSoldProduct() {

        List<DailySales> dailySales = new ArrayList<>();
        aerospikeDailySalesRepository.findAll().forEach(dailySales::add);

        HashMap<String,Long> productListMap=new HashMap<String,Long>();//Creating HashMap

        List<Product> productList1 = new ArrayList<>();

        for (DailySales dailySales1 : dailySales) {

            for (Product product : dailySales1.getProductDetail())
            {
                if (productListMap.isEmpty())
                {
                    productListMap.put(product.getProductName(),product.getProductQuantity());
                    productList1.add(product);
                }
                else
                if(productListMap.containsKey(product.getProductName()))
                {
                    Long oldQuantity = productListMap.get(product.getProductName());
                    productListMap.put(product.getProductName(),oldQuantity+product.getProductQuantity());
                    productList1.add(product);
                }
                else
                {
                    productListMap.put(product.getProductName(),product.getProductQuantity());
                    productList1.add(product);
                }
            }
        }
        for (Map.Entry<String,Long> entry :
                productListMap.entrySet()) {
            System.out.println("Product Name:" + entry.getKey() + " " +entry.getValue());
        }

        Long minValueInMap = Collections.min(productListMap.values());

        // Iterate through HashMap
        for (Map.Entry<String,Long> entry :
                productListMap.entrySet()) {

            if (entry.getValue() == minValueInMap) {

                // Print the key with min value
                System.out.println("Min Product : " + entry.getKey());
                return entry.getKey();
            }
        }
        return null;
    }

//      Add index in Sales
// Add index in Sales
public Boolean createIndex() {
    try {
        client.createIndex(null, "test", "DailySales", "idx_testSet_saleDate", "saleDate", IndexType.NUMERIC);
        System.out.println("Secondary Index is Created");
        return true;
    } catch (AerospikeException e) {
        // If the index already exists, ignore the error
        if (e.getResultCode() != ResultCode.INDEX_ALREADY_EXISTS) {
            throw e;
        }
    }
    return false;
}

    public List<Record> queryGetIndexBySaleDate() {
        Statement stmt = new Statement();
        stmt.setNamespace("test");
        stmt.setSetName("DailySales");
//        stmt.setFilter(Filter.);
        stmt.setFilter(Filter.range("saleDate", 1, Integer.MAX_VALUE));

        // The policy settings
        QueryPolicy policy = new QueryPolicy();
        policy.filterExp = Exp.build(
                Exp.gt(Exp.intBin("saleDate"), Exp.val(0))
        );

        List<Record> records = new ArrayList<>();
        RecordSet rs = null;
        try {
            rs = client.query(policy, stmt);
            while (rs.next()) {
                records.add(rs.getRecord());
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
        return records;
    }

    public void deleteAllRecord() {
        // Define a scan policy
        ScanPolicy policy = new ScanPolicy();
        policy.includeBinData = false;  // We don't need the actual data

        // Scan the set and delete each record
        client.scanAll(policy, "test", "DailySales", (key, record) -> {
            client.delete(null, key);
        });
    }



    public List<DailySales> getAllDailySales() {
        List<DailySales> dailySales = new ArrayList<>();
        aerospikeDailySalesRepository.findAll().forEach(dailySales::add);

        // Convert Unix timestamp to "yyyy/MM/dd" format for display
        for (DailySales dailySale : dailySales) {
            long unixTime = dailySale.getSaleDate();
            Date date = new Date(unixTime * 1000L); // multiply by 1000 because Unix timestamp is in seconds and Date expects milliseconds
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String formattedDate = sdf.format(date);
            dailySale.setSaleDateFormatted(formattedDate);
        }

        return dailySales;
    }
}
