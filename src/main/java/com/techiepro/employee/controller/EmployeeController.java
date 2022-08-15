package com.techiepro.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
	    	System.out.println(employee);
		return employeeService.createEmployee(employee);
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
	    return employeeService.getAllEmployees();
	    
	}
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id){
	    boolean deleted = false;
	    deleted = employeeService.deleteEmployee(id);
	    Map<String,Boolean> response = new HashMap<>();
	    response.put("deleted", deleted);
	    return ResponseEntity.ok(response);
	}
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmpolyeeById(@PathVariable Long id){
	    Employee employee = null;
	    employee = employeeService.getEmployeeById(id);
	    return ResponseEntity.ok(employee);
	}
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmpolyee(@PathVariable Long id, @RequestBody Employee employee){
	    Employee emp = employeeService.updateEmpolyee(id,employee);
	    return ResponseEntity.ok(employee);
	}
}
