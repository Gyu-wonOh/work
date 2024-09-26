package com.the.ex;

public class Example {
	public static int globalVar =10;//전역 변수
	
	public static void main(String[] args) {

		int localVar = 20;//지역변수
		
		
		System.out.println(Example.globalVar);
		System.out.println(localVar);
	
		Example.globalVar=40;
		localVar=30;
		
		System.out.println(Example.globalVar);
		System.out.println(localVar);
		
		System.out.println(globalVar);//전역 변수가 같은 클래스에서 사욛되면 클래스명.을 생략할 수 있다.
		
		//전역변수와 지역변수의 변수명이 같을 경우, 전역변수 출력시 클래스.변수명으로 입력하면 전역변수 출력이 가능하다.
		int globalVar = 100;
		System.out.println(Example.globalVar);
		System.out.println(globalVar);
		System.out.println(localVar);
	}

}
