package AbstractFactory;

public class App {
	
	public static void main(String args[])
	{
		FactoryCreater factoryCreator = new FactoryCreater();
		
		BankFactory bankFactory = (BankFactory) factoryCreator.getFactory("bank");
		LoanFactory loanFactory = (LoanFactory) factoryCreator.getFactory("loan");
		
		Bank bank = bankFactory.getBank("sbi","Anand Nagar Soygaon, Branch 101");
		Loan loan = loanFactory.getLoan("personal loan","3 Lanks Ruppes loan for purchasing land");
		
		System.out.println(bank.getBankName());
		System.out.print(loan.getLoanName());
		
	}

}
