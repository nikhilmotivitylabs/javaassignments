package com.hospital;

public class ZeroConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Docto Doctor1=new Docto(101,52020f,2);
		Docto Doctor2=new Docto(11,768686f,3);
		Dental1 Doctor=new Dental1(2); 
		

	}

}
class Docto{  //Super class
	
	int id;
	float salary;
	int experience;
	public Docto(int id,float salary,int experience) {
		this.id=id;
		this.salary=salary;
		this.experience=experience;
		
		System.out.println("Doctor id is "+id);
		System.out.println("Doctor salary "+salary);
		System.out.println("Doctor experience "+experience);
	}
	public Docto() {
		System.out.println("address ");
		
	}
	public Docto(int id) {
		super();
		System.out.println("Doctor id "+id);
	}
}
class Dental1 extends Docto{   //subclass
	
	public Dental1() {
		super();
	  System.out.println("address of dental1 ");	
	}
	public Dental1(int id) {
		super(id);
		System.out.println("id of dental1 "+id);
	}
}
