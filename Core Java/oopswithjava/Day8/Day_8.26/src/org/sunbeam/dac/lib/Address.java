package org.sunbeam.dac.lib;

public class Address {
	private String cityName;
	private String stateName;
	private String pinCode;
	public Address() {
	}
	public Address(String cityName, String stateName, String pinCode) {
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + ", pinCode=" + pinCode + "]";
	}
}
