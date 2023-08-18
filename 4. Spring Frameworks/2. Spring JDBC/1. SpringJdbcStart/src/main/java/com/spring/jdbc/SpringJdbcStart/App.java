package com.spring.jdbc.SpringJdbcStart;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.SpringJdbcStart.beans.Student;
import com.spring.jdbc.SpringJdbcStart.dao.StudentDAO;
import com.spring.jdbc.SpringJdbcStart.dao.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
//        String query = "create table student("
//        		+ "rollNo int(10),"
//        		+ "firstName varchar(255),"
//        		+ "lastName varchar(255),"
//        		+ "marks int(10),"
//        		+ "division varchar(2)"
//        		+ ");";
        
//        String query = "insert into student(rollNo,firstName,lastName,marks,division) values(101,'Darshan','Khairnar',781,'A');";
       
//        StudentDAO studentDao = new StudentDaoImpl(template);
    	
    	StudentDAO studentDao = context.getBean("studentDao",StudentDAO.class);
//        
//        Student student = new Student(102,"Aakash","Khairnar",753,"C");
//        studentDao.insert(student);
//        studentDao.update(student);
//        studentDao.delete(102);
        
//        Student student = studentDao.getStudent(101);
//        
//        System.out.println(student);
        
        List<Student> list = studentDao.getAllStudent();
        
        for(Student st:list)
        {
        	System.out.println(st);
        }
        
    }
}
