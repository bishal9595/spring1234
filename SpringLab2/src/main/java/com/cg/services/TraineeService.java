package com.cg.services;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeService {
	

	public void add(Trainee t);
    public Trainee findById(Integer traineeId);
    public List<Trainee> getAll();
    public void delete(Integer traineeId);
    public void modify(Trainee t);
    public boolean authenticate(String user,String pass);

}
