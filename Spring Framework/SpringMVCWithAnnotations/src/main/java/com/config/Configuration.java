package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "Controller")
public class Configuration {
	
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		
		resolver.setPrefix("/views");
		resolver.setSuffix(".jsp");
		
		return null;
		
	}

}
