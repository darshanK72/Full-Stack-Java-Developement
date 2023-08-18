package DecoratorPattern;

public class Manager implements Employee{
	
	private String employeeName;
	private int employeeId;
	private String employeeRole = "Manager";
	
	public Manager() {
		super();
	}

	public Manager(String employeeName, int employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}

	@Override
	public void getEmployeeDetails() {
		System.out.println("-----------------------------------------");
		System.out.println("Employee Name : " + this.employeeName);
		System.out.println("Employee ID : " + this.employeeId);
		System.out.println("Employee Role : " + this.getRole());
		
	}

	@Override
	public String getRole() {
		return this.employeeRole;
	}
	

}
