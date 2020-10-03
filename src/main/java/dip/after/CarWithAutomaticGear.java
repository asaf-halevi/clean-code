package dip.after;

public class CarWithAutomaticGear implements Car{

	public void switchToDrive() {
		System.out.println("Move handle to 'D'");
	}

	public void speedUp() {
		System.out.println("Step on the gas pedal");
	}

	@Override
	public void move() {
		switchToDrive();
		speedUp();
	}
}
