package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/home")
	public String showHome(Model model)
	{
		model.addAttribute("message","Welcome to spring mvc");
		
		return "home";
	}
	
	
	
}
