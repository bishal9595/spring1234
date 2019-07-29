package com.cg.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.daos.TraineeDAO;
import com.cg.entities.Trainee;
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
@Autowired private TraineeDAO dao;
    
	@Transactional(propagation=Propagation.REQUIRED)
	public void add(Trainee t) {
		// TODO Auto-generated method stub
		dao.add(t);
	}

    @Transactional(readOnly=true)
	public Trainee findById(Integer traineeId) {
		// TODO Auto-generated method stub
		return dao.findById(traineeId);
	}

    @Transactional(readOnly=true)
	public List<Trainee> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
    
    @Transactional(propagation=Propagation.REQUIRED)
	public void delete(Integer traineeId) {
		// TODO Auto-generated method stub
		if(dao.findById(traineeId)!=null) {
			dao.delete(traineeId);
		}else {
			System.out.println("Not Found");
		}
	}
    
    @Transactional(propagation=Propagation.REQUIRED)
	public void modify(Trainee t) {
		// TODO Auto-generated method stub
		if(dao.findById(t.getTraineeId())!=null) {
			dao.modify(t);
		}else {
			System.out.println("Not Found");
		}
	}

	public boolean authenticate(String user, String pass) {
		// TODO Auto-generated method stub
		if(user.equals("admin") && pass.equals("admin")) {
			return true;
		}
		else
		return false;
	}

}
