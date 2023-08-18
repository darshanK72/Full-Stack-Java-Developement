package ChainOfResponsibilityPattern;

public class Rupees500Dispenser implements DispenserChain{

	private DispenserChain dispenser = null;

	@Override
	public void setNextDispenser(DispenserChain dispenser) {
		this.dispenser = dispenser;
	}

	@Override
	public void despense(Currency currency) {
		
		if(currency.getAmmount() >= 500)
		{
			int number_of_notes = currency.getAmmount() / 500;
			int remaining_ammount = currency.getAmmount() % 500;
			
			System.out.println("Dispensign : " + number_of_notes + " of Ruppes 500");
			
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
