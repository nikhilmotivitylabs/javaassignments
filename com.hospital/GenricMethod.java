package com.hospitalInnerclass;

public class GenricMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxHospital<Integer> i=new MaxHospital<Integer>();
		
		MaxLife<Integer> amount=new MaxLife<Integer>();
		amount.show(10);
		amount.insuarnce(50000);
	}

}

class MaxHospital<T>{
	
	public MaxHospital() {
		System.out.println("Welcome to Max Hospital");
	}
	void show(T x) {
		System.out.println("number of branches "+x);
	}
	
}
class MaxLife<Z> extends MaxHospital<Object>{
	void insuarnce(Z y) {
		System.out.println("this works in Maxhospital the amount claim"+y);
	}
}
