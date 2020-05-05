package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception{

		//throws keyword is used for throwing the exception from one method to the other method but never handles it; have to write try catch block to handle the exception
		//always read stacktrace from the bottom in the console
		
		ThrowsKeyword obj = new ThrowsKeyword();
		
		try {
		obj.launchBrowser();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void launchBrowser() throws Exception{
		System.out.println("LB");
		checkversion();
	}
	
	public void checkversion() throws Exception{
		System.out.println("CV");
		checkPlugin();
	}
	
	public void checkPlugin() throws Exception{
		System.out.println("CP");
		int i = 9/0;
	}

}
