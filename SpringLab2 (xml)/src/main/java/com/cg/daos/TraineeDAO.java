package com.cg.daos;
import com.cg.entities.Trainee;
import java.util.*;

public interface TraineeDAO {
	
	public void add(Trainee t);
    public Trainee findById(Integer traineeId);
    public List<Trainee> getAll();
    public void delete(Integer traineeId);
    public void modify(Trainee t);

}
