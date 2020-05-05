package JavaSessions;

public class BasicOperators {

	public static void main(String[] args) {
		
		int x =0/9;
		System.out.println(x);
		
		//9/0 - AirthematicException

		int p = 10;
		int q = p%2; //% is called modulous in java and property of modulous is to give the reminder
		System.out.println(q); //0
		
		
		//even number
		int num = -12;
		if(num % 2 == 0) {
			System.out.println("even number");
		}
		else
			System.out.println("odd number");
		
		
		//positive number
		if(num>0) {
			System.out.println("positive number");
		}
		else if (num<0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("number is 0");
		}

		//Ternary Operator - ?: just like if else conditions; if condition is satisfied, it will pick first value, if not then only second value
		int z  = 8;
		String s = (z>10) ? "Hi" : "Bye";
		System.out.println(s);
		
		int n1 = 20;
		int n2 = 30;
		int max;
		max = (n1>n2) ? n1 : n2;
		System.out.println("max number is " + max);
		
		String browser = "chrome";
		String s1 = (browser.equals("chrome")) ? "Launch chrome" : "Launch ff";
		System.out.println(s1);
		
		
		//Dead Code- if the first condition is always satisfied and never comes in the else part and will get the yellow line
		if(true) {
			System.out.println("this is true");
		}
		else {
			System.out.println("bye"); 
		}
		
		
		//this is not the dead code because the condition can be changed
		boolean flag = true;
		if(flag) {
			System.out.println("This is true");
		}
		else {
			System.out.println("bye");
		}
		
		//! not condition; is always applied to boolean and will reverse the value
		boolean flag1 = true;
		if(!flag) {
			System.out.println("This is true");
		}
		else {
			System.out.println("bye");
		}
		
		String name = "Smita";
		if(! name.equals("")){
			System.out.println("name is " + name);
		}
		else {
			System.out.println("value is blank");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
}
}