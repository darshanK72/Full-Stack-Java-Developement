package InterpreterDesignPattern;

public class Interpreter {
	
	private InterpreterEngine engine;
	
	public Interpreter(InterpreterEngine engine)
	{
		this.engine = engine;
	}
	
	
	public void interpret(String data)
	{
		Expression exp = null;
		if(data.contains("add"))
		{
			exp = new AdditionExpression(data);
		}
		else if(data.contains("subtract"))
		{
			exp = new SubstractionExpression(data);
		}
		else
		{
			System.out.println("Invalid Expression");
		}
		
		exp.interpret(engine);
	}
	

}
