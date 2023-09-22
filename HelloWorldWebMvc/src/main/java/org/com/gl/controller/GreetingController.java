package org.com.gl.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	@GetMapping("greeting")
	public String sayHello(Map<String, Object> model) {
		model.put("message", "This is Spring MVC");
		
		return "greeting";
	}

}
