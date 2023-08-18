package com.spring.orm.SpringHibernateFirst.dao;

import java.util.List;

import com.spring.orm.SpringHibernateFirst.entity.Employee;

public interface EmployeeDAO {
	public Integer insert(Employee employee);
	public void update(Employee employee);
	public void delete(int employeeId);
	public Employee getEmployee(int employeeId);
	public List<Employee> getAllEmployee();
}
