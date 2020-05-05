package JavaSessions;

import Demo.LoginPage; // have to import the package to access the class of the different package

public class Employee {

	//properties
	//class variables - it is declared right after the class
	String name;
	int age;
	String role;
	int empId;
	boolean isPermanent;
	
		
	public static void main(String[] args) {
		
		//create object of Employee class:
		//use new keyword
		
		Employee e1 = new Employee(); //object is RHS - new Employee() and is referred by 'e1' and is called object reference name or object reference variable and type of e1 is Employee and Employee is the class
		Employee e2 = new Employee(); // can create multiple objects
		//copy of class variables/ properties is given to each objects
		
		e1.name = "Tom";
		e1.age = 25;
		e1.role = "QA";
		e1.empId = 101;
		e1.isPermanent = true;
		
		e2.name = "Sandhya";
		e2.age = 26;
		e2.role = "Senior QA";
		e2.empId = 102;
		e2.isPermanent = false;
		
		System.out.println(e1.name + " " + e1.age +" " + e1.empId +" "+ e1.role + " " + e1.isPermanent);
		System.out.println(e2.name + " " + e2.age +" " + e2.empId +" "+ e2.role + " " + e2.isPermanent);
		
		Employee e3 = new Employee();
		e3.name = "Nadia";
		e3.age = 27;
		e3.isPermanent = true;
		
		System.out.println(e3.name + " " + e3.age +" " + e3.empId +" "+ e3.role + " " + e3.isPermanent);
		
		
		//create object without reference variable:
		new Employee().name = "Saroj";
		new Employee().age = 25;
		
		//Garbage Collector
		//JVM is monitoring inside the memory. Unnecessary allocation inside the memory makes the program very slow
		//Garbage collector gets the order from JVM and destroy the objects without reference name and doesn't touch the objects with the reference names
		//Auto Garbage collector - JVM will take a decision when to order the Garbage collector
		
		//programmer calling Garbage Collector
		//running the Garbage Collector, GC couldn't take the decision and send request to JVM about programmer request. JVM will monitor and if needed JVM will order GC to destroy and if not, GC won't do anything. JVM will take the decision
		//System.gc();

		
		//null object reference:
		Employee e5 = new Employee();
		e5 = null;
		//e5.name = "Sree";//NullPointerException when object reference is pointing to Null and can't access to any properties
		//System.out.println(e5.name);
		
		//Garbage collector will destroy those objects which are not having names as well as which are having null references
		
		e5 = new Employee();
		e5.name = "Sree";
		System.out.println(e5.name);
		
		
		//can call method of a class in different class
		//call the methods of LoginPage class:
		LoginPage lp = new LoginPage();
		lp.login();
		lp.login(89482948);
		
		LoginPage.getUserDetails("Tom");
		
		Company comp = new Company();
		Company comp1 = new Company(110);
		
		
		
	}

}
