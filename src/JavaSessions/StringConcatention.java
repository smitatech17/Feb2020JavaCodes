package JavaSessions;

public class StringConcatention {

	public static void main(String[] args) {
		//concatenation is merging/joining
		//concatenation operator is '+'
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "Java";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("the value of a is:" + a);
		System.out.println("the value of b is:" + b);
		
		System.out.println("sum of a and b is:" +a+b);
		System.out.println("sum of a and b is:" +(a+b));
		
		int total = 100;
		int finalamount = total + 50;
		System.out.println("final amount is" + " " + finalamount);
		System.out.println("final amount is" + " " + (total+50));

	}

}
