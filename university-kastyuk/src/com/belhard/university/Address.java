package com.belhard.university;

public class Address {

	private String city;
	private String street;
	private String houseNumber;
	private int flatNumber;
	
	
	public Address(String city, String street, String houseNumber) {
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
	}
	
	public Address(String city, String street, String houseNumber, int flatNumber) {
		this(city, street, houseNumber);

		this.flatNumber = flatNumber;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	
}
