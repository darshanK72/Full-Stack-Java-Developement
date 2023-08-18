package StrategyDesignPattern;

public class Subtraction implements OperationStratgy{

	@Override
	public float calculate(float a, float b) {
		if( a > b)
		{
			return a - b;
		}
		return b - a;
	}

}
