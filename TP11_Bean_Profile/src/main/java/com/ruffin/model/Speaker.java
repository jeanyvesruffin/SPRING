package com.ruffin.model;

public class Speaker {
	
	private String firstName;
	private String lastName;
	
	// mise en oeuvre SpEL
	private double seedNum;
	
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
	// mise en oeuvre SpEL
	// ajout getter & setter
	public double getSeedNum() {
		return seedNum;
	}
	public void setSeedNum(double seedNum) {
		this.seedNum = seedNum;
	}
	
}
