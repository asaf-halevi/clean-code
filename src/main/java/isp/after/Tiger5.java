package isp.after;

public class Tiger5 extends Animal5 implements Swimmable, Runnable {

	@Override
	public void eat() {
		System.out.println("I eat other animals");
	}

	@Override
	public void swim() {
		System.out.println("I can swim when I have to");
	}

	@Override
	public void run() {
		System.out.println("I run very well");
	}
}
