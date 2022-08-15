package com.techiepro.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techiepro.employee.model.Employee;
import com.techiepro.employee.services.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
	    	System.out.println(employee);
		return employeeService.createEmployee(employee);
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
	    return employeeService.getAllEmployees();
	    
	}
}
