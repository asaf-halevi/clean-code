package employees;

public class EmployeesController {

	public static void main(String[] args) {
		EmployeesService employeesService = new EmployeesService();
		employeesService.add(new Manager("Gadi"));
		employeesService.add(new TeamLeader("Liat"));
		employeesService.add(new TeamLeader("Roie"));
		employeesService.add(new Programmer("Amit"));
		employeesService.add(new Programmer("Root"));
		employeesService.add(new DevOps("Vadim"));
		employeesService.add(new Janitor("Shlomi"));
		employeesService.add(new SecurityOfficer("John"));
		
		System.out.println("There are " + (employeesService.getAll() != null ?  employeesService.getAll().size() : 0) + " employees. Here they are:\n");
		
		for (Employee e : employeesService.getAll()) {
			System.out.println("My name is " + e.n);
			System.out.println("I am a " + e.getJ());
			if (e instanceof Programmer) {
				((Programmer) e).writeProgram();
			} else if (e instanceof TeamLeader){
				((TeamLeader) e).writeProgram();
				((TeamLeader) e).managePeople();				
			} else if (e instanceof DevOps){
				((DevOps) e).writeProgram();
				((DevOps) e).uploadServer();
			} else if (e instanceof Manager){
				((Manager) e).writeProgram();
				((Manager) e).managePeople();
			} else if (e instanceof Janitor){
				((Janitor) e).openAnyDoor();
				((Janitor) e).cleanUp();
			} else if (e instanceof SecurityOfficer){
				((SecurityOfficer) e).openAnyDoor();
				((SecurityOfficer) e).shootSombody();
			}
			System.out.println("------------------------\n");
		}
		
		System.out.println("As you can see, there are " + (employeesService.getAll() != null ?  employeesService.getAll().size() : 0) + " employees.\n");
		
	}
}
