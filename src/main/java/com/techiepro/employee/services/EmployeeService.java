package com.techiepro.employee.services;

import java.util.List;

import com.techiepro.employee.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(Long id);

	Employee getEmployeeById(Long id);

	Employee updateEmpolyee(Long id, Employee employee);

}
