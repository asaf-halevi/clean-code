package ocp.before;

public class Fish1 {

	private String name;

	public Fish1(String name) {
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
		System.out.println(this.name + " eats smaller fish");
	}
}
