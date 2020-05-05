package JavaSessions;

public class StaticConcept {

	//class variables: class variables can be static and non-static
	String name;
	static int age;
	
	public void getName() {
		System.out.println("get Name");
	}
	
	public static void getValue() {
		System.out.println("get Value");
	}
	
	
	public static void main(String[] args) {
		
		//static is not allowed for method variables; only allowed for class variables; never declare static variable inside the method
		//Method variables:
		//int i = 10;
		
		StaticConcept obj = new StaticConcept();
		//object will not hold static variables and static method
		//static variables and method are allocated in Common Memory Allocation(CMA)
		
		obj.name = "Tom";
		age = 25;
		
		//static way:
		System.out.println(age);
		getValue();//static value and method can be called directly inside the main method without the object reference
		
		System.out.println(StaticConcept.age);
		StaticConcept.getValue();//static method can be called by class name
		obj.getValue();//static method cane be called by object reference too but with a warning so it's not the good practice
		obj.getName();//non-static method is called by object reference only
		
	}

}
