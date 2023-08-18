package StateDesignPatern;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		StateController controller = new StateController();
		
		System.out.println("Options \n1. Accountant\n2. Management\n3. Sales");
		System.out.print("Enter Connection Type : ");
		int choice = in.nextInt();
		
		if(choice == 1)
		{
			controller.setAccountantConnection();
		}
		else if(choice == 2)
		{
			controller.setManagementConnection();
		}
		else if(choice == 3)
		{
			controller.setSalesConnection();
		}
		else
		{
			System.out.println("Wrong Choice !");
		}
		
		controller.open();
		controller.log();
		controller.update();
		controller.close();
		
		in.close();
	}

}
