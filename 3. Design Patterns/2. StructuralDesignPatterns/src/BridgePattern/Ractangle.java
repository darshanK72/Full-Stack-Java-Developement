package BridgePattern;

public class Ractangle extends Shape {
	
	public Ractangle(Color color)
	{
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.println("This is Ractangle of " + this.color.getColor() + " color !");
	}

}
