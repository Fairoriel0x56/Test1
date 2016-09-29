package com.proj.mine;

public class Person {
	private String name;
	private int birthDate;
	
	Person(String name, int birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getBirthDate() {
		return birthDate;
	}
	void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	
	int getAge() {
		return 2016 - this.birthDate;
	}
	
	
}
