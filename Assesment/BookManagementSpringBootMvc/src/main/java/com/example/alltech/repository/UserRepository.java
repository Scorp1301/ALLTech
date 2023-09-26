package com.example.alltech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alltech.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	Users findByUsername(String username);

}
