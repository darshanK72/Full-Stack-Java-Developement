package com.spring.stereotype.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.stereotype.StereotypeAnnotation.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Student student = context.getBean("student",Student.class);
       
       System.out.println(student);
    }
}
