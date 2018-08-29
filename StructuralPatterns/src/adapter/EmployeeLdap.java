package adapter;

public class EmployeeLdap {
	private int cn ; 
	private String surname ; 
	private String givenName ;
	private String mail; 
	
	public EmployeeLdap(int cn , String mail , String givenName , String surname) {
		setCn(cn);
		setMail(mail); 
		setGivenName(givenName);
		setSurname(surname);
	}

	public int getCn() {
		return cn;
	}

	public void setCn(int cn) {
		this.cn = cn;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
