package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Employee;

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {

//no implementation required
	
//spring providesCRUD methods
	
//save() , findAll() ,findById(),deleteById()	
	

}
