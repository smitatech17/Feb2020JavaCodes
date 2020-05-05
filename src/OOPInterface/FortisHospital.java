package OOPInterface;

public class FortisHospital extends WHO implements USMedical, UKMedical, IndianMedical{

	//extends keyword when using class to class
	//implements is the keyword when using interface as a parent of the class
	//have to override or implement all the methods which are in the USMedical Interface; FortisHospital has to define all the overridden methods
	//have to implement only one method in the class if there are common methods in different interfaces; can't have duplicate methods in the class
	//click add unimplemented methods from the error
	//class can implements multiple interfaces and extends one parent class
	//Interface can extends from another Interface and class has to implement the method from that grandparent Interface too
	
	@Override
	public void FDA() {
		System.out.println("FDA services");
	}
	
	@Override
	public void birthControl() {
		System.out.println("FS -- birthControl");
	}
	
	@Override
	public void orthoServices() {
		System.out.println("FS -- orthoServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FS -- physioServices");
		
	}

	@Override
	public void NineOneOneServices() {
		System.out.println("FS -- NineOneOneServices");
		
	}
	
	@Override
	public void ENTServices() {
		System.out.println("FS -- ENTServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FS -- emergencyServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FS -- oncologyServices");
		
	}

	@Override
	public void pathologyServices() {
		System.out.println("FS -- pathologyServices");
		
	}

	@Override
	public void OPTServices() {
		System.out.println("FS -- OPTServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FS -- cardioServices");
		
	}
	
	//non-override methods:
	public void gynecServices() {
		System.out.println("FS -- gynecServices");
	}
	
	public void medicalInsuranceServices() {
		System.out.println("FS -- medicalInsuranceServices");
	}
	
	public void nueroServices() {
		System.out.println("FS -- nueroServices");
		
	}

	

	
	
	
	
	
	
	
	
	
}
