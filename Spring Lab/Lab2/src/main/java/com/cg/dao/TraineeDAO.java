package com.cg.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;


public interface TraineeDAO  {

	Trainee find(int TraineeId);
    List<Trainee> getAll();
    void create(Trainee t);
    void delete(Integer t);
    void modify(Trainee t);
}
