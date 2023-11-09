package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class pancarddetails {
	@Id
    private int client_id;
    private String client_pan_id;
    private String client_name;
    private String gender;
    
    
    
	public pancarddetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public pancarddetails(int client_id, String client_pan_id, String client_name, String gender) {
		super();
		this.client_id = client_id;
		this.client_pan_id = client_pan_id;
		this.client_name = client_name;
		this.gender = gender;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getClient_pan_id() {
		return client_pan_id;
	}
	public void setClient_pan_id(String client_pan_id) {
		this.client_pan_id = client_pan_id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
    
    
    
}
