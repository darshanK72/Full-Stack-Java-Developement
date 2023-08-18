package InterpreterDesignPattern;

public class InterpreterEngine {
	
	public int addition(String data)
	{
		String[] tokens = interpret(data);
		
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		return a + b;
	}
	
	public int subtraction(String data)
	{
		String[] tokens = interpret(data);
		
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		return a - b;
	}

	private String[] interpret(String data)
	{
		String tempInputData = data.replaceAll("[^0-9]"," ");
		tempInputData = tempInputData.replaceAll("( )+", " ").trim();
		
		String[] out = tempInputData.split(" ");
		return out;
	}
}
