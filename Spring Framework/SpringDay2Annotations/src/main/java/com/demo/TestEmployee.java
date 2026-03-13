package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext c=new AnnotationConfigApplicationContext(Configuration.class);
		Employee e=c.getBean(Employee.class);
		e.info();
		
	}

}
