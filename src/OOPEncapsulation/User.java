package OOPEncapsulation;

public class User {
	
	private String name;
	private int age;
	private long phone;
	
	private void getUserSalary() {
		System.out.println("get user salary");
	}
	
	//to access the private method, we create another public method; wrapper on top of the private method to get access on the other class
	public void getUserSalaryInfo() {
		getUserSalary();
	}
	
	//to access the private class variables, we create getter and setter method
	//right click----->source----->Generate Getters and Setters----> select the one you need to create getter and setter method---->select public as access modifier---->ok
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	public static void main(String[] args) {
		
		
		
		

	}

	

}
