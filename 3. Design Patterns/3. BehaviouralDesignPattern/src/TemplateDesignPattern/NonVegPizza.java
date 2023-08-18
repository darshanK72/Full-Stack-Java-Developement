package TemplateDesignPattern;

public class NonVegPizza extends PizzaTemplate{

	@Override
	public void getBread() {
		System.out.println("Getting bread for Non Veg Pizza !!");
	}

	@Override
	public void getToppings() {
		System.out.println("Getting Toppings for Non Veg Pizza !!");
	}
}
