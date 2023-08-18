package AbstractFactory;

public class PersonalLoan implements Loan{
	
private String loanName;
	
	PersonalLoan(String loanName)
	{
		this.loanName = loanName;
	}
	
	public String getLoanName()
	{
		return loanName;
	}

}
