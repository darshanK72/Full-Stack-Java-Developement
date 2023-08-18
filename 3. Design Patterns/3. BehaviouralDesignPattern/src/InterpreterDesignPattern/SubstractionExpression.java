package InterpreterDesignPattern;

public class SubstractionExpression implements Expression {
	
	private String expression;
	
	public SubstractionExpression(String expression)
	{
		this.expression = expression;
	}

	@Override
	public void interpret(InterpreterEngine engine) {
		System.out.println("Subtraction : " +  engine.subtraction(expression));
	}
	
	

}
