package bridge2;

public class Control {
	
	public static void main(String[] args) {
		Color blue = new Blue(); 
		Shape square = new Square(blue); 
		Color red = new Red(); 
		Shape circle = new Circle(red); 
		Color yellow = new Yellow(); 
		Shape triangle = new Triangle(yellow); 
		
		square.applyColor(); 
		circle.applyColor();
		triangle.applyColor();
	}

}
