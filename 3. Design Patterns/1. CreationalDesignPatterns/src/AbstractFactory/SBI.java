package AbstractFactory;

public class SBI implements Bank{
	
	private String bankName;
	
	public SBI(String bankName)
	{
		this.bankName = bankName;
	}

	@Override
	public String getBankName() {
		return this.bankName;
	}

}
