package JavaSessions;

import java.util.ArrayList;

public class Company {

	String name; 
	String ceo;
	String productName;
	long revenue;
	int empCount;
	static int holidayCount = 20;
	
	ArrayList<String> branchList;
	
	//constructor of class:
	//constructor name will be the class name
	//cannot return any value
	//don't write any return type
	//it looks like a function but it's not a function
	//constructor can be overloaded
	//methods will be stored inside the object but the constructor will never be stored inside the object
	//we should never write static class variable inside the constructor and shouldn't pass as the object property
	//constructor with 0 parameter is called default constructor
	
	public Company() {
		System.out.println("default constructor");
	}
	
	public Company(int a) {
		System.out.println("one parameter constructor...." + a);
	}
	
	//create the constructor with class variables: constructor is very helpful to initialize the class property/variables and constructor will be called whenever we are creating the object of that particular class
	//this is the keyword to access the class variable
	//what is the difference between constructor and the function? - we never write return statement in constructor, we never write void or int but function may or maynot return value; function may be void or non-void
	//constructor name will remain same as class name
	
	
//	public Company(String name, String ceo, String productName, long revenue, int empCount) {
//		this.name = name;
//		this.ceo = ceo;
//		this.productName = productName;
//		this.revenue = revenue;
//		this.empCount = empCount;
//	}
	
	public Company(String name, String ceo, String productName) {
		this.name = name;
		this.ceo = ceo;
		this.productName = productName;
	}
	
	//shortcut to constructor of the class variable: right click---->source---->generate constructor using fields----->select the field you initializing and finish
	public Company(String name, String ceo, String productName, long revenue, int empCount) {
		this.name = name;
		this.ceo = ceo;
		this.productName = productName;
		this.revenue = revenue;
		this.empCount = empCount;
		
	}
	
	public Company(String name, String ceo, String productName, long revenue, int empCount, ArrayList<String> branchList) {
		this.name = name;
		this.ceo = ceo;
		this.productName = productName;
		this.revenue = revenue;
		this.empCount = empCount;
		this.branchList = branchList;
	}
	
	public static void main(String[] args) {
		
		//the moment we create an object of the class, it will automatically check how many constructor does it have and called the constructor on the basis of the parameters passed
		//constructor is called as soon as the object is created
		//can create n number of constructors
		Company c1 = new Company();
		Company c2 = new Company("Google", "Sundar Pichai", "Google Cloud", 1000000, 10000);
		Company c3 = new Company("MS", "Nadella", "MS Azure", 11000, 20000);
		Company c4 = new Company("ABC Co", "Tom", "Apple", 1000, 2000);
		Company c5 = new Company("XYZ Co", "Steve", "Samsung");
		System.out.println(Company.holidayCount); //holidayCount is the common property value, stated as Static class variable so called by class.holidayCount
		
		System.out.println(c2.name);
		System.out.println(c2.ceo);
		System.out.println(c2.productName);
		System.out.println(c2.revenue);
		System.out.println(c2.empCount);

		System.out.println(c4.name + " " + c4.ceo + " " + c4.empCount + " " + c4.productName);
		System.out.println(c5.name + " " + c5.ceo + " " + c5.empCount + " " + c5.productName);
		
		ArrayList<String> branches = new ArrayList<String>();
		branches.add("CA");
		branches.add("London");
		branches.add("HYD");
		Company comp1 = new Company("Google", "Sundar Pichai", "Chrome", 1000000, 10000, branches);
		
		System.out.println(comp1.name + " " + comp1.branchList);
		System.out.println(comp1.name + " " + comp1.branchList.get(1));
		
	}

}
