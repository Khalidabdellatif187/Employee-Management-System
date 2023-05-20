package com.luv2code.EmployeeManagementSystem.Service;

import java.util.List;

import com.luv2code.EmployeeManagementSystem.Entity.Employee;

public interface EmployeeService {
	
	
	public Employee createEmployee(Employee employee);
	
	public List<Employee> getAllEmployess();
	
	public Employee getEmployeeById(Long id);
	
	public Employee updateEmployee(Employee employee , Long id);
	
	public void deletePostById(Long Id);
	

}
