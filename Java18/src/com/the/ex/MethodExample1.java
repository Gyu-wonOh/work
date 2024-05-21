package com.the.ex;

public class MethodExample1 {
	public static int add(int a, int b) {//메소드선언
		return a+b;//리턴값이 a+b한 값이다.
	}
	public static void main(String[] args) {
		int result = MethodExample1.add(5,3);//메소드 호출
		System.out.println("Result:"+result);//8
	
	//리턴값이 없으면 return를 생략 가능하다.
	}
}
