package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
import com.emp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return this.empRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		Employee e=new Employee();
		e.setId(emp.getId());
		e.setEmpName(emp.getEmpName());
		e.setEmail(emp.getEmail());
		e.setPhone(emp.getPhone());
		return this.empRepo.save(e);
	}

	@Override
	public void deleteEmployee(int id) {
		this.empRepo.deleteById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return this.empRepo.findAll();
	}

}
