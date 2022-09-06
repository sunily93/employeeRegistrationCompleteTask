package com.emp.service;

import java.util.List;

import com.emp.entity.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	
	public Employee updateEmployee(Employee eS);
	
	public void deleteEmployee(int id);
	
	public List<Employee> getAllEmployee();
	
}
