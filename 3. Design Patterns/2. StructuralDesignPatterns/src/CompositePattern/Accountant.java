package CompositePattern;

import java.util.List;

public class Accountant implements Employee {
	
	private int employeeId;
	private String employeeName;
	
	

	public Accountant() {
		super();
	}
	
	

	public Accountant(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}



	@Override
	public void display() {
		System.out.println("------------------------------------------------");
		System.out.println("Employee Name : " + this.employeeName);
		System.out.println("Employee Id : " + this.employeeId);
	}

	@Override
	public int getEmployeeId() {
		return this.employeeId;
	}

	@Override
	public String getEmployeeName() {
		return this.employeeName;
	}

	@Override
	public void add(Employee e) {
		
	}

	@Override
	public void remove(Employee e) {
		
	}

	@Override
	public List<Employee> getAllSubordinates() {
		return null;
	}

	@Override
	public Employee getSubordinate(int employeeId) {
		return null;
	}

}
