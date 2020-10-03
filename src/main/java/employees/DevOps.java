package employees;

public class DevOps extends Employee implements IEmployee{

	public DevOps(String n) {
		this.n = n;
		setJ("DevOps");
	}
	
	public void writeProgram() {
		System.out.println("I can write simple computer programs");
	}
	
	public void uploadServer() {
		System.out.println("I can upload servers");
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
