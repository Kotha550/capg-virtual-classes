package com.capg.service;

import java.util.Optional;

import com.capg.dto.Employee;

public interface IEmpService {
public Employee addEmployee(Employee emp);

public Employee updateEmployee(Employee emp);

public void deleteEmployee(int eid);
public Optional<Employee> selectEmployee(int eid);
	
}
