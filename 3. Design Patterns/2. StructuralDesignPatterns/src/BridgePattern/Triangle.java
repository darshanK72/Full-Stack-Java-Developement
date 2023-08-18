package BridgePattern;

public class Triangle extends Shape {
	
	Triangle(Color color)
	{
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("This is Triangle " + this.color.getColor() + " color !");
	}

}
