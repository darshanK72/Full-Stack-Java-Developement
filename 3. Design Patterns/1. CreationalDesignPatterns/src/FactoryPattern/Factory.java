package FactoryPattern;

public class Factory {
	
	
	public Shape getShape(String type)
	{
		Shape shape = null;
		
		if(type.equalsIgnoreCase("square"))
		{
			shape = new Square();
		}
		else if(type.equalsIgnoreCase("ractangle"))
		{
			shape = new Ractangle();
		}
		else if(type.equalsIgnoreCase("triangle"))
		{
			shape = new Triangle();
		}
		
		return shape;
	}
}
