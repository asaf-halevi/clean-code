package employees;

public class Janitor extends Employee implements IEmployee {

	public Janitor(String n) {
		this.n = n;
		setJ("Janitor");
	}
	
	@Override
	public String getJ() {
		return "I am the most importnat guy in this organization!";
	}

	@Override
	public void writeProgram() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void openAnyDoor() {
		System.out.println("I can open any door in the building");		
	}
	
	public void cleanUp() {
		System.out.println("I'll clean everything up. Sure, leave it to me, don't bother pick that piece of paper off the floor...");		
	}

	@Override
	public void managePeople() {
		// TODO Auto-generated method stub
		
	}

}
