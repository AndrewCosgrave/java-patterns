package composite;

import java.util.HashMap;
import java.util.Map;

//tree structured 
//component
//leaf or composite -- leave has operations composite has 
//also operations but knows about child operations 

//Componets are : 
// Component
//  Leaf 
//  composite
//


/*
 * ReCap 
 * Composite is Tree structure 
 * Leaf and Composit have same interface
 * Promotes unity betweeen objects   
 * 
 * generalizes a hierarchiacal structure 
 * Can simply things to much 
 * Easier for client programming 
 * composite != Composition 
 * 
 */
public class Control {
	
	public static void main(String[] args) {
		
		Map<String,String> personAttrs = new HashMap<>();
		personAttrs.put("site_role" , "person"); 
		personAttrs.put("access_role", "limited");
		Map<String , String> groupAttributs = new HashMap<>();
		groupAttributs.put("group_role", "claims") ; 
		Map<String , String> secAttributs = new HashMap<>();
		secAttributs.putAll(personAttrs); 
		secAttributs.putAll(groupAttributs);
		System.out.println(secAttributs);
		
		//Pattern demo 
		Menu mainMenu= new Menu("Main", "/main"); 
		MenuItem safteyMenuItem = new MenuItem("Saftey","/saftey"); 
		mainMenu.add(safteyMenuItem); 
		
		Menu claimsSubMenu = new Menu("Claims" , "/claims"); 
		mainMenu.add(claimsSubMenu); 
		
		MenuItem personalclaimsMenu = new MenuItem("Personal Claim" , "/personalClaims"); 
		claimsSubMenu.add(personalclaimsMenu);
		
		System.out.println(mainMenu.toString());
		
		
		
		
		
		
	}
}
