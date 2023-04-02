package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoClass {
	
	@GetMapping("/path")
	public String call() {
		return "Welcome to your application";
	}
}
