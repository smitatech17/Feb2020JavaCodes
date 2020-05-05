package JavaSessions;

public class Car {

	String name;
	String model;
	int price;
	static int wheels = 4;//common property with same value for all the objects
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "Audi";
		c1.model = "Q5";
		c1.price = 80;
		
		Car c2 = new Car();
		c2.name = "BMW";
		c2.model = "520d";
		c2.price = 85;
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		
		System.out.println(Car.wheels);
		
		
	}

}
