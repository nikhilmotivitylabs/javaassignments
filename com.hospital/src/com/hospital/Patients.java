package com.hospital;

//public class Patients {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//upcasting
//		
//		Hospital timing=new Doctor();
//		timing.Dress_Color();
//		timing.working_time(11);
//		
//		System.out.println(timing.leaving_time(9));
//		
//		
////		timing=new Doctor();
//		
//		
//		//nurse
//		timing=new Nurse();
//		timing.Dress_Color();
//		timing.working_time(10);
////		System.out.print(timing.managingPatients(10));
//		System.out.println(timing.leaving_time(9));
//		
//		timing=new management();
//		timing.Dress_Color();
//		timing.working_time(8);
//		System.out.println(timing.leaving_time(9));
//		
//		
//
//	}
//
//}
//abstract class Hospital {
//	static String hospital_Name;
//	int Employee_id;
//	
//	
////	public void working_time(int startingTime) {
////		System.out.print("the Hospital Start at "+startingTime);
////	}
//	
//	abstract void working_time(int startingTime);
//	abstract int leaving_time(int leavingTime);
//	
//	void Dress_Color() {
//		
//		System.out.println("the Dress color is white");
//	}
//	
//	
//}
//
//class Doctor extends Hospital{
//	public void working_time(int startingTime) {
//		System.out.print("the hospital doctor come at "+startingTime);
//	}
//	
//	public int leaving_time(int leavingTime) {
//		System.out.print(" doctor will  leaves at time ");
//		
//		return leavingTime;
//		
//	}
//}
//
//class Nurse extends Hospital{
//	public void working_time(int startingTime) {
//		System.out.print("in the hospital nurse comes time "+startingTime);
//	}
//	
//	public int leaving_time(int leavingTime) {
//		System.out.print(" nurse leaves at  time ");
//		
//		return leavingTime;
//	}
////	void managingPatients(int patients) {
////		System.out.println("the nurse can manage "+patients);
////		
////	}
//}
//
//class management extends Hospital{
//	public void working_time(int startingTime) {
//		System.out.print("in the hospital management Team comes at time "+startingTime);
//	}
//	
//	public int leaving_time(int leavingTime) {
//		System.out.print(" management team can leaving time ");
//		return leavingTime;
//	}
//	
//}