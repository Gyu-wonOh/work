package com.the.ex;

abstract class Shape{
	public abstract double getArea();//추상 메소드
	public void getColor() {
		System.out.println("빨강색");
	}
}
class Rectangle extends Shape{
	public double width =30;
	public double height=40;
	
	public double getVolume() {
		return width*height*10;
	}
	@Override
	public double getArea() {
		return width*height;
	};
}
public class MyAstract {

	public static void main(String[] args) {

		//Shape s= new Shape();//추상메소드는 생성할 수 없다.
		
		Rectangle r=new Rectangle();
		System.out.println(r.getVolume());
		System.out.println(r.getArea());
	}

}
