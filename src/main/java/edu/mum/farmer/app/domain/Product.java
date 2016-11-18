package edu.mum.farmer.app.domain;

public class Product {
	private int p_id;
	private String name;
	private String qty;
	
	private Person preson;
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
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
	public Person getPreson() {
		return preson;
	}
	public void setPreson(Person preson) {
		this.preson = preson;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		else if (!(obj instanceof Product)) return false;
		Product product = (Product) obj;
		return product.p_id == p_id;
		
	}
	
}
