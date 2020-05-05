package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		if(b>=a) {
		System.out.println("b is greater than equal to a");
		}
		else{
			System.out.println("a is greater than b");	
		}
		
		// < > <= >= == !=
		
		int total  = 100;
		int tax = 50;
		int finalAmount = total+tax;
		
		int pendingAmount = 150;
		
		//whenever we have to compare 2 integer we have to use ==
		// = is assignment operator; 
		if(finalAmount == pendingAmount) {
			System.out.println("bill is paid");
		}
		else {
			System.out.println("please pay the pending amount....");
		}
		
		//String comparison
		//java is case sensitive
		String s1 = "This is Java";
		String s2 = "This is java";
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		//cross browser testing with selenium:
		//if - else if
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
		System.out.println("launch Chrome");	
		}
		
		else if (browser.equalsIgnoreCase("FF")) {
			System.out.println("launch FF");
		}
		
		else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("launch IE");
		}
		
		else {
			System.out.println("we don't support this browser: " + browser);
		}
		
		//debugging: to check your code steps by steps; see what is happening on each steps
		//break points/debugger - double click on the line on which you want to debug and run as debug mode and click 'F6' or 'Step Over' from the menu bar
		 
		
		//marks
		String studentName = "Sita";
		int marks = -1;
		
		if(studentName.equals("Nadia")) {
			marks = 90;
			System.out.println(studentName + "-----"+ marks);
			
		}
		else if (studentName.equals("Bibek")) {
			marks = 100;
			System.out.println(studentName + "-----"+ marks);
		}
		
		else if(studentName.equals("Smita")) {
			 marks = 80;
			System.out.println(studentName + "-----"+ marks);
		}
		
		else {
			System.out.println("this student is not available " + studentName + " ----- " + marks);
		}
		
		//if - if -if
		int amount  = 200;
		if(amount >= 100) {
			if (amount <=150) {
				System.out.println("Bill is paid");
			}
			else {
				System.out.println("bill is overpaid with some tip");
			}
		}
		else {
			System.out.println("Bill is not paid");
		}
		
		//WAP to print the highest number among three numbers ****interview question***
		int x = 200;
		int y = 500;
		int z = 300;
		
		if(x>y && x>z) { //false && false is equal to false; false && true is equal to false; and operator && is also called short circuit operator in java language
			System.out.println("x is the highest");
		} 
		else if(y>z) {
			System.out.println("y is the highest");
		}
		else {
			System.out.println("z is the highest");
		}
		
		// Or operator = ||
		//WAP to print the highest number among 4 numbers
		int m = 70;
		int n = 80;
		int o = 90;
		int p = 60;
		
		if(m>n && m>o && m>p) {
			System.out.println("m is the highest number");
		}
		else if(n>o && n>p) {
			System.out.println("n is the highest number");
		}
		else if(o>p) {
			System.out.println("o is the highest number");
		}
		else {
			System.out.println("p is the highest number");
		}
		
		}
		

}
