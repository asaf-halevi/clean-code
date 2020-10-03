package dip.before;

public class CarWithManualGear {

	private static final int NUMBER_OF_GEARS = 5;
	int gear = 0;

	public int getNumberOfGears() {
		return NUMBER_OF_GEARS;
	}

	public void moveToHigherGear() {
		System.out.println("Move handle to gear " + ++gear);
	}

	public void stepOnClutch() {
		System.out.println("Step on the clutch pedal");
	}

	public void releaseClutch() {
		System.out.println("Release the clutch pedal");
	}

	public void speedUp() {
		System.out.println("Step on the gas pedal");
	}
}
