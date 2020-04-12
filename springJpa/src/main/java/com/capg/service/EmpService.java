package com.capg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.IEmpdao;
import com.capg.dto.Employee;

@Service
public class EmpService implements IEmpService {
 @Autowired
 IEmpdao dao;
 @Override
 public Employee addEmployee(Employee emp) {
	 return dao.save(emp);
 }
 @Override
 public Employee updateEmployee(Employee emp) {
	 return dao.save(emp);
 }
 @Override
 public void deleteEmployee(int eid) {
	  dao.deleteById(eid);;
 }
 @Override
 public Optional<Employee> selectEmployee(int eid){
	 return dao.findById(eid);
 }
}