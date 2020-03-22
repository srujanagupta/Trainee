package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.DAO.TraineeDAO;
import com.example.demo.Trainee.TraineeEntity;

@Service
@Transactional
public class TraineeService {
@Autowired
TraineeDAO tdao;

public void saveTraineeEntity(TraineeEntity te)
{
	tdao.save(te);
	
}
public void deleteTraineeEntity(int id)
{
	tdao.deleteById(id);
}
}
