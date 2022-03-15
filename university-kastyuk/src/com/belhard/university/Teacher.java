package com.belhard.university;

import java.time.LocalDate;

public class Teacher {

	private static long counter;
	private long id;
	
	private String firstName;
	private String lastName;
	private String subject;
	private Address address;
	
	private LocalDate dateOfBirth;
	
	private int yearsOfExperience;

	private double salary;
	
	public Teacher (String firstName, String lastName,  String subject, Address address, LocalDate dateOfBirth, int yearsOfExperience, double salary) {
		id = ++counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;
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
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
