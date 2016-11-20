package edu.mum.farmer.app.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String qty;
	private double price;
	@Enumerated(EnumType.ORDINAL)
	private Category category;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Member farmer;

	public Member getFarmer() {
		return farmer;
	}

	public void setFarmer(Member farmer) {
		this.farmer = farmer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (!(obj instanceof Product))
			return false;
		Product product = (Product) obj;
		return product.id == id;

	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = Category.FRUIT;
	}

}
