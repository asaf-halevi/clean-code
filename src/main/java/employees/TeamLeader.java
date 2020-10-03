package employees;

public class TeamLeader extends Employee implements IEmployee {

	public TeamLeader(String n) {
		this.n = n;
		setJ("TeamLeader");
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
		System.out.println("You do as i say!");	
	}

}
