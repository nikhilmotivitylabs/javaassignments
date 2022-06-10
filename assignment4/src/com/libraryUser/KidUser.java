package com.libraryUser;

import java.util.*;

public class KidUser implements LibaryUser{
	
	int age;
	String bookType;
	
	
	@Override
	public void registerAccount() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age :");
		age=sc.nextInt();
		if(age<12) {
			
			System.out.println("you have sucessfully registered under kids category");
			requestBook();
		}else {
			System.out.println("you will go to adult catagory");
		}
		
	}
	
	@Override
	
	public  void requestBook() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the book you need:");
		bookType = sc.next();
		if (bookType.equals("fantasy") || bookType.equals("comics")) {
			System.out.println(""+bookType+"book should be returned in 10 days");
		}
		else {
			System.out.println("no book taken");
		}
		
	}
	
	public static void main(String[] args) {
		LibaryUser user1=new KidUser();
		
		LibaryUser rahul = new KidUser();
	      rahul.registerAccount();
	      
		
	}

}
