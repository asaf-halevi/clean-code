package ocp.after;

public class Spider2 extends Animal2{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Spider2(String name) {
		this.name = name;
	}

	public void eat() {

		System.out.println(this.getName() + " eats flies");
	}

}
