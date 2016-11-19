package edu.mum.farmer.app.service;

import java.util.List;

import edu.mum.farmer.app.domain.Product;

public interface IProductService {
	public Product saveProduct(Product product);
	public Product findOne(long id);
	public List<Product> findAllProducts();
	public Product update(Product product);
	public void delete(long id);
	
}
