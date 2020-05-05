package OOPAbstract;

public class HomePage extends Page{

	@Override
	public void header(String name) {
		System.out.println("home page -- header "+ name);
	}

	@Override
	public void title(String title) {
		System.out.println("home page -- title "+ title);
	}

	@Override
	public void search() {
		System.out.println("search on Home Page");
	}
}
