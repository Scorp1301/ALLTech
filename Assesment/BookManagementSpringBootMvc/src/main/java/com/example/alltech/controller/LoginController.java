	package com.example.alltech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.alltech.entity.Users;
import com.example.alltech.repository.UserRepository;

@Controller
public class LoginController {
	@Autowired
	private UserRepository userRepo;
	
	 @GetMapping("/login")
	    public String showLoginPage(Model model) {
	        model.addAttribute("user", new Users());
	        return "login";
	    }
	 
	@PostMapping("/login")
    public String login(@ModelAttribute("user") Users user) {
        Users storedUser = userRepo.findByUsername(user.getUsername());
        if (storedUser != null && storedUser.getPassword().equals(user.getPassword())) {
            return "redirect:/hi";
        } else {
            return "login";
        }
    }
	
	@PostMapping("/saveUser")
	public String creatUser(@ModelAttribute("user") Users theUser) {
		userRepo.save(theUser);
		return "redirect:/login";
	}
	

	@GetMapping("/registerUser")
	public String addUser(Model model) {
		model.addAttribute("user", new Users());
		return "registerUser";
	}
	
	
	

	
}
