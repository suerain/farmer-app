package edu.mum.farmer.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.farmer.app.domain.Category;
import edu.mum.farmer.app.domain.Product;
import edu.mum.farmer.app.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/product", method=RequestMethod.GET )
	public String createProductForm(Model model) {
		model.addAttribute("categories", Category.values());
		return "create_product";
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST )
	public String createProduct(Model model,Product product) {
		System.out.println(product.getCategory());
		productService.saveProduct(product);
		return "redirect:/product";
	}
	
	@RequestMapping(value="/productlist", method=RequestMethod.GET )
	public String listProduct(Model model) {
		model.addAttribute("products", productService.findAllProducts());
		return "list_product";
	}
	
	
}
