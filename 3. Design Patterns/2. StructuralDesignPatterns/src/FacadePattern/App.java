package FacadePattern;

public class App {

	public static void main(String[] args) {
		
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawSquare();
		shapeMaker.drawRactangle();
		shapeMaker.drawTriangle();
	}

}
