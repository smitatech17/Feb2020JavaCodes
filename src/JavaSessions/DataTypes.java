package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
	
		//Data types: Type of data supported by programming language
		//1. Primitive Data types
			//a. boolean: true / false
			//b. Numeric type: Integer family:
				//integer: byte short int long
				//floating: float double
		//2. Non-primitive data types: String Array
		
		
		//1. byte:
		//size: 8 bits
		//range: -128 to 127
		byte b = 10;
		b = 20;
		byte b1 = 0;
		byte b2 = -1;
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2+b);
		System.out.println(2+2);
		
		//2. Short
		//size: 16 bits  = 2 bytes
		//Range: -32768 to 32767
		short a = 100;
		short a1 = -90;
		
		System.out.println(a+a1);
		
		//3. int:
		//size: 32 bits = 4 bytes
		//Range: -2147483648 to 2147483647
		int i = 1000;
		int k = -900;
		int l = 0;
		
		System.out.println(i+k+l);
		System.out.println((i+k)*l);
		
		//4 long
		//size: 64 bits = 8 bytes
		long l1 = 100000000;
		System.out.println(l1);
		
		//5. float
		//size: 32 bits = 4 bytes
		//Range: upto 7 decimal digits
		float f1 = 12.33f;
		float f2 = (float)34.44;
		float f3 = 100; //100.0
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		//6. double:
		//size: 64 bits = 8 bytes
		//Range: upto 16 decimal digits
		double d1 = 12.333;
		
		System.out.println(d1);
		System.out.println(f1+i);
		
		//boolean: true or false
		//size: ~1 bit
		boolean flag = true;
		boolean flag1 = false;
		
		//char:
		//only single digit value and is within single code
		//ASCII values - defined for any programming language
		//char will take ASCII values
		//ASCII range for a-z is 97 to 122
		//ASCII range for A-Z is 65 to 90
		//ASCII range for 0-9 is 48 to 57
		//size: 16 bits = 2 bytes
		char c1 = 'a'; // ASCII value for a = 97
		char c2 = '5';
		char c3 = '$';
		char c11 = 'b'; // ASCII value for b = 98
		
		System.out.println(c1+c11); // 97 + 98
		
		//String:
		String str = "Hello World";
		
		System.out.println(str);
		
		String str1 = "1000";
		System.out.println(str1+20);//concatenation
		
		String str2 = "this is my first java code";
		System.out.println(str2 + str);
		System.out.println(str2 + " " + str);
		
		
	}

}
