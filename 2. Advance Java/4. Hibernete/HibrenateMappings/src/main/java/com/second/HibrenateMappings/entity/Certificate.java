package com.second.HibrenateMappings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificates")
public class Certificate {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="name")
	String name;
	
	@OneToOne(mappedBy="certificate")
	Student student;
	
	public Certificate() {
		super();
	}

	public Certificate(int certificate_id, String certificate_name) {
		super();
		this.id = certificate_id;
		this.name = certificate_name;
	}

	public int getCertificate_id() {
		return id;
	}

	public void setCertificate_id(int certificate_id) {
		this.id = certificate_id;
	}

	public String getCertificate_name() {
		return name;
	}

	public void setCertificate_name(String certificate_name) {
		this.name = certificate_name;
	}
	
	

}
