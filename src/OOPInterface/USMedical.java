package OOPInterface;

public interface USMedical extends GHC {

	//in interface, methods cannot have method body
	//interfaces can not have constructor
	
	int min_fee = 10; // we can create variable in interface but by default, interface variable are final and static. no need to write static and since, this is static in nature, we can't create object of interface; we can access this variable in test class by interface name.variable. Since, this is final, we can't change the value
	
	
	public void orthoServices();//an abstract method or prototype of the body; without method body
		
	public void physioServices();
	
	public void NineOneOneServices();
	
	public void ENTServices();
	
	//interfaces are 100% abstraction -- all methods are abstract in nature
	
	
	//after JDK 1.8: method body is allowed in Interface:
	//static method is allowed with method body:
	//can't override the static method so have to call by class name in test class; not by the object reference
	
	public static void bloodBank() {
		System.out.println("US -- blood bank");
	}
	
	//default method: with default keyword; can override default method
	default void FDA() {
		System.out.println("US -- FDA");
	}
}
