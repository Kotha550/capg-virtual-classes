package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.hibernate.loader.plan.exec.process.spi.ReturnReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.model.User;
import com.capg.springboot.repository.UserJpaRepo;
import com.capg.springboot.repository.UserRepo;

@Service
public class UserService {

//	@Autowired
//	UserRepo repo;
	
	@Autowired
	UserJpaRepo userRepo;
	
	public List<User> getListOfUsers(){
		//return repo.getAllUsers();
		
		return userRepo.findAll();
	}
	
	public User getUser(int userId) {
		//return repo.getUser(userId);
		return userRepo.getOne(userId);
	}
	
	@Transactional
	public User addUser(User user) {
		//return repo.addUser(user);
		return userRepo.save(user);
	}
	
	@Transactional
	public boolean deleteUser(int userId) {
		//User user=getUser(userId);
		 //return repo.deleteUser(user);
		userRepo.deleteById(userId);
		return !userRepo.existsById(userId);
	}

	@Transactional
	public User updateUser(User newUserData) {
		User user=userRepo.getOne(newUserData.getUserId());		
		user.setEmail(newUserData.getEmail());
		user.setPhone(newUserData.getPhone());
		user.setUserName(newUserData.getUserName());
		userRepo.save(user);
		return user;
		
	}
	@Transactional
	public User getUserByEmail(String email) {
		return userRepo.getByEmail(email);
	}
	
	
}
