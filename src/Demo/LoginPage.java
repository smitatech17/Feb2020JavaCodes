package Demo;

public class LoginPage {
	
	public static void getUserDetails(String userName) {
		System.out.println("getting user details for " + userName);
	}
	
	public void login() {
		System.out.println("default login");
	}
	
	public void login(long number) {
		System.out.println("login with ph number " + number);
	}
	
	public void login(String username, String password) {
		
	}
	
	public void login(String username, String password, long phoneNumber) {
		
	}
	
	public void login(String socialMediaID) {
		
	}
	
	public void waitForElement(String element) {
		
	}
	
	public void waitForElement(String element, int timeout) {
		
	}
	
	public void waitForElement(String element, int timeout, String pageTitle) {
		
	}

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.login("Smita", "smita123");
		
		lp.login("smita sharma");
		
		
		

	}

}
