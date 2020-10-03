package isp.before;

public class Vulture4 implements Animal4 {

	@Override
	public void eat() {
		System.out.println("I eat dead animals");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
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
