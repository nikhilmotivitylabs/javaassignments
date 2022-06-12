package com.hospital;

public class InterfaceTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dental_Doctor doctor1=new Dental_Doctor();
		doctor1.working_Time(11);
		doctor1.access_To_OperationRoom();
		
		Senior_Nurse nurse1=new Senior_Nurse();
		nurse1.working_Time(9);
		nurse1.guide_junior_Nurse();
	}

}

interface Hospital{
	public void working_Time(int startingTime);
	public void leaving_Time(int leavingTime);
}

abstract class Doctor implements Hospital{
	void access_To_OperationRoom() {
		System.out.println("the can Access Operations room");
	}
}
abstract class Nurse implements Hospital{
	void need_To_TakeCare() {
		System.out.print("the nurse need to take care of the patients");
	}
}

class Dental_Doctor extends Doctor{
	public void working_Time(int startingTime) {
		System.out.println("the Dental Doctor come at "+startingTime);
	}
	public void leaving_Time(int leavingTime) {
		System.out.println("the Dental Doctor leaves at "+leavingTime);
	}
}

class Senior_Nurse extends Nurse{
	public void working_Time(int startingTime) {
		System.out.println("the Dental Doctor come at "+startingTime);
	}
	public void leaving_Time(int leavingTime) {
		System.out.println("the Dental Doctor leaves at "+leavingTime);
	}
	
	void guide_junior_Nurse() {
		System.out.println("the senior nurse will guide junior nurse");
	}
}