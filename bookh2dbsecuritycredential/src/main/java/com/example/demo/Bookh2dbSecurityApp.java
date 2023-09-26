package com.example.demo;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Bookh2dbSecurityApp {
	@Autowired
	UserRepository repository;
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(new User(101, "John", "Scorp", "john.scorp@gmail.com"),User(102, "u1", "p1", "p1.u1@gmail.com")).collect(Collectors.toList());
		repository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(Bookh2dbSecurityApp.class, args);
	}

}
