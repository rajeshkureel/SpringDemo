package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class HomeController {

	@GetMapping
	public String homeMethod() {
		return "home";
	}
}
