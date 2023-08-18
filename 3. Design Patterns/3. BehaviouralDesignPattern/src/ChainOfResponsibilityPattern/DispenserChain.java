package ChainOfResponsibilityPattern;

public interface DispenserChain {
	
	public void setNextDispenser(DispenserChain dispenser);
	public void despense(Currency currency);

}
