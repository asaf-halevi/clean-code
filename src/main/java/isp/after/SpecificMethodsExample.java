package isp.after;

public class SpecificMethodsExample {
	
	public void makeAnimalFly (Flyable animal) {
		animal.fly();
	}
	
	public void makeAnimalRun (Runnable animal) {
		animal.run();
	}
	
	public void makeAnimalSwim (Swimmable animal) {
		animal.swim();
	}
	
	public static void main(String[] args) {
		SpecificMethodsExample specificMethodsExample = new SpecificMethodsExample();
		Duck5 duck = new Duck5();
		specificMethodsExample.makeAnimalFly(duck);
		specificMethodsExample.makeAnimalRun(duck);
		specificMethodsExample.makeAnimalSwim(duck);
		
	}

}
