package com.example.demo.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class AddressCSV {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long zipCode;
	private String placeName;
	private String country;
	private String stateCode;
	private String state;
	private String city;
	public AddressCSV(long zipCode, String placeName, String country, String stateCode, String state, String city) {
		super();
		this.zipCode = zipCode;
		this.placeName = placeName;
		this.country = country;
		this.stateCode = stateCode;
		this.state = state;
		this.city = city;
	}
	public AddressCSV() {
		super();
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AddressCSV [zipCode=" + zipCode + ", placeName=" + placeName + ", country=" + country + ", stateCode="
				+ stateCode + ", state=" + state + ", city=" + city + "]";
	}

}
