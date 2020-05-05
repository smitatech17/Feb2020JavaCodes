package WebDriverArch;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("launch Google Chrome");
	}

	@Override
	public void get(String url) {
		System.out.println("launching the url " + url);
	}

	@Override
	public void findElement(String element) {
		System.out.println("finding element " + element);
	}

	@Override
	public String getTitle() {
		System.out.println("get the page title");
		return "google";
	}

	
	public void addPlugin() {
		System.out.println("chrome -- plugin");
	}
}
