package com.the.dto;


//inch가 10을 넘으면 배송료 +10,000원 추가
public class TV extends Product {
	public double inch =10;
	public double fare= 10000;
	
	
	@Override
	public String toString() {
		return "TV [inch=" + inch + ", fare=" + fare + ", id=" + id + ", price=" + price + ", discountRate="
				+ discountRate + "]";
	}

	public TV() {}
	
	public TV(String id,double price,double discountRate,double inch, double fare) {
		super();
		this.id =id;
		this.price=price;
		this.discountRate=discountRate;
		this.inch = inch;
		this.fare = fare;
	}

	public double getProductPrice() {
		double returnValue = price-price*(discountRate/100);
		if(inch >= 10) {
			returnValue=fare+returnValue;
		}
		return returnValue;
	}
}
