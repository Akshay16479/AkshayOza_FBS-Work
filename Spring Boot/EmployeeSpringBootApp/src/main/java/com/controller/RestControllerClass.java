package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.businessService.EmployeeBusinessService;

@RestController	
@RequestMapping("/employee")
public class RestControllerClass 
{
	@Autowired
	EmployeeBusinessService service;

	@PostMapping
	public Employee addEmployee(@RequestParam String eName,@RequestParam double eSal )
	{
		 Employee e = new Employee();

		  
		    e.seteName(eName);
		    e.seteSal(eSal);

		    return service.saveEmployee(e);
		
	}
	
	
	@GetMapping
	public List<Employee>getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	//read by id
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable int eId)
	{
		return service.getAllEmployeeById(eId);
	}
	
	@DeleteMapping("/{eId}")
	public String deleteEmployee(@PathVariable int eId)
	{
		return service.deleteEmployee(eId);
		
	}
	
}
