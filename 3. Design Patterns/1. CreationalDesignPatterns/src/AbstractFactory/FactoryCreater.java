package AbstractFactory;

public class FactoryCreater {
	
	public AbstractFactoryy getFactory(String name)
	{
		AbstractFactoryy factory = null;
		if(name.equals("bank"))
		{
			factory = new BankFactory();
		}
		else if(name.equals("loan"))
		{
			factory = new LoanFactory();
		}
		return factory;
	}

}
