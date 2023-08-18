package com.spring.jdbc.SpringJdbcStart.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setRollNo(rs.getInt(1));
		student.setFirstName(rs.getString(2));
		student.setLastName(rs.getString(3));
		student.setMarks(rs.getInt(4));
		student.setDivision(rs.getString(5));
		return student;
	}

}
