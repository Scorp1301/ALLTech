package org.com.alltech.SpringBookHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBookHelloWorldApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBookHelloWorldApplication.class, args);
//		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBookHelloWorldApplication.class, args);
//		for(String name:ctx.getBeanDefinitionNames()) {
//			System.out.println("Beans:" + name);
//		}
		
		ApplicationContext ctx = SpringApplication.run(SpringBookHelloWorldApplication.class, args);
		HelloService h = ctx.getBean(HelloService.class);
		String message = h.sayHello();
		System.out.println(message);
	}

}
