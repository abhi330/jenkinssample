package com.jenkinssample.jenkinssample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkinsanddockercontroller {
	
	@GetMapping("/")
	public String dockerHello() {
		return "jenkins with docker";
	}

}
