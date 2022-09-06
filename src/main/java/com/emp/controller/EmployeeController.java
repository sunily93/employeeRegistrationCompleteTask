package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee createEmp(@RequestBody Employee employee)
	{
		return this.employeeService.createEmployee(employee);
	}
	
	@PutMapping("/{id}")
	public Employee updateEmp(@PathVariable("id") int id,@RequestBody Employee e)
	{
		Employee employee = new Employee();
		employee.setId(e.getId());
		employee.setEmpName(e.getEmpName());
		employee.setEmail(e.getEmail());
		employee.setPhone(e.getPhone());		
		return this.employeeService.updateEmployee(e);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmp(@PathVariable("id") int id)
	{
		this.employeeService.deleteEmployee(id);
	}
	
	@GetMapping("/")
	public List<Employee> getAllEmp()
	{
		return this.employeeService.getAllEmployee();
	}
	
}
