package com.example.aerospikedailysalesnewproject.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DailySalesDate {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//    Calendar cal = Calendar.getInstance();
    private String salesDate;

    public void setSalesDate(String salesDate) {
        this.salesDate = dateFormat.format(salesDate);
    }

    public String getSalesDate() {
        return salesDate;
    }
}
