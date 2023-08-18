package StrategyDesignPattern;

public class Addition implements OperationStratgy{

	@Override
	public float calculate(float a, float b) {
		return a + b;
	}

}
