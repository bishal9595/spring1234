package com.cg.services;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeService {

	Trainee find(int TraineeId);
    List<Trainee> getAll();
    void create(Trainee t);
    void delete(Integer t);
    void modify(Trainee t);
}
