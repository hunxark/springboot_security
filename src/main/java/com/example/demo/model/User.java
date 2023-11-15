package com.example.demo.model;

import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// ORM - Object Relation Mapping


@Data
@Entity
@NoArgsConstructor
public class User {
	@jakarta.persistence.Id // primary key
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private int no;
	private String username;
	private String password;
	private String email;
	private String dogcheck;
	private String role; //ROLE_USER, ROLE_ADMIN
	// OAuth를 위해 구성한 추가 필드 2개
	private String provider; //구글
	private String providerId; //Attributes 아이디 102986222511767022197
	@CreationTimestamp
	private Timestamp createDate;
	
	@Builder
	public User(String username, String password, String email,String dogcheck,String role, String provider, String providerId,
			Timestamp createDate) {

		this.username = username;
		this.password = password;
		this.email = email;
		this.dogcheck = dogcheck;
		this.role = role;
		this.provider = provider;
		this.providerId = providerId;
		this.createDate = createDate;
	}
}