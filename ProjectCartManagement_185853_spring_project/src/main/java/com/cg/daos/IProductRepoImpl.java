package com.cg.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entities.Product;
@Repository
@Transactional
public class IProductRepoImpl implements IProductRepo {
   
	@PersistenceContext
	EntityManager em;
	@Override
	public void create(Product p) {
		// TODO Auto-generated method stub
		em.persist(p);
		em.flush();
		
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		em.merge(p);
		
	}

	@Override
	public void delete(String productId) {
		// TODO Auto-generated method stub
		Product pro=em.find(Product.class,productId);
		em.remove(pro);
		
	}

	@Override
	public List<Product> getall() {
		// TODO Auto-generated method stub
		String q="select p from Product  p";
		Query p=em.createQuery(q);
		return p.getResultList();
	}

	@Override
	public Product find(String productId) {
		// TODO Auto-generated method stub
		return em.find(Product.class,productId);
	}

}
