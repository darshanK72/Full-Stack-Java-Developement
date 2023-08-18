package TemplateDesignPattern;

public class App {

	public static void main(String[] args) {
		
		PizzaTemplate vegPizza = new VegPizza();
		try {
			vegPizza.preparePizza();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		PizzaTemplate nonVegPizza = new NonVegPizza();
		
		try {
			nonVegPizza.preparePizza();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
