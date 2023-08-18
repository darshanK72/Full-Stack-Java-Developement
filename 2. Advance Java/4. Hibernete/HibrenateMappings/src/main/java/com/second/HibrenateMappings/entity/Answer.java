package com.second.HibrenateMappings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answer {
	
	@Id
	@Column(name="answerid")
	private int answer_id;
	
	@Column(name="answer")
	private String answer;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answer_id, String answer, Question question) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question = question;
	}

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	

}
