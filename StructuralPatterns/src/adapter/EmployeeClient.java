package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<IEmployee> getEmployeeList(){
		List<IEmployee> employees = new ArrayList<>(); 
		IEmployee databaseEmp = new EmployeeDb(101, "andrew@gmail.com" , "andrew" , "Lyons");
		employees.add(databaseEmp);
		
		EmployeeLdap emp = new EmployeeLdap(111, "andy@gmail.com" , "andy" , "Cozz");
		employees.add(new EmployeeAdapterLdap(emp));
		
		EmployeeCSV employeeCSV = new EmployeeCSV("2345,jimJones,Walsh,jimjoneswalsh@gmail.com");
		employees.add(new EmployeeCSVAdapter(employeeCSV));
		
		return employees; 
	}
}
