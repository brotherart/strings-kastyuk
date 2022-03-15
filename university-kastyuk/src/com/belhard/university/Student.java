package com.belhard.university;

import java.time.LocalDate;

public class Student {

	private static long counter;
	private long id;
	
	private String firstName;
	private String lastName;
	private Address address;

	private LocalDate dateOfBirth;
	
	private int yearsOfStudy;
	
	private boolean isBudget;
	
	
	public Student(String firstName, String lastName, Address address, LocalDate dateOfBirth, int yearsOfStudy, boolean isBudget) {
		id = ++counter;
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
