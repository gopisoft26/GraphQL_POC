package com.user.app.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

	@GetMapping
	public String welcome() {
		return "Welcome Hello !.";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello ! india";
	}
}
