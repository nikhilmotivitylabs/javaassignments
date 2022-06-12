package FactoryMethod;

abstract class Hospital {
	abstract void Incoming_Time();
	abstract void Leaving_Time();
	
	void welcome() {
		System.out.println("welcome to hospital");
	}
}

class Heart_specilist extends Hospital{
	void Incoming_Time() {
		System.out.println("Heart_specilist comes at 9.00am");
	}
	void Leaving_Time() {
		System.out.println("Heart_specilist leaves at 9.00pm");
	}
}

class Dentist extends Hospital{
	void Incoming_Time() {
		System.out.println("Dentist comes at 12.00pm");
	}
	void Leaving_Time() {
		System.out.println("Dentist leaves at 9.00pm");
	}
}

class HospitalFactory{
	static Hospital getAppointment(String department) {
		if(department.equals("Heart"))
			return new Heart_specilist();
		else if(department.equals("Dentist "))
			return new Dentist();
		return null;
	}
}

public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HospitalFactory cf=new HospitalFactory();
		Hospital x=HospitalFactory.getAppointment("Heart");
		x.Incoming_Time();
		x.Leaving_Time();
		x.welcome();

	}

}
