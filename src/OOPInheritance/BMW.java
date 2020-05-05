package OOPInheritance;

public class BMW extends Car{ //extends is the keyword between two classes; BMW is child class or sub class; car is super class or parent class of BMW

	//can access only one parent, cannot access more than one parent
	//multi label( label 1 - child, label 2-parent, label 3 - grand parent) inheritance is allowed but multiple inheritance( extending more than one classes) is not allowed
	//multiple inheritance problem in java is called diamond problem; to solve diamond problem, there is interfaces
	//Method Overriding: is always happening between parent and child classes; parent having the same method name and parameters and child override the same method
	//Method overriding is not allowed for static method but method overloading is allowed for static method
	//static is stored in the common memory allocation, not in the object and method overriding is called through the object only so not allowed to override the static method
	
	
	@Override //@Override annotation: if we try to write this annotation on the method which is not overridden then it will show the error
	public void start() {//overridden method
		System.out.println("BMW --- start");
	}
	
	
	public void autoParking() {
		System.out.println("BMW --- autoParking");
		}
		
	public void theftSafety() {
		System.out.println("BMW --- theftSafety");
		}
		
		
		
	

}
