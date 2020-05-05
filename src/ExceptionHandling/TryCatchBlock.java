package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		//exception is unwanted code suddenly coming in code and terminating the program
		//Exception is the parent class of ArithematicException, NullpointerException, ArrayIndexOutOfBoundsException,...
		//Throwable is the parent of Exception and Error class
		//Throwable, Exception and specific exception like ArithematicException will also handle the exception
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		
//		try{
//			int i = 9/0;
//			System.out.println("ABC");//this code will not be executed because after exception occurs in line 14, it will jump to catch block; never comes to line 15
//		}
//		catch(Exception e) { //Exception is the default class and e is the reference 
//			System.out.println("some exception occured");
//			System.out.println(e.getMessage());
//			e.printStackTrace(); // stacktrace gives the complete info about the exception and not terminate the program, which line, what type of exception occurred along with message
//		}
		
		//with one single try block, we can create multiple catch block
		try {
			int i = 9/3;
			System.out.println("ABC");
			int p[] = new int[2];
			p[0] = 10;
			p[1] = 20;
			p[2] = 30;
		}
		catch(ArithmeticException e) {
			System.out.println("some exception occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		catch(NullPointerException e) {
			
		}
		
		
		System.out.println("A");
		System.out.println("A");
		
		
		
	}

}
