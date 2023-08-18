package com.sql.HibernateQueryLanguage.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="subjects")
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int subject_id;
	
	@Column(name="subject_name")
	private String subject_name;
	
	@ManyToMany
	private Set<Student> students;

	public Subject() {
		super();
	}

	public Subject(int subject_id, String subject_name,Set<Student> students) {
		super();
		this.subject_id = subject_id;
		this.subject_name = subject_name;
		this.students = students;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	
	
}
