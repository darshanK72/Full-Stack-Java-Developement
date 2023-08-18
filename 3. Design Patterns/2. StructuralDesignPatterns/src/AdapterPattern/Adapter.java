package AdapterPattern;

public class Adapter implements CreditCard {
	
	Bank bank = null;
	
	public Adapter(Bank bank)
	{
		this.bank = bank;
	}

	@Override
	public void getBankDetails() {
		
		System.out.println("Bank Name : " + this.bank.getBankName());
		System.out.println("Branch Name : " + this.bank.getBranchName());
		System.out.println("Branch Code : " + this.bank.getBranchCode());
	}

	@Override
	public String getCreditCardDetails() {
		String out = this.bank.getAccountHolderName() + " " +   this.bank.getAccountNo();
		return out;
	}

}
