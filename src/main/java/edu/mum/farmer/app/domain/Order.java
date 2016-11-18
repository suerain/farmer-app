package edu.mum.farmer.app.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderLine> orderLineList = new ArrayList<OrderLine>();
	private double totalPrice;

	public void addProduct(Product p) {
		if (!getProductList().contains(p)) {
			OrderLine oL = new OrderLine(p);
			orderLineList.add(oL);
		} else {
			OrderLine oL = getOrderLineForProduct(p);
			oL.setQuantity(oL.getQuantity() + 1);
		}
	}

	public void removeProduct(Product p) {
		if (getProductList().contains(p)) {
			OrderLine oL = getOrderLineForProduct(p);
			if (oL.getQuantity() > 1) {
				oL.setQuantity(oL.getQuantity() - 1);
			} else {
				orderLineList.remove(oL);
			}
		}
	}

	public List<Product> getProductList() {
		List<Product> orderList = new ArrayList<Product>();
		for (OrderLine oL : orderLineList) {
			orderList.add(oL.getProduct());
		}
		return orderList;
	}

	private OrderLine getOrderLineForProduct(Product p) {
		if (getProductList().contains(p)) {
			for (OrderLine oL : orderLineList) {
				if (oL.getProduct().equals(p)) {
					return oL;
				}
			}
		}
		return null;
	}

	public List<OrderLine> getOrderLineList() {
		return orderLineList;
	}

	public void setOrderLineList(List<OrderLine> orderLineList) {
		this.orderLineList = orderLineList;
	}

	public double getPrice() {
		totalPrice = 0;
		for (OrderLine oL : orderLineList) {
			totalPrice += oL.getQuantity() * oL.getProduct().getPrice();
		}
		return totalPrice;
	}

	public double getTotalPrice() {
		totalPrice = 0;
		for (OrderLine oL : orderLineList) {
			totalPrice += oL.getQuantity() * oL.getProduct().getPrice();
		}
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
