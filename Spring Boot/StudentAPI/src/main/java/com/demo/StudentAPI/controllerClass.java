package com.demo.StudentAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class controllerClass {

	@Autowired
	studentService service;
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return service.getStudentById(id);
		
	}
	
	@PostMapping
	public String addStudent(Student student)
	{
	    service.addStudent(student);
	    return "Student Saved Successfully";
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudents()
	{
		return service.getAllStudents();
		
	}
	
}
