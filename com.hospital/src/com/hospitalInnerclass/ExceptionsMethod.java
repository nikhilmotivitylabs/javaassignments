package com.hospitalInnerclass;

public class ExceptionsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k=0;
	     int a[]=new int[4];
	     i=8;
	     j=0;
	     
	     try{
	         k=i/j;
	         
	         for(int c=0;c<=4;c++){
	             a[c]=c+1;
	         }
	         for(int value:a){
	             System.out.println(value);
	         }
	         System.out.println(i-j);
	     }
	     catch(Exception  e){
	         e.printStackTrace(); 
	         
	     }
//	     catch(ArrayIndexOutOfBoundsException a){
//	         System.out.println("maximum numbers can be 4 "+a);
//	     } 
	     
	     System.out.println(k);
	     System.out.println(i+j);
	}

}
