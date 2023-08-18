package FlyweightPattern;

public class Shape {
	
	private String color;
	
	public Shape()
	{
		
	}
	
	public Shape(String color)
	{
		this.color = color;
	}
	
	public void draw()
	{
		System.out.println("Drawing shape with " + color + " color " + this.hashCode());
	}
}
