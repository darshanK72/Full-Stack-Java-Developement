package com.spring.orm.SpringHibernateFirst.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.SpringHibernateFirst.entity.Employee;

public class EmployeeDoaImpl implements EmployeeDAO{
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Integer insert(Employee employee)
	{
		Integer result = (Integer) this.hibernateTemplate.save(employee);
		this.hibernateTemplate.save(employee.getAddress());
		return result;
	}

	public EmployeeDoaImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void update(Employee employee) {
		this.hibernateTemplate.update(employee);
	}

	@Transactional
	public void delete(int employeeId) {
		Employee employee = this.hibernateTemplate.get(Employee.class, employeeId);
		this.hibernateTemplate.delete(employee);
	}

	public Employee getEmployee(int employeeId) {
		return this.hibernateTemplate.get(Employee.class, employeeId);
	}

	public List<Employee> getAllEmployee() {
		return this.hibernateTemplate.loadAll(Employee.class);
	}
	
	

}
