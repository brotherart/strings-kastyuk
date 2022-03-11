package com.belhard.university;

import java.util.Date;

public class Student {

	private static long counter = 1;
	private long id;
	
	private String firstName;
	private String lastName;
	private Address address;
	
	private Date dateOfBirth;
	
	private int yearsOfStudy;
	
	private boolean isBudget;
	
	
	public Student (String firstName, String lastName) {
		id = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, Address address, Date dateOfBirth, int yearsOfStudy, boolean isBudget) {
		this(firstName, lastName);
		
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.yearsOfStudy = yearsOfStudy;
		this.isBudget = isBudget;
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String gerFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getYearsOfStudy() {
		return yearsOfStudy;
	}
	public void setYearsOfStudy(int yearsOfStudy) {
		this.yearsOfStudy = yearsOfStudy;
	}
	
	public boolean getIsBudget() {
		return isBudget;
	}
	public void setIsBudget(boolean isBudget) {
		this.isBudget = isBudget;
	}
	
}
