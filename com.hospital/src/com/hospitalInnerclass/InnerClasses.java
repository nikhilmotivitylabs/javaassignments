package com.hospitalInnerclass;

//import com.hospital.Doctor;
//import com.hospital.Hospital;
//import com.hospital.Nurse;

public class InnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Hospital Doctor1=new Hospital();
//		Doctor1.operation();
//		
//		Hospital.Nurse nurse1=Doctor1.new Nurse();
//		nurse1.ready_Room();
		new Dental_Doctor() {
			void working_time() {
				System.out.println("Doctor will treat the patients");
			}
		}.working_time();
		
	}

}

//class Hospital {
//	String date="6 may 2022";
//	void operation() {
//		System.out.println("ready for the operations "+date);
//	}
//	class Nurse{
//		
//		void ready_Room() {
//			System.out.println("preapare the bed for operation "+date);
//		}
//	}
//}

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
	
}

