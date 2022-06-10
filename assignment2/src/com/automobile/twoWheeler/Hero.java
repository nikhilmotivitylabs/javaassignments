package com.automobile.twoWheeler;

import com.automobile.*;

class Hero extends Vehicle{
	private String modelName;
	private String num;
	private String owner;
	public Hero(String modelName,String num,String owner) {
		this.modelName=modelName;
		this.num=num;
		this.owner=owner;
	}
	
	public String getModelName() {
		return modelName;
	}
	public String getRegistrationNumber() {
		return num;
	}
	
	public String getownerName() {
		return owner;
	}
	
	void radio(String radio_device) {
		System.out.println("we have radio in hero "+radio_device);
	}
	/*public String getModelName(String ModelName) {
		// TODO Auto-generated method stub
		return modelName;
	}*/


}
class Honda extends  Vehicle{
	
	private String modelName;
	private String num;
	private String owner;
	public Honda(String modelName,String num,String owner) {
		this.modelName=modelName;
		this.num=num;
		this.owner=owner;
	}
	
	public String getModelName() {
		return modelName;
	}
	public String getRegistrationNumber() {
		return num;
	}
	
	public String getownerName() {
		return owner;
	}
	
	void cd_Player(String Cd_PlayerName) {
		System.out.println("cdPlayer is there in honda");
	}
	
}

class Test {
	public static void main(String [] args) {
		Hero hero1=new Hero("audi s3","ap36ax1336","nikhil");
		System.out.println("model name "+hero1.getModelName()+ " registration number: "+hero1.getRegistrationNumber()+ " owner name "+hero1.getownerName());
		
		Honda honda1=new Honda("hondo 123","ats05766","akhil"); 
		
		System.out.println("model name "+honda1.getModelName()+ " registration number: "+honda1.getRegistrationNumber()+ " owner name "+honda1.getownerName());
	}
}
