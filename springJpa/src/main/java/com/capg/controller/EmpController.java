package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dao.IEmpdao;
import com.capg.dto.Employee;
import com.capg.service.IEmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	IEmpService ser;

	@GetMapping("/select/{eid}")
	public String selectEmployee(@PathVariable("eid") int eid) {
ser.selectEmployee(eid);
		return "employee selected";
	}

	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee emp) {
ser.addEmployee(emp);
		return "added";
	}

	@DeleteMapping("/delete")
	public String deleteEmployee(@PathVariable("eid") int eid) {
ser.deleteEmployee(eid);
		return "deleted";
	}

	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp) {
ser.updateEmployee(emp);
		return "updated";
	}
}