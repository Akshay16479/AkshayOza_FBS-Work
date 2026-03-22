package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bean.Employee;

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {

//no implementation required
	
//spring providesCRUD methods
	
//save() , findAll() ,findById(),deleteById()	
	
	//custom method
	List<Employee> findByEName(String eName);

	//JPQL
	@Query("select e from Employee e where e.eSal >:sal") //insted name parameter we can use :?1 positional parameter
	List<Employee> findByESalGreaterThan(@Param("sal") double eSal);  
	
}
