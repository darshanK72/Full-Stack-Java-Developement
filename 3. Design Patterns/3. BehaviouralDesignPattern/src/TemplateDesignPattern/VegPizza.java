package TemplateDesignPattern;

public class VegPizza extends PizzaTemplate{

	@Override
	public void getBread() {
		System.out.println("Getting bread for Veg Pizza !!");
	}

	@Override
	public void getToppings() {
		System.out.println("Getting Toppings for Veg Pizza !!");
	}

	
}
