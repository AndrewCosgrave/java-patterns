package adapter;

public class EmployeeAdapterLdap implements IEmployee {
	
	private EmployeeLdap instance; 
	
	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance=instance; 
	}

	@Override
	public int getId() {
		return instance.getCn();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getSecondName() {
		return instance.getSurname();
	}
	@Override
	public String toString() {
		return "Id : " + instance.getCn() + " Fname : " + instance.getGivenName() + 
				"SName : " + instance.getSurname() + " Email : " + instance.getMail(); 
	}

}
