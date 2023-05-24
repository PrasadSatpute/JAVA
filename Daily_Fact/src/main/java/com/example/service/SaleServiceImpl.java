package com.example.service;

import com.aerospike.client.*;
import com.aerospike.client.exp.Exp;
import com.aerospike.client.lua.LuaCache;
import com.aerospike.client.lua.LuaConfig;
import com.aerospike.client.policy.ClientPolicy;
import com.aerospike.client.policy.QueryPolicy;
import com.aerospike.client.query.*;
import com.aerospike.client.task.IndexTask;
import com.aerospike.client.task.RegisterTask;
import com.example.Configuration.aeroMapperConfig;
import com.example.entity.Base_Price;
import com.example.entity.Daily_Sales;
import com.example.entity.Product_Details;
import com.example.repository.SaleRepoImpl;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SaleServiceImpl {
    ClientPolicy policy = new ClientPolicy();
    AerospikeClient  client = new AerospikeClient(policy, "127.0.0.1", 3000);
    @Inject
    SaleRepoImpl saleRepo;
    @Inject
    aeroMapperConfig mapper;

    public String addSale(Daily_Sales daily_sales) {
        return saleRepo.addSale(daily_sales);
    }

    public List<Daily_Sales> getAllSale() {
        return saleRepo.getAllSale();
    }

    public String addProduct(Product_Details product_details) {
        return saleRepo.addProduct(product_details);
    }

    public Product_Details getbyid(int id) {
        return saleRepo.getbyid(id);
    }

    public String addBasePrice(Base_Price base_price) {
        mapper.getMapper().save(base_price);
        return "base price added successfully";
    }

    public String getcnt(@PathVariable String saleDate) {
        List<Daily_Sales> ds = mapper.getMapper().scan(Daily_Sales.class);
        int i = ds.stream().filter(x -> x.getSaleDate().equalsIgnoreCase(saleDate)).collect(Collectors.toList()).size();
        return "the day count on this " + saleDate + " is " + i;
    }

    public int qtyofproduct(@PathVariable String saleDate, @PathVariable String item) {
        int i = 0;
        List<Daily_Sales> ds = mapper.getMapper().scan(Daily_Sales.class);
        List<Daily_Sales> daily_sales = ds.stream().filter(x -> x.getSaleDate().equals(saleDate)).collect(Collectors.toList());
        for (Daily_Sales sale : daily_sales) {
            for (Product_Details product : sale.getProducts()) {
                if (product.getName().equals(item))
                    i = i + product.getQuantity();

            }
        }
        return i;
    }

    public String getmaxamt(@PathVariable String saleDate) {
        double max = 0;
        List<Daily_Sales> ds = mapper.getMapper().scan(Daily_Sales.class);
        List<Daily_Sales> daily_sales = ds.stream().filter(x -> x.getSaleDate().equals(saleDate)).collect(Collectors.toList());


        for (Daily_Sales sale : daily_sales) {
            for (Product_Details product : sale.getProducts()) {

                if (max < (product.getPrice() * product.getQuantity())) {
                    max = product.getPrice() * product.getQuantity();
                }
            }
        }


        return "the maxsale on this " + saleDate + " is " + max;
    }

    public List<Daily_Sales> todaysalelist(@PathVariable String saleDate) {
        List<Daily_Sales> daily_sales = mapper.getMapper().scan(Daily_Sales.class).stream().filter(x -> x.getSaleDate().equals(saleDate)).collect(Collectors.toList());
        return daily_sales;
    }

    public String getavg(@PathVariable String saleDate) {
        double totalAmount = 0;
        List<Daily_Sales> ds = mapper.getMapper().scan(Daily_Sales.class);
        List<Daily_Sales> daily_sales = ds.stream().filter(x -> x.getSaleDate().equals(saleDate)).collect(Collectors.toList());
        for (Daily_Sales sale : daily_sales) {
            for (Product_Details product : sale.getProducts()) {
                totalAmount = totalAmount + product.getPrice() * product.getQuantity();
            }
        }
        return "the saleavg on this " + saleDate + " is " + (totalAmount / daily_sales.size());
    }

    public List<List<Product_Details>> productname(@PathVariable String saleDate) {
        List<Daily_Sales> daily_sales = mapper.getMapper().scan(Daily_Sales.class).stream()
                .filter(x -> x.getSaleDate().equals(saleDate)).collect(Collectors.toList());

        List<List<Product_Details>> product_details = new ArrayList<>();
        daily_sales.stream().forEach(i -> product_details.add(i.getProducts()));
        return product_details;
    }

    public String pandl(@PathVariable String saleDate, @PathVariable String item) {
        int sp = 0;
        int bp = 0;
        List<Daily_Sales> ds = mapper.getMapper().scan(Daily_Sales.class);
        List<Daily_Sales> daily_sales = ds.stream().filter(x -> x.getSaleDate().equals(saleDate)).collect(Collectors.toList());
        Base_Price base_prices = mapper.getMapper().read(Base_Price.class, item);
        for (Daily_Sales sale : daily_sales) {
            for (Product_Details product : sale.getProducts()) {

                if (product.getName().equals(item)) {
                    bp = bp + base_prices.product_price * product.getQuantity();
                    sp = (int) (sp + product.getPrice() * product.getQuantity());

                }

            }
        }
        if (sp > bp)
            return "profit of " + (sp - bp) + " Rs gained on this " + item + " on " + saleDate;
        else
            return "Loss of " + (sp - bp) + " Rs occured on this " + item + " on " + saleDate;
    }
    public void registerLua(String luaFile){
        LuaConfig.SourceDirectory="/Users/jagannath/Desktop/Daily_Fact/src/main/resources";
        LuaCache.clearPackages();
        client.removeUdf(null, luaFile);
        RegisterTask task = client.register(null, LuaConfig.SourceDirectory+"/"+luaFile, luaFile, Language.LUA);
        task.waitTillComplete();
        System.out.format("Registered the UDF module %s.", luaFile);
    }

    public int getCountByLua(String date) {
        AerospikeClient  client = new AerospikeClient(policy, "127.0.0.1", 3000);

        policy.writePolicyDefault.sendKey = true;
        registerLua("count_udf.lua");
        LuaConfig.SourceDirectory="/Users/jagannath/Desktop/udf-testing/src/main/resources";
        Statement stmt = new Statement();
        stmt.setNamespace("test");
        stmt.setSetName("Sale");
        stmt.setFilter(Filter.equal("saleDate",date));
        stmt.setAggregateFunction("count_udf.lua", "count");
        ResultSet rs = client.queryAggregate(null, stmt);
        System.out.println("Executed Count.");
//        //while (rs.next()) {
//                Object obj = rs.getObject();
//                System.out.format("Returned object: ", obj.toString());
//        //}
        int noOfRecords = (int) rs.getObject();
        rs.close();
        return noOfRecords;
    }




    public String createIndex(String indexName, String binName) {

        IndexTask task = client.createIndex(null, //policy
                "test", // namespace
                "sale", // set name
                indexName, // index name
                binName, // bin name
                IndexType.STRING //index type
        );
        return "index create successfully";


    }

    public String dindex(String index_name, String set_name) {
        IndexTask task = client.dropIndex(null, //policy
                "test", // namespace
                set_name,
                index_name // index name
        );

// Wait for the task to complete
        task.waitTillComplete();
        return "index delete successfully";

    }

    public List<Daily_Sales> gettodaysale() {
        Format f = new SimpleDateFormat("dd-MM-yy");
        System.out.println(f.format(new Date()));
        //mapper.getClient().createIndex(null, "test", "sale", "indexdate1", "saleDate", IndexType.STRING);
        mapper.getClient().createIndex(null, "test", "sale", "indexid", "saleId", IndexType.NUMERIC);

        QueryPolicy queryPolicy = new QueryPolicy();
        queryPolicy.filterExp = Exp.build(Exp.eq(Exp.stringBin("saleDate"), Exp.val(f.format(new Date()))));

        return mapper.getMapper().query(queryPolicy, Daily_Sales.class, Filter.equal("saleDate", f.format(new Date())));
//        return mapper.getMapper().query(queryPolicy, Daily_Sales.class, Filter.range("saleId", 1, 5));
    }

    public List<Daily_Sales> getSaleByDate(String date) {


        QueryPolicy queryPolicy = new QueryPolicy();
        queryPolicy.filterExp = Exp.build(Exp.eq(Exp.stringBin("saleDate"), Exp.val(date)));

        return mapper.getMapper().query(queryPolicy, Daily_Sales.class, Filter.equal("saleDate", date));
//        return mapper.getMapper().query(queryPolicy, Daily_Sales.class, Filter.range("saleId",1,5));
    }


    public List<Map<String, Object>> getrecord(String date) {
        QueryPolicy queryPolicy = new QueryPolicy();

        Statement stmt = new Statement();

// Set namespace and set name
        stmt.setNamespace("test");
        stmt.setSetName("sale");

        stmt.setFilter(Filter.equal("saleDate", date));

// Execute the query
        RecordSet recordSet = client.query(queryPolicy, stmt);
        List<Map<String, Object>> daily_sales = new ArrayList<>();

        try {
            while (recordSet.next()) {
                Key key = recordSet.getKey();
                Record record = recordSet.getRecord();
                daily_sales.add(record.bins);
//            System.out.format("Key: %s | Record: %s\n", key.userKey, record.bins);
            }
            return daily_sales;
        } finally {
            recordSet.close();
            client.close();

        }


    }

    public Product_Details getbydate(String saleDate) {
        return mapper.getMapper().read(Product_Details.class, saleDate);
    }


}
