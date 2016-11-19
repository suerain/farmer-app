package edu.mum.farmer.app.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderLine {
	@Id
	@GeneratedValue
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@OneToOne(cascade = CascadeType.PERSIST)
	private Product product;
	private int quantity;
	private double price;

	public OrderLine(Product product) {
		this.product = product;
		this.quantity = 1;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = product.getPrice() * quantity;
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
