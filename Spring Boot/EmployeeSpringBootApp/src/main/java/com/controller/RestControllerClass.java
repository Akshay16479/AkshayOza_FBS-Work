package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	
	//read by id and EXCEPTION HANDLING
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable int eId)
	{
		if(eId==0)
		{
			throw new RuntimeException("Employee Not Found-Invalid ID");
		}
		return service.getAllEmployeeById(eId);
	}
	//exception handling applicable only for this controller(local exception)
	
	@ExceptionHandler(RuntimeException.class)//any our custom class
	public String handleException(RuntimeException ex)
	{
		return "Error : " + ex.getMessage();
		
	}

	
	
	@DeleteMapping("/{eId}")
	public String deleteEmployee(@PathVariable int eId)
	{
		return service.deleteEmployee(eId);
		
	}
	
	@GetMapping("/employee/{name}")
	public List<Employee> getEmployee(@PathVariable String name)
	{
		return service.getEmployeeByName(name);
		
	}
	
	@GetMapping("/salary/{sal}")
    public List<Employee> getEmployeeBySalary(@PathVariable double sal)
    {
        return service.getEmployeeBySalary(sal);
    }
	
}
