package com.springlab2.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlab2.demo.models.Trainee;
import com.springlab2.demo.repository.TraineeDaoInterface;

@Service
public class TraineeService{

	@Autowired
	TraineeDaoInterface traineeRepo;
	

	@Transactional
	public Trainee addTrainee(Trainee trainee) {
		return  traineeRepo.save(trainee);
	}

	@Transactional
	public boolean deleteTrainee(int traineeId) {
		traineeRepo.deleteById(traineeId);
		return !traineeRepo.existsById(traineeId);
	}

	@Transactional
	public Trainee updateTrainee(Trainee trainee) {
	    Trainee newTrainee=traineeRepo.getOne(trainee.getTraineeId());
	    newTrainee.setTraineeName(trainee.getTraineeName());
	    newTrainee.setTraineeLocation(trainee.getTraineeLocation());
	    newTrainee.setTraineeDomain(trainee.getTraineeDomain());
	    traineeRepo.save(newTrainee);
		return trainee;
	}

	public Trainee getTraineeById(int traineeId) {
		return traineeRepo.getOne(traineeId);
	}
	
	public List<Trainee> getAllTrainees() {
		return traineeRepo.findAll();
	}

}
