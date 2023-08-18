package DecoratorPattern;

public class GeneralManager extends EmployeeDecorator{
	
	public GeneralManager(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public void getEmployeeDetails() {
		this.employee.getEmployeeDetails();
		System.out.println("Department : " + "General Department");
	
	}

}
