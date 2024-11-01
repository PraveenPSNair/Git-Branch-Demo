package com.example.Git_Branch_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitBranchDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitBranchDemoApplication.class, args);
	}
	//@GetMapping("/hello")
    public String hello() {
      return String.format("Hello this is the world of DevOps");
    }
    public String welcome() {
        return String.format("Welcome to the world of DevOps");
      }
    public String ready() {
        return String.format("Are u ready to travel with DevOps");
      }

}
