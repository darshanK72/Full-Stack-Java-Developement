package com.spring.jdbc.SpringJdbcStart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.SpringJdbcStart.beans.Student;
import com.spring.jdbc.SpringJdbcStart.beans.StudentRowMapper;

@Component("studentDao")
public class StudentDaoImpl implements StudentDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public StudentDaoImpl(JdbcTemplate template) {
		super();
		this.jdbcTemplate = template;
	}


	public void insert(Student student) {
		String query = "insert into student(rollNo,firstName,lastName,marks,division) values(?,?,?,?,?);";
        int result = this.jdbcTemplate.update(query,student.getRollNo(),student.getFirstName(),student.getLastName(),student.getMarks(),student.getDivision());
        System.out.print(result + " Row Inserted Successfully");  
	}

	public void update(Student student) {
		String query = "update student set firstName = ? , lastName = ? , marks = ?, division = ? where rollNo = ?;";
		int result = this.jdbcTemplate.update(query,student.getFirstName(),student.getLastName(),student.getMarks(),student.getDivision(),student.getRollNo());
		System.out.println(result + " Row Updated Successfully");
	}


	public void delete(int rollNo) {
		String query = "delete from student where rollNo = ?;";
		int result = this.jdbcTemplate.update(query,rollNo);
		System.out.println(result + " Row Deleted Successfully");
	}


	public Student getStudent(int rollNo) {
		String query = "select * from student where rollNo = ?;";
		RowMapper rowMapper = new StudentRowMapper();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,rollNo);
		return student;
	}


	public List<Student> getAllStudent() {
		String query = "select * from student";
		RowMapper rowMapper = new StudentRowMapper();
		List<Student> list = this.jdbcTemplate.query(query, rowMapper);
		return list;
	}

}
