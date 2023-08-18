package com.spring.bean.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.BeanLifeCycle.bean.Employee;
import com.spring.bean.BeanLifeCycle.bean.Person;
import com.spring.bean.BeanLifeCycle.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        context.registerShutdownHook();
        
        Student student1 = (Student) context.getBean("student1");
        
        System.out.println(student1);
        
        Employee employee1 = (Employee) context.getBean("employee1");
        
        System.out.println(employee1);
        
        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1);
        
    }
}
