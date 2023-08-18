package AbstractFactory;

public class HomeLoan implements Loan{
	
	private String loanName;
	
	HomeLoan(String loanName)
	{
		this.loanName = loanName;
	}
	
	public String getLoanName()
	{
		return loanName;
	}

}
