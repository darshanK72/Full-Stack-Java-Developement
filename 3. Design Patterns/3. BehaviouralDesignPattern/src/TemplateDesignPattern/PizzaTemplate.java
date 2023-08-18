package TemplateDesignPattern;

public abstract class PizzaTemplate {
	
	public final void preparePizza() throws InterruptedException
	{
		getBread();
		getToppings();
		cooking();
		addToppings();
		addChees();
		outForDelivery();
		delivered();
		
	}
	
	public abstract void getBread();
	public abstract void getToppings();
	
	public void cooking() throws InterruptedException
	{
		System.out.println("Cooking Pizza ! Waint for 15 Mins !!");
		Thread.sleep(3000);
	}
	
	public void addToppings() throws InterruptedException
	{
		System.out.println("Adding Toppings !!");
		Thread.sleep(1000);
	}
	
	public void addChees() throws InterruptedException 
	{
		System.out.println("Adding Chees !!");
		Thread.sleep(1000);
	}
	
	public void outForDelivery() throws InterruptedException
	{
		System.out.println("Your Pizza is out for Delivery !!");
		Thread.sleep(4000);
	}
	
	public void delivered()
	{
		System.out.println("Your Pizza is delivered, Try again some time !!");
	}

}
