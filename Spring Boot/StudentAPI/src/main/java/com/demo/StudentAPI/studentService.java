package com.demo.StudentAPI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {

	@Autowired
	studentRepository rep;
	
	public Student getStudentById(int id) {
		
		return rep.findById(id).orElse(null);
	}

	public Student addStudent(Student student) {
		
		return rep.save(student);
	}

	public List<Student> getAllStudents() {
		
		return rep.findAll();
	}

	

}
