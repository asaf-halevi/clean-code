package employees;

public class SecurityOfficer extends Employee implements IEmployee {

	public SecurityOfficer(String n) {
		this.n = n;
		setJ("SecurityOfficer");
	}

	@Override
	public void writeProgram() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void openAnyDoor() {
		System.out.println("I can open any door in the building");		
	}
	
	public void shootSombody() {
		System.out.println("Silence! I kill you!!!");		
	}

	@Override
	public void managePeople() {
		// TODO Auto-generated method stub
		
	}

}
