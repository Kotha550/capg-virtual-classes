package com.capg.studentdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.studentdata.model.StudentDetails;
import com.capg.studentdata.repo.StudentRepo;

@Service
public class StudentDataService {
@Autowired
StudentRepo repo;
public  List<StudentDetails> getData(int id){
	return repo.findAll();
}
public StudentDetails addData(StudentDetails details){
	return repo.save(details);	
}
public boolean deleteData(int id) {
	repo.deleteById(id);
	return !repo.existsById(id);
}
public StudentDetails updateData(StudentDetails newdata) {
	StudentDetails data=repo.getOne(newdata.getId());		
	data.setName(newdata.getName());
	data.setDob(newdata.getDob());
	return data;
}
}
