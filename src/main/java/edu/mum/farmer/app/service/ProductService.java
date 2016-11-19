package edu.mum.farmer.app.service;

import java.util.List;

import edu.mum.farmer.app.domain.Product;

public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> findAllProducts();
}
