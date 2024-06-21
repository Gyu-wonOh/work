package com.the.ex;

interface Shape{
	public void drow();
}

class Rect implements Shape{

	@Override
	public void drow() {
		System.out.println("drow");
	}

}
public class MyClass01 {

	public static void main(String[] args) {
		// 익명 클래스: 클래스 이름없이 생성해서 사용하는 것
		Shape s1 = new Rect();
		s1.drow();
		
		Shape s2 = new Shape() {
			@Override
			public void drow() {
				System.out.println("drow");
			}
		};
		s2.drow();
	}

}
