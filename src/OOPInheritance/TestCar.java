package OOPInheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();//overridden method
		b.stop();//coming from parent
		b.refuel();//coming from parent
		b.autoParking(); //coming from same class - separate feature of BMW; reference type check will pass here and b.autoparking(); is allowed to access.
		b.engine();//coming from grand parent
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//Top/Up Casting:
		Car c1 = new BMW();//child class object can be referred by parent class reference variable - Top casting
		
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new BMW();
		
		//Reference type check: Reference type check will fail here. trying to access from parent class reference and pointing to child class object; eg. c1.autoParking(); which is special feature of BMW; is not allowed to access by parent class reference
		//object reference and object should be from same class to have the reference type check pass.
		
		//down casting: is not allowed at the run time; only allowed in the compile time
//		BMW b1 = (BMW) new Car(); // will get the ClassCastException. OOPInheritance.Car cannot be cast to OOPInheritance.BMW
		
		
		
	}

}
