package com.spring.el.ExpressionLanguage.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("example")
public class Example {
	
	@Value("#{new java.lang.String('Darshan Khairnar')}")
	private String name;
	
	@Value("#{101 + 523}")
	private int rollNo;
	
	@Value("#{234 <= 521}")
	private boolean isPresent;
	
	@Value("#{T(java.lang.Math).sqrt(225)}")
	private int sart;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(String name, int rollNo, boolean isPresent, int sart, double pi) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.isPresent = isPresent;
		this.sart = sart;
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public int getSart() {
		return sart;
	}

	public void setSart(int sart) {
		this.sart = sart;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	@Override
	public String toString() {
		return "Example [name=" + name + ", rollNo=" + rollNo + ", isPresent=" + isPresent + ", sart=" + sart + ", pi="
				+ pi + "]";
	}
	
	

}
