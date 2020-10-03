package lsp;

public class Spider3 extends Animal3 {

	public Spider3(String name) {
		super(name);
	}

	@Override
	public String getFood() {
		return("flies");
	}

	public void buildWeb() {
		System.out.println("I'm building a web");
	}
}
