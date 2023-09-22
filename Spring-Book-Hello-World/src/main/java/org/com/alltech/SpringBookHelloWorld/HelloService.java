package org.com.alltech.SpringBookHelloWorld;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
	public String sayHello() {
		return "Welcome to SPring Boot";
	}

}
