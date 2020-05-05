package JavaSessions;

public class StaticMethodOverloading {
	
	//can we overload the static method? yes, we  can overload the static method
	public static void getName() {
		
	}
	
	public static void getName(int a) {
		
	}
	
	//can we overload the main method? yes, main method can be overloaded too but need to change the parameters
	//JVM is always looking for the particular/signature main method and will run that method only where class can be called
//	public static void main(String[] args) {
//		System.out.println("main method");
//		StaticMethodOverloading.main(10); // can call static method by class name; can call non-static method by creating object
//		StaticMethodOverloading.main(10,  20);
//
//	}
	
	//JVM can run this method with string and array
	public static void main(String a[]) {
		System.out.println("main method");
		StaticMethodOverloading.main(10);
		StaticMethodOverloading.main(10,  20);

	}
	
	public static void main(int a) {
		System.out.println("main method " + a);

	}
	
	public static void main(int a, int b ) {
		System.out.println("main method " + a + b);

	}

}
