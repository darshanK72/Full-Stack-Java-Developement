package com.second.HibrenateMappings.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
	@Column(name="questionid")
	private int question_id;
	
	@Column(name="question")
	private String question;
	
	@OneToMany(mappedBy="question")
	private Set<Answer> answers;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int question_id, String question, Set<Answer> answers) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
	
	
	

}
