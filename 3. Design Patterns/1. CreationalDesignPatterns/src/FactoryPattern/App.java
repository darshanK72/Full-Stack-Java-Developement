package FactoryPattern;

public class App {

	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		Shape s1 = factory.getShape("ractangle");
		s1.draw();
		
		Shape s2 = factory.getShape("triangle");
		s2.draw();
		
		Shape s3 = factory.getShape("square");
		s3.draw();

	}

}
