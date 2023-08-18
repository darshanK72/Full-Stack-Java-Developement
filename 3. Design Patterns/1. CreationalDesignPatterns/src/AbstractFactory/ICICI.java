package AbstractFactory;

public class ICICI implements Bank{

	private String bankName;
	
	public ICICI(String bankName)
	{
		this.bankName = bankName;
	}
	@Override
	public String getBankName() {
		return this.bankName;
	}

}
