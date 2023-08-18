package CompositePattern;

import java.util.LinkedList;
import java.util.List;

public class Manager implements Employee{
	
	private int employeeId;
	private String employeeName;
	private List<Employee> subordinates;
	
	public Manager() {
		super();
	}

	public Manager(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.subordinates = new LinkedList<Employee>();
	}

	@Override
	public void display() {
		
		System.out.println("====================================================");
		System.out.println("Employee Name : " + this.employeeName);
		System.out.println("Employee Id : " + this.employeeId);
		System.out.println("Subordinates Details : ");
		for(Employee em: this.subordinates)
		{
			em.display();
		}
		System.out.println("====================================================");
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
		this.subordinates.add(e);
	}

	@Override
	public void remove(Employee e) {
		this.subordinates.remove(e);
	}

	@Override
	public List<Employee> getAllSubordinates() {
		return this.subordinates;
	}

	@Override
	public Employee getSubordinate(int employeeId) {
		Employee emp = null;
		for(Employee em:this.subordinates)
		{
			if(em.getEmployeeId() == employeeId)
			{
				emp = em;
				break;
			}
		}
		return emp;
	}

}
