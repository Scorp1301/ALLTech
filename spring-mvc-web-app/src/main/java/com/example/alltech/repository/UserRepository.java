package com.example.alltech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alltech.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
