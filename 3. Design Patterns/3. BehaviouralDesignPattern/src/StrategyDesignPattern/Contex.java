package StrategyDesignPattern;

public class Contex {
	
	private OperationStratgy stratgy = null;
	
	public Contex(OperationStratgy stratgy)
	{
		this.stratgy = stratgy;
	}
	
	public float executeStratgy(float a,float b)
	{
		return this.stratgy.calculate(a, b);
	}

}
