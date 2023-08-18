package com.spring.orm.SpringHibernateFirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.SpringHibernateFirst.dao.EmployeeDAO;
import com.spring.orm.SpringHibernateFirst.entity.Address;
import com.spring.orm.SpringHibernateFirst.entity.Employee;

public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        EmployeeDAO employeeDao = context.getBean("employeeDao",EmployeeDAO.class);
        
//        Address address = new Address("Anand Nagar","Malegaon","Maharashtra",423203l);
//        
//        Employee employee = new Employee("Darshan","Khairnar",20000,address);
//        
//        System.out.println(employeeDao.insert(employee));
        
//        List<Employee> employeeList = employeeDao.getAllEmployee();
//        
//        for(Employee employee: employeeList)
//        {
//        	System.out.println(employee);
//        }
        
//        Employee employee = new Employee("Ramesh","Khairnar",32000,address);
//        employee.setEmployeeId(1);
//        employee.getAddress().setAddressId(1);
//        
//        employeeDao.update(employee);
        
      
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
        	System.out.print("****************************** Spring Hibernate ORM Project *****************************\n"
        			+ "Enter Options as Given Below : \n"
        			+ "1. Insert\n"
        			+ "2. Update\n"
        			+ "3. Delete\n"
        			+ "4. Select\n"
        			+ "5. Select All\n"
        			+ "6. Exit\n"
        			+ "\n"
        			+ "Your Choice : ");
        	int choice = Integer.parseInt(in.readLine());
        	
        	switch(choice)
        	{
        		case 1:
        			System.out.print("Enter Address\nStreet : ");
        	    	String street = in.readLine();
        	    	System.out.println("City : ");
        	    	String city = in.readLine();
        	    	System.out.println("State : ");
        	    	String state = in.readLine();
        	    	System.out.println("Pincode : ");
        	    	Long pincode = Long.parseLong(in.readLine());
        	    	
        	    	Address address = new Address(street,city,state,pincode);
        	    	
        	    	System.out.println("Enter Employee Details");
        	    	System.out.print("First Name : ");
        	    	String firstName = in.readLine();
        	    	System.out.print("Last Name : ");
        	    	String lastName = in.readLine();
        	    	System.out.print("Salary : ");
        	    	int salary = Integer.parseInt(in.readLine());
        	    	
        	    	Employee employee = new Employee(firstName,lastName,salary,address);
        	    	
        	    	employeeDao.insert(employee);
        			break;
        		case 2:
        			System.out.print("Enter Employee Id : ");
        			int id = Integer.parseInt(in.readLine());
        			
        			Employee empl = employeeDao.getEmployee(id);
        	    	
        	    	System.out.println("Enter Employee Details");
        	    	System.out.print("First Name : ");
        	    	String firstName1 = in.readLine();
        	    	System.out.print("Last Name : ");
        	    	String lastName1 = in.readLine();
        	    	System.out.print("Salary : ");
        	    	int salary1 = Integer.parseInt(in.readLine());
        	    	
        	    	Employee employee4 = new Employee();
        	    	employee4.setEmployeeId(id);
        	    	employee4.setFirstName(firstName1);
        	    	employee4.setLastName(lastName1);
        	    	employee4.setSalary(salary1);
        	    	employee4.setAddress(empl.getAddress());
        	    	
        	    	employeeDao.update(employee4);
        			break;
        		case 3:
        			System.out.print("Enter Employee Id : ");
        			int id3 = Integer.parseInt(in.readLine());
        			employeeDao.delete(id3);
        			break;
        		case 4:
        			System.out.print("Enter Employee Id : ");
        			int id1 = Integer.parseInt(in.readLine());
        			Employee employee1 = employeeDao.getEmployee(id1);
        			System.out.println(employee1);
        			break;
        		case 5:
        			List<Employee> employeeList = employeeDao.getAllEmployee();
        		      
        		    for(Employee employee2: employeeList)
        		    {
        		       System.out.println(employee2);
        		    }        			
        		    break;
        		case 6:
        			System.out.print("Thakyou for using Application............\n");
        			return;
        		default:
        			System.out.println("Incorrect Choice ! Try Again \n");      			
        	}
        }
        
    }
    
}
