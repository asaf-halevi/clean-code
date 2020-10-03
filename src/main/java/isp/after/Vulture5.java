package isp.after;

public class Vulture5 extends Animal5 implements Flyable, Runnable {

	@Override
	public void eat() {
		System.out.println("I eat dead animals");
	}

	@Override
	public void run() {
		System.out.println("I run to gain speed before I fly");
	}

	@Override
	public void fly() {
		System.out.println("I fly higher than all the rest!");
	}
}
