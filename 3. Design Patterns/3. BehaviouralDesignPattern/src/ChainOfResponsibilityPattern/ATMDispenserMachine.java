package ChainOfResponsibilityPattern;

public class ATMDispenserMachine {
	
	private DispenserChain dispenserChain = null;
	
	public ATMDispenserMachine()
	{
		dispenserChain = new Rupees2000Dispenser();
		DispenserChain chain2 = new Rupees500Dispenser();
		DispenserChain chain3 = new Rupees200Dispenser();
		DispenserChain chain4 = new Rupees100Dispenser();
		
		dispenserChain.setNextDispenser(chain2);
		chain2.setNextDispenser(chain3);
		chain3.setNextDispenser(chain4);
	}
	
	public DispenserChain getDispenserChain()
	{
		return this.dispenserChain;
	}

}
