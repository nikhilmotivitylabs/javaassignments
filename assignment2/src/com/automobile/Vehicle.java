package com.automobile;

public abstract class Vehicle {
	public abstract String getModelName(); 

	public abstract String getRegistrationNumber(); 

	public abstract String getownerName();
	
	public void start() {
		System.out.println("start with key");
	}
}
