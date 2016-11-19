package edu.mum.farmer.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.farmer.app.domain.Address;
import edu.mum.farmer.app.domain.Order;
import edu.mum.farmer.app.service.IOrderService;
import edu.mum.farmer.app.service.IProductService;

@Controller
public class OrderController {
	@Autowired
	private IOrderService orderService;

	@Autowired
	private IProductService productService;

	@RequestMapping(value = "/addToCart")
	public String addToCart(@ModelAttribute("order") Order order) {
		//To be changed later
//		String = 1L;
//		Order order = orderService.getOrderForPerson(id);
		return "addToCart";
	}

	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public String add(Model model, Order order) {
		orderService.saveOrder(order);
		// model.addAttribute("products", productService.getAll());
		return "dashboard";
	}
	
//	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
//	public String goToDashBoard(Model model, Order order) {
//		orderService.saveOrder(order);
//		// model.addAttribute("products", productService.getAll());
//		return "dashboard";
//	}

}
