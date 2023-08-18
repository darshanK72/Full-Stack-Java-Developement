package FlyweightPattern;

import java.util.HashMap;
public class ShapeFactory {
	
	private static HashMap<String,Shape> shapeMap = new HashMap<String,Shape>();
	
	public static Shape createShape(String color)
	{
		Shape shape = (Shape) shapeMap.get(color);
		
		if(shape == null)
		{
			shape = new Shape(color);
			shapeMap.put(color, shape);
			System.out.println("Creating shape with color " + color);
		}
		return shape;
	}

}
