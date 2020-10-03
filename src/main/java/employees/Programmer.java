package employees;

public class Programmer extends Employee implements IEmployee {

	public Programmer(String n) {
		this.n = n;
		setJ("Programmer");
	}
	
	public void writeProgram() {
		System.out.println("I can write elaborate computer programs");
	}

	@Override
	public void openAnyDoor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managePeople() {
		// TODO Auto-generated method stub
		
	}

}
