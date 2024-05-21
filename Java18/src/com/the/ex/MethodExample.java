package com.the.ex;

public class MethodExample {

	public static void myPrint() {//메소드 선언
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		return;//리턴값이 없다.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample.myPrint();//메소드 호출
		MethodExample.myPrint();//메소드 호출
		MethodExample.myPrint();//메소드 호출
		MethodExample.myPrint();//메소드 호출
	}

}
