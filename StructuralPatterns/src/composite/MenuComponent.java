package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	String name; 
	String url ; 
	List<MenuComponent> menuComponents = new ArrayList<>();
	
	
	public MenuComponent add(MenuComponent component) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}
	
	public MenuComponent remove(MenuComponent component) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}
	
	public String getName() {
		return name; 
	}
	
	public String getUrl() {
		return url;
	}
	
	public abstract String toString();
	
	String print(MenuComponent component) {
		StringBuilder sb = new StringBuilder(name); 
		sb.append(": ");
		sb.append(url);
		sb.append("\n"); 
		return sb.toString();
	}

}
