package com.cg.daos;

import java.util.List;

import com.cg.entities.Product;

public interface IProductRepo {
	
	void create(Product p); // creating new product
	void update(Product p); // updating existing product
	void delete(String productId);   //deleting Product by id
	List<Product> getall(); // displaying all products
	Product find(String productId); // viewing product by id
	

}
