package AbstractFactory;

public class LoanFactory implements AbstractFactoryy {
	
	public Bank getBank(String bankType, String bankName)
	{
		return null;
	}
	
	public Loan getLoan(String loanType,String loanName)
	{
		Loan loan = null;
		
		if(loanType.equals("home loan"))
		{
			loan = new HomeLoan(loanName);
		}
		else if(loanType.equals("car loan"))
		{
			loan = new CarLoan(loanName);
		}
		else if(loanType.equals("personal loan"))
		{
			loan = new PersonalLoan(loanName);
		}
		
		return loan;
	}

}
