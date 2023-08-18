package com.microservice.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.microservice.dto.RatingDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "firstName",length = 15)
	private String firstName;
	
	@Column(name = "lastName",length = 15)
	private String lastName;
	
	@Column(name = "userName", length = 15)
	private String username;
	
	@Column(name = "password",length = 10)
	private String password;
	
	@Transient
	private List<RatingDto> ratings;

}
