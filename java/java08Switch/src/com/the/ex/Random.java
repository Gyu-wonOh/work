package com.the.ex;

public class Random {

	public static void main(String[] args) {

		double random = Math.random();
		System.out.println(random);//0<=random<1 0.XXX실수
		//원하는 숫자 범위가 10// 0*10<=M*10<1*10 실수
		//원하는 숫자 범위가 10// 0<=M*10<10 실수 0.XXX~9.XXX
		System.out.println((int)(random*10));
		//5개의 연속된 수자로 3부터 시작해서 랜덤하게 뽑아보자
		System.out.println((int)(random*5)+3);//3,4,5,6,7 중에 하나 생성하는 방법
		
	}

}
