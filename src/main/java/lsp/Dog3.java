package lsp;

public class Dog3 extends Animal3{

	public Dog3(String name) {
		super(name);
	}

	@Override
	public String getFood() {
		return("meat");
	}

	public void bark() {
		System.out.println("woof woof");
	}
}
