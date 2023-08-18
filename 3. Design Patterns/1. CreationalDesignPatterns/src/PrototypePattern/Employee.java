package PrototypePattern;

public class Employee implements Cloneable{
	
	private int employee_id;
	private String fname;
	private String lname;
	private double salary;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int employee_id, String fname, String lname, double salary) {
		super();
		this.employee_id = employee_id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary
				+ "]";
	}
	
	public Employee clone()
	{
		return new Employee(this.employee_id,this.fname,this.lname,this.salary);
	}
	
	

}
