package org.com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@GetMapping("form")
	public String enterForm() {
		return "form";
		
	}
	@GetMapping("view")
	public String viewData(@RequestParam("id") String id, @RequestParam("password") String password, Model model) {
		
			model.addAttribute("id" +id);
			model.addAttribute("Password:" +password);
			
			
			return "view";
			
		}
		
	}

