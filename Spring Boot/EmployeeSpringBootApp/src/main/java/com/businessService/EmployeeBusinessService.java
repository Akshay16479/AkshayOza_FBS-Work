package com.businessService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeBusinessService {

	@Autowired
	EmployeeRepository rep;

	public Employee saveEmployee(Employee e) {
		
		return rep.save(e);
	}

	public List<Employee> getAllEmployee() {
		
		return rep.findAll();
	}

	public Employee getAllEmployeeById(int eId) {
		
		return rep.findById(eId).orElse(null);
	}

	public String deleteEmployee(int eId) {
		
		rep.deleteById(eId);
	    return "Employee Deleted Successfully";
	}

}
