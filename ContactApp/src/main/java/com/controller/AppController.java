package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/registration")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/registration")
	public String deleteit() {
		return "register";
	}
	@RequestMapping("/registration")
	public String deleteita() {
		return "register";
	}
}