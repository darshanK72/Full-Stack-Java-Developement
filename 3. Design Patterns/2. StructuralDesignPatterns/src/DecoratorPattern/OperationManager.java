package DecoratorPattern;

public class OperationManager extends EmployeeDecorator{
	
	public OperationManager(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public void getEmployeeDetails() {
		this.employee.getEmployeeDetails();
		System.out.println("Employee Role : " + "Operation Manager");
	}
	
	
}
