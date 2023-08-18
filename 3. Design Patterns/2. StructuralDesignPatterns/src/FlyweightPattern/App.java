package FlyweightPattern;

public class App {

	private static String[] colorArray = {"red","yellow","green","orange","black","pink"};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++)
		{
			Shape shape = ShapeFactory.createShape(getRandomColor());
			shape.draw();
		}
	}

	public static String getRandomColor()
	{
		return colorArray[(int) (Math.random()*colorArray.length)];
	}
}
