package InterpreterDesignPattern;

public class AdditionExpression implements Expression
{
	public String expression;
	
	AdditionExpression(String expression)
	{
		this.expression = expression;
	}
	
	@Override
	public void interpret(InterpreterEngine engine) {
		System.out.println("Addition : " + engine.addition(expression));
	}

}
