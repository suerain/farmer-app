package edu.mum.farmer.app.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.farmer.app.domain.Product;
import edu.mum.farmer.app.repository.ProductRepository;
import edu.mum.farmer.app.service.IProductService;

@Service
@Transactional
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product findOne(long id) {
		// TODO Auto-generated method stub
		return productRepository.findOne(id);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		productRepository.delete(id);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}


}
