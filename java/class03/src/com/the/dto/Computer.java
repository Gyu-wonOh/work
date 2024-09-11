package com.the.dto;

public class Computer extends Product {
	public double ram = 1;
	public double fare =20000;
	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", fare=" + fare + ", id=" + id + ", price=" + price + ", discountRate="
				+ discountRate + "]";
	}

	public Computer() {}
	
	public Computer(String id,double price,double discountRate,double ram, double fare) {
		super();
		this.id = id;
		this.price = price;
		this.discountRate = discountRate;
		this.ram = ram;
		this.fare = fare;
	}

	public double getProductPrice() {
		double returnValue = price - price*(discountRate/100);
		return returnValue+(ram*fare);
	}
}
