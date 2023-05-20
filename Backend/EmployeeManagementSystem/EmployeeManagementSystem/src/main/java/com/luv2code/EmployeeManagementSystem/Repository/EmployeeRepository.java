package com.luv2code.EmployeeManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.luv2code.EmployeeManagementSystem.Entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	@Query("SELECT MAX(employee.id) FROM Employee employee")
	public Long findMaxId();
	

}
