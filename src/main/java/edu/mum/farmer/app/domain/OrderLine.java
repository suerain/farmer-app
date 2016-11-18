package edu.mum.farmer.app.domain;

import javax.persistence.Entity;

@Entity
public class OrderLine {
	private Product product;
	private int quantity;
	
	public OrderLine(Product product) {
		this.product = product;
		this.quantity = 1;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
