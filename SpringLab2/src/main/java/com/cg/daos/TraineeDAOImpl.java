package com.cg.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

@Repository
public class TraineeDAOImpl implements TraineeDAO {
	
	@PersistenceContext
    private EntityManager em;
    
	public void add(Trainee t) {
		// TODO Auto-generated method stub
		//em.getTransaction().begin();
		em.persist(t);
		//em.getTransaction().commit();
		em.flush();

	}

	public Trainee findById(Integer traineeId) {
		// TODO Auto-generated method stub
		return em.find(Trainee.class, traineeId);
	}

	public List<Trainee> getAll() {
		// TODO Auto-generated method stub
		Query q = em.createQuery("from Trainee t");//That's "JPQL" not SQL !!!
        return q.getResultList();
	}

	public void delete(Integer traineeId) {
		// TODO Auto-generated method stub

		em.remove(em.find(Trainee.class, traineeId));
	}

	public void modify(Trainee t) {
		// TODO Auto-generated method stub
		Trainee up=em.find(Trainee.class, t.getTraineeId());
		up.setTraineeName(t.getTraineeName());
		up.setTraineeDomain(t.getTraineeDomain());
		up.setTraineeLocation(t.getTraineeLocation());
		
			
	}

}
