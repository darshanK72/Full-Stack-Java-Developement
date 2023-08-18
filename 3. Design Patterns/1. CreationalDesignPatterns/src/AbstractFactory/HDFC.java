package AbstractFactory;

public class HDFC implements Bank {
	
	private String bankName;
	
	public HDFC(String bankName)
	{
		this.bankName = bankName;
	}

	@Override
	public String getBankName() {
		return this.bankName;
	}

}
