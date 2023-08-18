package AbstractFactory;

public class BankFactory implements AbstractFactoryy{
	
	public Loan getLoan(String loanType, String loanName)
	{
		return null;
	}
	
	public Bank getBank(String bankType, String bankName)
	{
		Bank bank = null;
		if(bankType.equals("sbi"))
		{
			bank = new SBI(bankName);
		}
		else if(bankType.equals("hdfc"))
		{
			bank = new HDFC(bankName);
		}
		else if(bankType.equals("icici"))
		{
			bank = new ICICI(bankName);
		}
		return bank;
	}
}
