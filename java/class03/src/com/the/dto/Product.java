package com.the.dto;

public class Product {
	public String id = "";
	public double price = 0;
	public double discountRate=0;
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", discountRate=" + discountRate + "]";
	}

	public Product() {}
	public Product(String id, double price, double discountRate) {
		super();
		this.id = id;
		this.price = price;
		this.discountRate = discountRate;
	}


	public double getProductPrice() {
		return price-price*(discountRate/100);
	}
}
