package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

@Repository
public class TraineeDAOImpl implements TraineeDAO{
	
	
	@PersistenceContext
    private EntityManager em;
    

	public Trainee find(int TraineeId) {
		return em.find(Trainee.class, TraineeId);
	}

	public List<Trainee> getAll() {
		 Query q = em.createQuery("from Trainee t");
	        return q.getResultList();
	}

	public void create(Trainee t) {
		 em.persist(t);
	        em.flush();
		
	}

	public void delete(Integer t) {
		Trainee t1=em.find(Trainee.class, t);
		em.remove(t1);
		
	}

	public void modify(Trainee t) {
	
	em.merge(t);
		
	}
	
	

}
