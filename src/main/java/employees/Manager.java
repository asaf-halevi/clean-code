package employees;

public class Manager extends Employee implements IEmployee {

	public Manager(String n) {
		this.n = n;
		setJ("Manager");
	}
	
	public void writeProgram() {
		System.out.println("I can write elaborate computer programs, but I don't have the time for it");
	}

	@Override
	public void openAnyDoor() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void managePeople() {
		System.out.println("You all do as i say!");	
	}

}
