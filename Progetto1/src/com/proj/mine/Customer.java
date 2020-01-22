package com.proj.mine;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String email;
	private int birthYear;
	
	public Customer(String firstName, String lastName, String email, int birthYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	public Customer() {}

	public String getFirstName() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
	
	
	

}
