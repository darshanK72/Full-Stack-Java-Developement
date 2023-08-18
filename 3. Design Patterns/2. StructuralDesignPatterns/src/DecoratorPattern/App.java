package DecoratorPattern;

public class App {

	public static void main(String[] args) {
		
		Employee accountant = new Accountant("Ramesh",101);
		accountant.getEmployeeDetails();
		
		Employee manager = new Manager("Darshan",102);
		manager.getEmployeeDetails();
		
		Employee generalManager = new GeneralManager(manager);
		generalManager.getEmployeeDetails();
		
		Employee operationManager = new OperationManager(accountant);
		operationManager.getEmployeeDetails();
	}

}
