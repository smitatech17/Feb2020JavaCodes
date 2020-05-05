package WebDriverArch;

public class LoginPageTest {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "firefox";
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver(); // top casting
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get("http://www.google.com");
		driver.findElement("usChromeDriverername");
		driver.findElement("password");
		driver.findElement("login");
		
		System.out.println(driver.getTitle());
	}

}
