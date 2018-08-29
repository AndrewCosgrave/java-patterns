package bride3;

public class Control {
	
	public static void main(String [] args) {
		Movie movie = new Movie() ;
		movie.setClassification("Action");
		movie.setTitle("John wick");
		movie.setRuntime("2:15");
		movie.setYear("2004");
		
		
		
		Formatter printFormatter = new PrintFormatter(); 
		Printer moviePrinter = new MoviePrinter(movie); 
		String printmaterial = moviePrinter.print(printFormatter); 
		
		
		System.out.println(printmaterial);
		
		//Now we also need a html formatter
		Formatter htmlformatter = new Htmlformatter(); 
		String htmlMaterial = moviePrinter.print(htmlformatter); 
		System.out.println(htmlMaterial);
		
		 
	}
	

}
