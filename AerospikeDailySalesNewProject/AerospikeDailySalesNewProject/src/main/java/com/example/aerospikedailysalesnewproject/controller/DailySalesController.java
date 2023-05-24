package com.example.aerospikedailysalesnewproject.controller;

import com.aerospike.client.Record;
import com.example.aerospikedailysalesnewproject.model.DailySales;
import com.example.aerospikedailysalesnewproject.service.DailySaleService;
import gnu.crypto.keyring.IPublicKeyring;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DailySalesController {
    DailySaleService dailySaleService;

    @PostMapping("/dailySales/add")
    public void addProduct(@RequestBody DailySales dailySales) {
        dailySaleService.addDailySales(dailySales);
    }

    @GetMapping("/alldailysales")
    public List<DailySales> readAllDailySalesproduct()
    {
        return dailySaleService.getAllDailySales();
    }

    @GetMapping("/setSI")
    public Boolean createSecondaryIndex()
    {
        return dailySaleService.createIndex();
    }

    @GetMapping("/getAllSIRecords")
    public List<Record> getAllSIRecords()
    {
        return dailySaleService.queryGetIndexBySaleDate();
    }
    @GetMapping("/getMaxSoldproduct")
    public String getMaxSoldProduct()
    {
        return dailySaleService.getMaxSoldProduct();
    }

    @GetMapping("/getMinSoldproduct")
    public String getMinSoldProduct()
    {
        return dailySaleService.getMinSoldProduct();
    }

    @DeleteMapping("/deleteAllRecord")
    public void deleteAllRecord(){
        dailySaleService.deleteAllRecord();
    }

}
