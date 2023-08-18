package FacadePattern;

public class ShapeMaker {
	
	private Shape square = null;
	private Shape ractangle = null;
	private Shape triangle = null;
	
	public ShapeMaker()
	{
		square = new Square();
		ractangle = new Ractangle();
		triangle = new Triangle();
	}
	
	public void drawSquare()
	{
		this.square.draw();
	}
	
	public void drawRactangle()
	{
		this.ractangle.draw();
	}
	
	public void drawTriangle()
	{
		this.triangle.draw();
	}
}
