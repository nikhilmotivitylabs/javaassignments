package com.libraryUser;

import java.util.Scanner;

public class AdultUser implements LibaryUser {
	
	int age;
	String bookType;
	
public void registerAccount() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter your age :");
		age=sc.nextInt();
		if(age>=18) {
			
			System.out.println("you have sucessfully registered under Adult category");
			requestBook();
		}else {
			System.out.println("you will go to kids catagory");
		}
		
	}

@Override
public  void requestBook() {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the book you need:");
	bookType = sc.next();
	if (bookType.equals("fantasy") || bookType.equals("comics") || bookType.equals("action") || bookType.equals("any type")) {
		System.out.println(""+bookType+" book should be returned in 10 days");
	}
	else {
		System.out.println("no book taken");
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibaryUser rohit=new AdultUser();
		
		rohit.registerAccount();

	}

}
