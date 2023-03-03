package com.example.FirstWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstWebAppController {

	@GetMapping("/")
	public String index() {
		return "Hello World!";
	}

}