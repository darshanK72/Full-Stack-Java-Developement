package AdapterPattern;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Bank bank = new Bank();
		
		System.out.print("Bank Name : ");
		bank.setBankName(in.nextLine());
		System.out.print("Branch Name : ");
		bank.setBranchName(in.nextLine());
		System.out.print("Branch Code : ");
		bank.setBranchCode(in.nextInt());
		System.out.print("Account Number : ");
		bank.setAccountNo(in.nextLong());
		in.nextLine();
		System.out.print("Account Holder Name : ");
		bank.setAccountHolderName(in.nextLine());
		
		
		Adapter customer = new Adapter(bank);
		System.out.println(customer.getCreditCardDetails());
	
		in.close();
		

	}

}
