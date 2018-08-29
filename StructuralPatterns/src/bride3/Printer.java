package bride3;

import java.util.List;
//This class does not know about the Formatter
//only the contract from the interface
public abstract class Printer {
	
	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails()); 
	}
	
	abstract protected List<Detail> getDetails() ; 
	abstract protected String  getHeader() ; 

}
