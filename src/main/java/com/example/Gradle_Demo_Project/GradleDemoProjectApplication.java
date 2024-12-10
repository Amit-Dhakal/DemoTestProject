package com.example.Gradle_Demo_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GradleDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleDemoProjectApplication.class, args);
	}

     @GetMapping("/home")
	public String getHomePage(){
		return "Welcome To The Gradle";
	}


}
