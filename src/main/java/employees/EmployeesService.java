package employees;

import java.util.ArrayList;

public class EmployeesService {

	private ArrayList<Employee> es;

	public EmployeesService() {
		es = new ArrayList<>();
	}

	public ArrayList<Employee> getAll() {
		return es;
	}

	public void add(Employee e) {
		es.add(e);
	}


}
