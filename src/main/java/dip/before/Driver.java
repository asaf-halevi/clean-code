package dip.before;

public class Driver {
	
	CarWithManualGear car;
//	CarWithAutomaticGear car;
	
	public Driver(CarWithManualGear car){
		this.car = car;	
	}
	
//	public Driver(CarWithAutomaticGear car){
//		this.car = car;	
//	}
	
	public void drive() {
		for (int i=0; i < car.getNumberOfGears(); i++) {
			car.stepOnClutch();
			car.moveToHigherGear();
			car.releaseClutch();
			car.speedUp();	
		}
		
//		car.switchToDrive();
//		car.speedUp();
	}

	public static void main(String[] args) {
		Driver driver = new Driver(new CarWithManualGear());
//		Driver driver = new Driver(new CarWithAutomaticGear());
		
		driver.drive();
	}
}
