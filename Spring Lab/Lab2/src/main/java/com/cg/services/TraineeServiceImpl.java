package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.TraineeDAO;
import com.cg.entities.Trainee;


@Service
@Transactional
public class TraineeServiceImpl implements TraineeService{
	
	
	
	 @Autowired private TraineeDAO dao;
	    
	  
	@Transactional(readOnly=true)
	public Trainee find(int TraineeId) {
		return dao.find(TraineeId);
	}

	@Transactional(readOnly=true)
	public List<Trainee> getAll() {
	return dao.getAll();
	}

	@Transactional(readOnly=true)
	public void create(Trainee t) {
		
       dao.create(t);
		
	}
	
	public void delete(Integer t) {
		dao.delete(t);
		
	}

	public void modify(Trainee t) {
	dao.modify(t);
		
	}
}
