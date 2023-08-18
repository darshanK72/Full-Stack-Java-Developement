package com.springboot.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Certificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int certificateId;
	private String certificateName;
	private Date issuingDate;
	private Date expiryDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reader_id")
	@JsonBackReference
	private Reader reader;

	public Certificate() {
		super();	
	}

	public Certificate(int certificateId, String certificateName, Date issuingDate, Date expiryDate, Reader reader) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
		this.issuingDate = issuingDate;
		this.expiryDate = expiryDate;
		this.reader = reader;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public Date getIssuingDate() {
		return issuingDate;
	}

	public void setIssuingDate(Date issuingDate) {
		this.issuingDate = issuingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", certificateName=" + certificateName + ", issuingDate="
				+ issuingDate + ", expiryDate=" + expiryDate + ", reader=" + reader + "]";
	}
	
	
}
