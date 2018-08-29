package adapter;

public class EmployeeDb implements IEmployee  {
	
	private int id ; 
	private String email; 
	private String firstName; 
	private String secondName;
	
	public EmployeeDb(int id , String email , String firstName , String secondName) {
		setId(id);
		setEmail(email); 
		setFirstName(firstName);
		setSecondName(secondName);
	}

	@Override
	public int getId() {
		return id; 
	}

	@Override
	public String getEmail() {
		return email ; 
	}

	@Override
	public String getFirstName() {
		return firstName; 
	}

	@Override
	public String getSecondName() {
		return secondName; 
	}

	
	public void setId(int id) {
		this.id=id; 
		
	}

	
	public void setEmail(String email) {
		this.email = email; 
	}

	
	public void setFirstName(String firstName) {
		this.firstName = firstName; 
	}

	
	public void setSecondName(String secondName) {
		this.secondName=secondName; 
	}
	
	@Override
	public String toString() {
		return "Id : " + this.getId() + " Fname : " + this.getFirstName() + 
				"SName : " + this.getSecondName() + " Email : " + this.getEmail() + "\n"; 
	}

}
