package com.example.springapp.demoapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping ("/")
	public String welcome() {
		return "Welcome String Boot!";
	}
    
}