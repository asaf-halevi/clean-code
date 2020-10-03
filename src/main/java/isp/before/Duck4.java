package isp.before;

public class Duck4 implements Animal4 {

	@Override
	public void eat() {
		System.out.println("I eat fish");
	}

	@Override
	public void swim() {
		System.out.println("I swim with my legs");
	}

	@Override
	public void run() {
		System.out.println("Sometimes I run");
	}

	@Override
	public void fly() {
		System.out.println("I fly quit well");
	}
}
