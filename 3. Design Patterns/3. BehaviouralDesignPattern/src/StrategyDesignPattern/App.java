package StrategyDesignPattern;

public class App {

	public static void main(String[] args) {
		Contex contex = new Contex(new Addition());
		
		System.out.println(contex.executeStratgy(23.23f, 53.23f));
		
		Contex contex2 = new Contex(new Subtraction());
		
		System.out.println(contex2.executeStratgy(2352.23f, 6432.645f));
		
	}

}
