package com.example.alltech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.alltech.entity.User;
import com.example.alltech.repository.UserRepository;
@Controller
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/users")
	public String home(Model model) {
		model.addAttribute("users", userRepo.findAll());
		return "users";
	}
	
	@PostMapping("/saveUser")
	public String creatUser(@ModelAttribute("user") User theUser) {
		userRepo.save(theUser);
		return "redirect:/users";
	}
	
	@GetMapping("/hi")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "add";
	}
}
