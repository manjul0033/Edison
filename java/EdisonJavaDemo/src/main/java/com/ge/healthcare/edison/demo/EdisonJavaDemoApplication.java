package com.ge.healthcare.edison.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EdisonJavaDemoApplication {
	
	@RequestMapping("/")
    public String sayHello() {
        return "<h1>Hello from Edison Platform !!!<h1>";
    }

	public static void main(String[] args) {
		SpringApplication.run(EdisonJavaDemoApplication.class, args);
	}

}
