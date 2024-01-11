package com.avinash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.entity.Employee;
import com.avinash.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> findAllEmployee(){
		List<Employee> findAllEmployee = employeeService.findAllEmployee();
		return findAllEmployee;
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable int id) {
		return employeeService.findById(id);
	}
	
	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {
		employeeService.deleteById(id);
		return "Employee deleted successfully. id = "+id;
	}
	
	
	
	
	
	
}
