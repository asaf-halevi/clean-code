package ocp.after;

public class Fish2 implements Animal2{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fish2(String name) {
		this.name = name;
	}

	public void eat() {

		System.out.println(this.getName() + " eats smaller fish");
	}
}
