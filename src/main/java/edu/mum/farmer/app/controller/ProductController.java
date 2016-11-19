package edu.mum.farmer.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.farmer.app.domain.Product;

@Controller
public class ProductController {
	@RequestMapping(value="/product", method=RequestMethod.GET )
	public String createProductForm() {
		return "create_product";
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST )
	public String createProduct(Model model,Product product) {
		System.out.println(product.getName());
		return "create_product";
	}
	
	
	
}
