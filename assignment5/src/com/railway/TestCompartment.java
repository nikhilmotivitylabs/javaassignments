package com.railway;

import java.util.Random;

public class TestCompartment {
	
	public static void main(String[] args) 
	{
		System.out.println(getObject().notice());
		
	}
	static Compartment getObject()
	{
		Object[] obj = {new First_class(),new Ladies(),new Luggage(),new General()};
		Random random = new Random();
		//upcasting 
		return  (Compartment) obj[random.nextInt(2)];
		
	}

}
