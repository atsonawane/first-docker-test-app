package com.avinash.service;

import java.util.List;

import com.avinash.entity.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployee();

	Employee findById(int id);

	Employee save(Employee employee);

	void deleteById(int id);

}
