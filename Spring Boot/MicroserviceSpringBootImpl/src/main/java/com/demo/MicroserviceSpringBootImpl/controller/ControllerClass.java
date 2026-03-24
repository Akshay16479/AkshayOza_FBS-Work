package com.demo.MicroserviceSpringBootImpl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.MicroserviceSpringBootImpl.bean.User;

@Controller
public class ControllerClass {

	@GetMapping("/form")
	public String showForm(Model model)
	{
		model.addAttribute("user",new User());
		return "index";
	}
	
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") User user,Model model)
	{
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		
		model.addAttribute("message","user saved successfully!");

		return "success";
		
	}
	
}
