package com.example;


public class cStudent {
    private String sname;
    private String lname;
    private String branch;
    private String year;
    private int contact;
    private String email;
    private String address;

    public cStudent(String sname, String lname, String branch, String year, String address, String email, int contact) {
        this.sname = sname;
        this.lname = lname;
        this.branch = branch;
        this.year = year;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
