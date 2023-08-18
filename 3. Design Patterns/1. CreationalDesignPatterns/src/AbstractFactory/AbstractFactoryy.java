package AbstractFactory;

public interface AbstractFactoryy {

	public Bank getBank(String bankType, String bankName);
	public Loan getLoan(String loanType,String loanName);

}
