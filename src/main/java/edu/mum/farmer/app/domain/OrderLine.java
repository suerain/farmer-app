package edu.mum.farmer.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	
	/*private Product product;
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
*/
}
