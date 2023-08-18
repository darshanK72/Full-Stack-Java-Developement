package ChainOfResponsibilityPattern;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		ATMDispenserMachine ATM = new ATMDispenserMachine();
		
		int ammount;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Amount : ");
		
		ammount = in.nextInt();
		
		if(ammount%100 != 0)
		{
			if(ammount < 100)
			{
				System.out.println("Amount Cannot be less than 100 !!");
			}
			else
			{
				System.out.println("Amount Should in multiples of 100 !!");
			}
		}
		else
		{
			ATM.getDispenserChain().despense(new Currency(ammount));
		}
		
		in.close();
		
	}

}
