package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_TABLE")
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	private String email;

}
