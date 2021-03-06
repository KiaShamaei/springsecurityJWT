package com.springsecurity.jwtexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	
	@RequestMapping("hello")
	public String helloWorld(@RequestParam(value = "name" , defaultValue = "world") String name) {
		return "Hello" + name ;
	}
	
	@RequestMapping("login")
	public String login() {
		return "login"  ;
	}

}
