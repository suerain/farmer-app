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
	/*@Autowired
	MemberService memberService;
	*/
	@RequestMapping(value="/product", method=RequestMethod.GET )
	public String createProductForm( Principal user , Model model) {
		/*Member member=memberService.findByUserName("santosh");
		System.out.println(member.getFirstName());
	*/
		model.addAttribute("user",user);
		return "create_product";
	}
	
	@RequestMapping(value="/product", method=RequestMethod.POST )
	public String createProduct(Model model,Product product) {
		System.out.println(product.getName());
		productService.saveProduct(product);
		return "redirect:create_product";
	}
	
	
	
}
