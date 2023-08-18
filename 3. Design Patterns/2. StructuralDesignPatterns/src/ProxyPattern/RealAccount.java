package ProxyPattern;

public class RealAccount implements Account{
	
	private String bankName;
	private String branchName;
	private int branchCode;
	private long accountNo;
	private String accountHolderName;
	
	public RealAccount() {
		super();
	}
	
	public RealAccount(String bankName, String branchName, int branchCode, long accountNo, String accountHolderName) {
		super();
		System.out.println("Account Created Successffully !");
		this.bankName = bankName;
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public void getAccountDetails() {
		System.out.println("------------------------------------------------------");
		System.out.println("Bank Name : " + this.getBankName());
		System.out.println("Branch Name : " + this.getBranchName());
		System.out.println("Branch Code : " + this.getBranchCode());
		System.out.println("Account Number : " + this.getAccountNo());
		System.out.println("Account Holder Name : " + this.getAccountHolderName());
	}
		
	@Override
	public String getCredictCardDetails() {
		return this.accountHolderName + this.accountNo;
	}

	@Override
	public void createAccount() {
		
	}

}
