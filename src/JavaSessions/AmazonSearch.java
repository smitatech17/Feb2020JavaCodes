package JavaSessions;

public class AmazonSearch {

//	public void search() {
//		System.out.println("0 param");
//	}
//	
//	//duplicate methods are not allowed but can pass the different parameters and different types of parameters 
//	//Method Overloading - within the same class
//	//having the same method name
//	//different parameters
//	//different types of parameters
//	//different sequence of parameters
//	
//	public void search(int a) {
//		System.out.println("1 param " + a);
//	}
//	
//	public void search(String test) {
//		System.out.println("1 param " + test);
//	}
//	public void search(int a, int b) {
//		
//	}
//	
//	public void search(int a, String d) {
//		
//	}
//	
//	public void search(String d, int a) {
//		
//	}
	
	//search overloading:
	public void search() {
		
	}
	
	public void search(String productName) {
		
	}
	
	public void search(String productName, int price, String color) {
		
	}
	
	public static void main(String[] args) {
		//main method is static in nature and don't need object to call the main method, it's in Common Memory Allocation
		
	AmazonSearch as = new AmazonSearch();
	as.search();
	as.search("iphone");
	as.search("apple macbook", 1000, "silver");
		
		
		
		
		
		
	}

}
