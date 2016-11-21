package edu.mum.farmer.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String createProductForm( Principal user , Model model) {
		//Accessing the member to set the Member with Farmer role to Product
		//Member member=memberService.findByUserName(user.getName());
		//System.out.println(member.getFirstName());
	
		//model.addAttribute("user",user);
		Product product = new Product();
		model.addAttribute("product",product);
		return "create_product";
		
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST )
	public String createProduct(Model model,Product product) {
		System.out.println(product.getName());
		productService.saveProduct(product);
		return "redirect:test";
	}
	

	@RequestMapping(value="/productlist", method=RequestMethod.GET )
	public String listProduct(Model model) {
		//Accessing the member to set the Member with Farmer role to Product
		//Member member=memberService.findByUserName(user.getName());
		//System.out.println(member.getFirstName());
		//productService
		//model.addAttribute("user",user);
		return "template/base_template";
		
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET )
	public String testProduct(Model model) {
		System.out.println("HERE Dipen");
		model.addAttribute("content", "content");
		return "template/base_template";
	}
	
	
}
