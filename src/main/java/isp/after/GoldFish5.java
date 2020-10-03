package isp.after;

public class GoldFish5 extends Animal5 implements Swimmable {

	@Override
	public void eat() {
		System.out.println("I eat Goldfish food");
	}

	@Override
	public void swim() {
		System.out.println("I swim well");
	}
}
