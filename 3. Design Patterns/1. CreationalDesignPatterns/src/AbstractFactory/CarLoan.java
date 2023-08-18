package AbstractFactory;

public class CarLoan implements Loan {
	
private String loanName;
	
	CarLoan(String loanName)
	{
		this.loanName = loanName;
	}
	
	public String getLoanName()
	{
		return loanName;
	}

}
