package adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
	private int id ; 
	private String email; 
	private String fname; 
	private String sName; 
	//EmployeeCSV employeeCSV = new EmployeeCSV("2345,jimJones,Walsh,jimjoneswalsh@gmail.com")
	public EmployeeCSV(String csvString) {
		StringTokenizer tokenizer = new StringTokenizer(csvString , ",");
		if(tokenizer.hasMoreElements()) {
			setId(Integer.parseInt(tokenizer.nextToken()));
		}
		if(tokenizer.hasMoreElements()) {
			setFname(tokenizer.nextToken());
		}
		if(tokenizer.hasMoreElements()) {
			setsName(tokenizer.nextToken());
		}
		if(tokenizer.hasMoreElements()) {
			setEmail(tokenizer.nextToken());
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

}
