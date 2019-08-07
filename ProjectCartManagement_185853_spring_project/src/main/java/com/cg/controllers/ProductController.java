package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Product;
import com.cg.services.ProductService;

@RestController
@RequestMapping("/")
public class ProductController {
	@Autowired
	ProductService service;

	@GetMapping(value = "/products")    // Get mapping for all products
	public List<Product> getAllProducts() {

		return service.getAllProducts();
	}

	@GetMapping(value = "/find/{id}")  // Get mapping for viewing product by id
	public Product findById(@PathVariable String id) {
		return service.find(id);
	}

	@PostMapping(value = "/new", consumes = { "application/json" })  // Post mapping for creating new Product
	public String save(@RequestBody Product product) {
		service.create(product);
		return "Product added!";
	}

	@PutMapping(value = "/update", consumes = { "application/json" })  // Put mapping for updating product by id
	public String update(@RequestBody Product product) {
		service.update(product);
		return "Product updated";
	}
	
	@DeleteMapping(value="/delete/{id}") // Delete mapping for deleting product by id
	public String delete(@PathVariable String id)
	{
		service.delete(id);
		return "Product deleted";
	}

}
