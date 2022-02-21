package com.nik.exercise1.service;

import java.util.List;

import com.nik.exercise1.entity.Trainee;

public interface TraineeService {
	
	public Trainee save(Trainee trainee);
	public List<Trainee> getAllTrainee();
	public Trainee getTraineeById(int traineeId);
	public Trainee updateTrainee(Trainee trainee);
	
	public void deleteTrainee(int traineeId);

}
