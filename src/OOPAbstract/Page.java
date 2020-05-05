package OOPAbstract;

public abstract class Page {
	
	//can create constructor of abstract class and constructor will be called when we are creating the object of the child class; first preference will be given to parent class constructor and then the child class constructor
	//interfaces can not have constructor but abstract can have. same rule will be applied for both abstract and non-abstract classes while calling the constructor in test class
	
	public Page() {
		System.out.println("Page default constructor...");
	}
	
	public Page(int i) {
		System.out.println("1 param constructor....");
	}

	public abstract void header(String header);
	public abstract void title(String title);
	
	public void search() {
		System.out.println("Page -- search");
	}
	
	//can not create the object of abstract class
	//can have 0 to 100% abstraction-- can have 0%, partial and 100% abstraction 
	//combination of abstract and non-abstract methods
	//0% abstraction - no abstract method in an abstract class
	
	
	
}
