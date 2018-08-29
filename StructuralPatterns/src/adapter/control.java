package adapter;

import java.util.List;

public class control {
	
	public static void main(String [] args) {
		EmployeeClient client = new EmployeeClient(); 
		List<IEmployee> employees = client.getEmployeeList();
		System.out.println(employees);
	}

}
