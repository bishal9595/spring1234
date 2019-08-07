package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.daos.IProductRepo;

import com.cg.entities.Product;
import com.cg.exceptions.ApplicationException;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private IProductRepo dao;

	@Transactional(propagation=Propagation.REQUIRED)
	public void create(Product p) {
		Product temp=dao.find(p.getProductId());
		if(temp==null) {
			dao.create(p);
		}
		else
			throw new ApplicationException("Product "+p.getProductId()+" cannot be updated!");
	}

	public void update(Product p) {
		
		Product temp=dao.find(p.getProductId());
		if(temp!=null) {
			dao.update(p);
		}
		else
			throw new ApplicationException("Product "+p.getProductId()+" cannot be updated!");
	}

	public void delete(String productId) {
		Product temp=dao.find(productId);
		if(temp!=null) {
			dao.delete(productId);
		}
		else
			throw new ApplicationException("Product "+productId+" cannot be deleted!");

	}
	
	@Transactional(readOnly = true)
	public List<Product> getAllProducts() {
		
		return dao.getall();
	}
	
	@Transactional(readOnly = true)
	public Product find(String productId) {
		Product product = dao.find(productId);
		if(product==null) {
			return dao.find(productId);
		}
		else
			throw new ApplicationException("Product cannot be found with Product Id "+productId);
	}

}
