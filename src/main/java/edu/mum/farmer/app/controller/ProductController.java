package edu.mum.farmer.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import edu.mum.farmer.app.domain.Category;
import edu.mum.farmer.app.domain.Member;
import edu.mum.farmer.app.domain.Product;
import edu.mum.farmer.app.service.MemberService;
import edu.mum.farmer.app.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/product", method=RequestMethod.GET )
	public String createProductForm(@ModelAttribute("product") Product product, Model model) {
	
		//model.addAttribute("user_id",member.getId());
		return "create_product";
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST )
	public String createProduct(Principal user,Model model,Product product) {
		Member farmer=memberService.findByUserName(user.getName());
		product.setFarmer(farmer);
		productService.saveProduct(product);
		return "redirect:productlist";
	}
	
	@RequestMapping(value="/product/edit/{productId}", method=RequestMethod.GET )
	public String editProductForm(Model model,@PathVariable("productId") long productId) {
		model.addAttribute("product",productService.findOne(productId));
		return "edit_product";
	}
	
	@RequestMapping(value="/product/edit", method=RequestMethod.POST )
	public String editProduct(Principal user,@ModelAttribute("product") Product product) {
		productService.saveProduct(product);
		return "redirect:/productlist";
	}
	
	@RequestMapping(value="/productlist", method=RequestMethod.GET )
	public String listProduct(Model model) {
		model.addAttribute("products", productService.findAllProducts());
		return "list_product";
	}
	
	@RequestMapping(value="/delete_product_r/{productId}", method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void deleteProductRest(@PathVariable("productId") long productId)
	{
		productService.delete(productId);
	}
	
}
