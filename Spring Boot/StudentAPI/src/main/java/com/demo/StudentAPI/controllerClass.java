package com.demo.StudentAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
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
	public String addStudent(@RequestBody Student student)
	{
	    service.addStudent(student);
	    return "Student Saved Successfully";
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudents()
	{
		return service.getAllStudents();
		
	}
	// UPDATE STUDENT
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student)
    {
        student.setId(id);
        service.addStudent(student);
        return "Student Updated Successfully";
    }

    // DELETE STUDENT
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        service.deleteStudent(id);
        return "Student Deleted Successfully";
    }
}
