package com.capg.studentdata.controller;

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

import com.capg.studentdata.service.StudentDataService;
import com.capg.studentdata.model.StudentDetails;
@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentDataService service;
@GetMapping("/get/{id}")
public List<StudentDetails> getdata(@PathVariable int id) {
	return service.getData(id);
}
@PostMapping("/add")
public StudentDetails addData(@RequestBody StudentDetails details) {
	return service.addData(details);
}
@DeleteMapping("/delete/{id}")
public boolean deletedata(@PathVariable int id) {
	return service.deleteData(id);
}
@PutMapping("/update")
public  StudentDetails updateData(@RequestBody StudentDetails details) {
	return service.updateData(details);
}
}
