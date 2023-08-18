package com.first.FirstHibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="address_table")
public class Address {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="city")
	private String City;
	
	@Column(name="state")
	private String State;
	
	@Transient
	private int e;
	
	@Column(name="add_date")
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	
	@Lob
	@Column(name = "image")
	private byte[] image;

	public Address(int addressId, String city, String state, int e, Date addDate,byte[] image) {
		super();
		this.addressId = addressId;
		City = city;
		State = state;
		this.e = e;
		this.addDate = addDate;
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	

}
