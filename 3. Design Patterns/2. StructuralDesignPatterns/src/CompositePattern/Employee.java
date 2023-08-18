package CompositePattern;

import java.util.List;

public interface Employee {
	
	public void display();
	public int getEmployeeId();
	public String getEmployeeName();
	public void add(Employee e);
	public void remove(Employee e);
	public List<Employee> getAllSubordinates();
	public Employee getSubordinate(int employeeId);

}
