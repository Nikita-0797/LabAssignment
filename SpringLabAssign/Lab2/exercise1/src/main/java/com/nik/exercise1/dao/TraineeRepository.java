package com.nik.exercise1.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nik.exercise1.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

}
