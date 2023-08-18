package ProxyPattern;

public class ProxyAccount implements Account{
	
	private String bankName;
	private String branchName;
	private int branchCode;
	private long accountNo;
	private String accountHolderName;
	RealAccount account = null;
	
	public ProxyAccount() {
		super();
	}
	
	public ProxyAccount(String bankName, String branchName, int branchCode, long accountNo, String accountHolderName) {
		super();
		this.bankName = bankName;
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
	}
	
	@Override
	public void getAccountDetails() {
		
		if(account == null)
		{
			this.createAccount();
		}
		account.getAccountDetails();
	}

	@Override
	public String getCredictCardDetails() {
		
		if(account == null)
		{
			this.createAccount();
		}
		return account.getCredictCardDetails();
		
	}

	@Override
	public void createAccount() {
		if(account == null)
		{
			account = new RealAccount(this.bankName,this.branchName,this.branchCode,this.accountNo,this.accountHolderName);
		}
	}

}
