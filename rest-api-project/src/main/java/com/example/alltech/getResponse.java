package com.example.alltech;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getResponse {
	@PostMapping("/hello")
	public void showmessage() {
		System.out.println("Hello from rest APi");
	}

}
