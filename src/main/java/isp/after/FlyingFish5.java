package isp.after;

public class FlyingFish5 extends Animal5 implements Swimmable, Flyable{

	@Override
	public void eat() {
		System.out.println("I eat plankton");
	}

	@Override
	public void swim() {
		System.out.println("I swim well");
	}

	@Override
	public void fly() {
		System.out.println("I fly over water");
	}
}
