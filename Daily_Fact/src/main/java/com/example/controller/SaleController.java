package com.example.controller;

import com.example.Configuration.aeroMapperConfig;
import com.example.entity.Base_Price;
import com.example.entity.Daily_Sales;
import com.example.entity.Product_Details;
import com.example.service.SaleServiceImpl;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.*;

@Controller("/sale")
public class SaleController {
    @Inject
    aeroMapperConfig mapper;
    @Inject
    SaleServiceImpl saleService;

    @Post("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public String addSale(@Body Daily_Sales daily_sales) {
        return saleService.addSale(daily_sales);
    }

    @Post("/addbaseprice")
    @Produces(MediaType.APPLICATION_JSON)
    public String addSale(@Body Base_Price base_price) {
        return saleService.addBasePrice(base_price);
    }

    @Post("/index/{binName}/{indexName}")
    public String index(@PathVariable String binName,@PathVariable String indexName) {
        return saleService.createIndex(indexName,binName);
    }
    @Get("/getbydate/{date}")
    public  Product_Details getByDate(@PathVariable String date)
    {
        return  saleService.getbydate(date);
    }
    @Get("/getbdate/{date}")
    public List<Daily_Sales> getBDate(@PathVariable String date)
    {
        return  saleService.getSaleByDate(date);
    }
    @Get("/gettodaysale")
    public List<Daily_Sales> getTodayDateSale()
    {
        return  saleService.gettodaysale();
    }

    @Get("/record/date")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Map<String, Object>> getrecord(@QueryValue String date) {
 return saleService.getrecord(date);
    }

    @Post("/dindex/{idx}/{setname}")
    public String deleteindex(@PathVariable String idx, @PathVariable String setname) {
        return saleService.dindex(idx, setname);
    }

    @Get("/get")
    public List<Daily_Sales> getAllSale() {
        return saleService.getAllSale();
    }

    @Get("/daycount/{saleDate}")
    public String GetCount(@PathVariable String saleDate) {
        return saleService.getcnt(saleDate);
    }

    @Get("/qty/{saleDate}/{item}")
    public int productQnty(@PathVariable String saleDate, @PathVariable String item) {
        return saleService.qtyofproduct(saleDate, item);

    }

    @Get("/daymax/{saleDate}")
    public String maxAmount(@PathVariable String saleDate) {
        return saleService.getmaxamt(saleDate);
    }

    @Get("/dailysale/{saleDate}")
    public List<Daily_Sales> todaylistsale(@PathVariable String saleDate) {
        return saleService.todaysalelist(saleDate);
    }

    @Get("/dayavg/{saleDate}")
    public String saledateavg(@PathVariable String saleDate) {
        return saleService.getavg(saleDate);
    }

    @Get("/pname/{saleDate}")
    public List<List<Product_Details>> nameofproductonsaledate(@PathVariable String saleDate) {
        return saleService.productname(saleDate);
    }

    @Get("/pandl/{saleDate}/{item}")
    public String ProfitAndLoss(@PathVariable String saleDate, @PathVariable String item) {
        return saleService.pandl(saleDate, item);
    }

    @Get("/getCountByLua/{saleDate}")
    public int getCountByLua(@PathVariable String saleDate) {
        return saleService.getCountByLua(saleDate);
    }


}

