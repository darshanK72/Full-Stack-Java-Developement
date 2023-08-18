package BridgePattern;

public class App {

	public static void main(String[] args) {
		
		Color blueColor = new BlueColor();
		Color yellowColor = new YelloColor();
		Color redColor = new RedColor();
		
		Shape ractangle = new Ractangle(blueColor);
		Shape square = new Square(yellowColor);
		Shape triangle = new Triangle(redColor);
		
		ractangle.draw();
		triangle.draw();
		square.draw();
		
	}

}
