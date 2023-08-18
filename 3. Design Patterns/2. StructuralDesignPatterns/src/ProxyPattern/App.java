package ProxyPattern;

public class App {

	public static void main(String[] args) {
		
		Account account = new ProxyAccount("SBI","Anand Nagar, Soygaon",1011,23532,"Darshan Khairnar");
		account.createAccount();
		account.getAccountDetails();
		account.createAccount();
		account.createAccount();
		account.getAccountDetails();
		account.getAccountDetails();
	}

}
