package ExceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {

		System.out.println("A");
		
		try {
		int i = 9/0;
		}
		catch(Exception e) {
			System.out.println("divide by zero");
		}
		
		//finally is a block with finally keyword
		//doesn't matter if there is exception or not, catch or not, finally block is always executed. we can create try block without catch block but have to write finally block.
		finally {
			System.out.println("I am in finally block");
		}
	}

}
