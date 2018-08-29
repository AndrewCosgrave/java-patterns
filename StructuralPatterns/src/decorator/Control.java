package decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * Hierarachail pattern that builds 
 * function at each level while using compisiotion from similiar datatyoes 
 * 
 * 
 * Wrap another object to add functionalty to it.
 * Enables adding of functionality without affectiong otherparts of the hierarachy.
 * 
 * Single Responsibilty principle 
 * 
 * Compose behaviour dynamically by using one of the subclasses that decorate your object
 * adding behaviuor trough creation
 * 
 * good examples are java.io.InputStream
 * java.util.Collections#checkedList
 * UI compents swing/awt 


 * Inheritance based but uses composition and inheritance (is-a , has-a) 
 * 
 * Alternative to subclassing 
 * Constructor requires instance from hierarchy
 * 
 * 
 * 
 */
public class Control {

	public static void main(String[] args) {
		try {
			simpleDecoratorExample();
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
	}
	
	/*
	* Output stream alone cannot write to files 
	* the FileoutPut stream wirtes to files.
	* The FOs does no know about writing out data 
	* The data out put stream goes trough the fileoutputstream 
	* which goes into the outputstream 
	*/
	private static void simpleDecoratorExample() throws Exception {
		File file = new File("C:\\Users\\I330155\\Desktop\\output.txt");

		OutputStream oStream = new FileOutputStream(file); 
		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("text"); 
		
		doStream.close();
		oStream.close(); 
		
		System.out.println("worked");
	}

}
