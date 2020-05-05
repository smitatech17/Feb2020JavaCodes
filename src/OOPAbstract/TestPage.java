package OOPAbstract;

public class TestPage {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.search();
		lp.header("Google Login");
		lp.title("Google account login");
		lp.doLogin();
		
		HomePage hp = new HomePage();
		hp.search();
		
		Page p = new LoginPage();
		p.search();
		p.header("facebook");
		p.title("FB login");
		
		
		
		
		
	}

}
