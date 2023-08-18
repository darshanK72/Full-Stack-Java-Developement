package DecoratorPattern;

public abstract class EmployeeDecorator implements Employee{
	
	protected Employee employee = null;

	public EmployeeDecorator() {
		super();
	}

	public EmployeeDecorator(Employee employee) {
		super();
		this.employee = employee;
	}

	@Override
	public void getEmployeeDetails() {
		this.employee.getEmployeeDetails();
	}

	@Override
	public String getRole() {
		return this.employee.getRole();
	}
	

}
