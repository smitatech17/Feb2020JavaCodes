package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		//throw keyword is used while generating custom exception
		
		try {
			throw new Exception("SMITAEXCEPTION");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
