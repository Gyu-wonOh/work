package com.the.ex;

import java.util.ArrayList;

import com.the.dto.Computer;
import com.the.dto.Product;
import com.the.dto.TV;

public class MyProduct {

	public static void main(String[] args) {
		//사용자가 구매한 물품의 가격 총합을 구현하는 프로그램
		
		//1. 구매한 제품을 arrList에 담아서
		//2. 담음 모든 제품을 더한 결과를 얻는다.
		
		ArrayList<Product> arrays = new ArrayList<Product>();
		arrays.add(new Product("신라면",500,0));
		arrays.add(new Product("연필",400,10));
		arrays.add(new Product("신발",15000,20));
		arrays.add(new Product("공",11000,20));
		//TV [inch=" + inch + ", fare=" + fare + ", id=" + id + ", price=" + price + "
//		, discountRate="+ discountRate + "]
		arrays.add(new TV("삼성TV",1500000,5,30,1000));
		arrays.add(new TV("LGTV",1600000,15,30,1000));
//		public Computer(String id,double price,double discountRate,double ram, double fare)
		arrays.add(new Computer("Asus",1390000,10,2,20000));
		//구매 내역과  총 사용금액 출력
		double sum = 0;
		for(int i= 0; i<arrays.size();i++) {
			sum=sum+arrays.get(i).getProductPrice();
			System.out.println(arrays.get(i)+"실제요금:"+arrays.get(i).getProductPrice());
		}
		System.out.println("최종요금 :"+ sum);
	}

}
