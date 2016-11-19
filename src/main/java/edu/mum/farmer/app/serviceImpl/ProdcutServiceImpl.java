package edu.mum.farmer.app.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.farmer.app.domain.Product;
import edu.mum.farmer.app.repository.ProductRepository;
import edu.mum.farmer.app.service.ProductService;

@Service
@Transactional
public class ProdcutServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	public ProdcutServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
