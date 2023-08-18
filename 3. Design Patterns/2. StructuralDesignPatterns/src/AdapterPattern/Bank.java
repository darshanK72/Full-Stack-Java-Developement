package AdapterPattern;

public class Bank {
	
	private String bankName;
	private String branchName;
	private int branchCode;
	private long accountNo;
	private String accountHolderName;
	
	

	public Bank(String bankName, String branchName, int branchCode, long account_no, String account_holder_name) {
		super();
		this.bankName = bankName;
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.accountNo = account_no;
		this.accountHolderName = account_holder_name;
	}


	public Bank() {
		super();
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
	public String toString() {
		return "Bank [bankName=" + bankName + ", branchName=" + branchName + ", branchCode=" + branchCode
				+ ", accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + "]";
	}

	

	
	

}
