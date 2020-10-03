package lsp;

public abstract class Animal3 {

	private String name;

	public Animal3(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(this.getName() + " eats " + this.getFood());
	}

	public abstract String getFood();
}
