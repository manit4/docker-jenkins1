package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/msg")
	public String message() {
		
		System.out.println("insdie message");
		
		return "Hi, I am Docker";
	}

}
