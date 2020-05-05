package OOPEncapsulation;

public class Employee {
	
	public String name;
	private int age;
	
	//private variables can be accessed only within the class; cannot access outside the class
	//have to create getter and setter method to access the private class variables outside the class
	
	public void getCity() {
		System.out.println("get city");
	}
	
	private void getCountry() {
		System.out.println("get country");
	}
	
	//have to create getter and setter method to access the private class variables
	//Setter Method:
	public void setAge(int age) {
		this.age = age;
	}
	
	//Getter Method:
	public int getAge() {
		return age;
	}
	

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "Tom";
		e.age = 25;
		System.out.println(e.name + " " + e.age);
		
		e.getCity();
		e.getCountry();
		
		
		
		

	}

}
