package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Trainee.TraineeEntity;



public interface TraineeDAO extends JpaRepository<TraineeEntity,Integer>, CrudRepository<TraineeEntity,Integer> {
	
}
