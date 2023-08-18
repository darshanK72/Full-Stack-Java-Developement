package com.spring.javaconfig.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.javaconfig.JavaConfiguration.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	Student student = context.getBean("getStudent",Student.class);
    	System.out.println(student);
    }
}
