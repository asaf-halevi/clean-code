package isp.after;

public class Duck5 extends Animal5 implements Flyable, Runnable, Swimmable {

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
