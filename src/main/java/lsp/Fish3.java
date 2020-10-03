package lsp;

public class Fish3 extends Animal3{

	public Fish3(String name) {
		super(name);
	}

	@Override
	public String getFood() {
		return("smaller fish");
	}

	public void swim() {
		System.out.println("I'm swimming");
	}
}
