package dip.after;

public class Driver {

	Car car;

	public Driver(Car car){
		this.car = car;
	}

	public void drive() {
		car.move();
	}

	public static void main(String[] args) {
		Driver driver = new Driver(new CarWithManualGear());
//		Driver driver = new Driver(new CarWithAutomaticGear());

		driver.drive();
	}
}
