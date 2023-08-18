package com.spring.autowire.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.autowire.AutoWiring.beans.Employee;
import com.spring.autowire.AutoWiring.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
        
//        Student student2 = context.getBean("student2",Student.class);
//        System.out.println(student2);
        
        Student student3 = context.getBean("student3",Student.class);
        System.out.println(student3);
        
        Employee emp1 = context.getBean("emp1",Employee.class);
        System.out.println(emp1);
    }
}
