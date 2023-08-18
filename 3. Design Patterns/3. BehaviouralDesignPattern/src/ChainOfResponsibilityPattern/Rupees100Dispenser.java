package ChainOfResponsibilityPattern;

public class Rupees100Dispenser implements DispenserChain{
	private DispenserChain dispenser = null;

	@Override
	public void setNextDispenser(DispenserChain dispenser) {
		this.dispenser = dispenser;
	}

	@Override
	public void despense(Currency currency) {
		
		if(currency.getAmmount() >= 100)
		{
			int number_of_notes = currency.getAmmount() / 100;
			int remaining_ammount = currency.getAmmount() % 100;
			
			System.out.println("Dispensign : " + number_of_notes + " of Ruppes 100");
			
			if(remaining_ammount != 0)
			{
				this.dispenser.despense(new Currency(remaining_ammount));
			}
		}
		else
		{
			this.dispenser.despense(currency);
		}
	}
}
