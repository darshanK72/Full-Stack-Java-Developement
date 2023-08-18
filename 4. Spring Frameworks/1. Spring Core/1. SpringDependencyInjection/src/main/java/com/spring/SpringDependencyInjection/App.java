package com.spring.SpringDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringDependencyInjection.beans.Company;
import com.spring.SpringDependencyInjection.beans.Employee;
import com.spring.SpringDependencyInjection.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       
       Student s1 = (Student) context.getBean("student1");
       System.out.println(s1);
       
       Student s2 = (Student) context.getBean("student2");
       System.out.println(s2);
       
       Student s3 = (Student) context.getBean("student3");
       System.out.println(s3);
       
       Student s4 = (Student) context.getBean("student4");
       System.out.println(s4);
       
       Company c1 = (Company) context.getBean("company1");
       c1.display();
       
       Employee e = (Employee) context.getBean("emp1");
       e.display();
    }
}
