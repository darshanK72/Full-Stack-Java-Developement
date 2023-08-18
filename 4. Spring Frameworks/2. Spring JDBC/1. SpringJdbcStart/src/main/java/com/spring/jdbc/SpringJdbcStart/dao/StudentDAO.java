package com.spring.jdbc.SpringJdbcStart.dao;

import java.util.List;

import com.spring.jdbc.SpringJdbcStart.beans.Student;

public interface StudentDAO {
	
	public void insert(Student student);
	public void update(Student student);
	public void delete(int rollNo);
	public Student getStudent(int rollNo);
	public List<Student> getAllStudent();

}
