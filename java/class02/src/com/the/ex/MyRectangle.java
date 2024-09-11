package com.the.ex;
class Rectangle{
	public double width=20;
	public double height=30;
	
	public double area() {
		return width*height;
	}
}

class RectanglePillar2{ //사각기둥의 부피를 구하는 클래스
	public double width= 10;
	public double height= 11;
	public double depth = 20;

	public double area() {// 사각형의 넓이를 구하는 메소드
		return width*height;
	}
	public double volume() {//사각기둥의 부피를 구하는 메소드
		return width*height*depth;
	}
}
class RectanglePillar extends Rectangle{
	public double depth = 20;
	public double volume() {//사각기둥의 부피를 구하는 메소드
		return width*height*depth;
	}
}
class Triangle{
	public double width =20;
	public double height=10;
	public double area() {
		return (width*height)/2;
	}
}
class TrianglePillar extends Triangle {
	public double depth = 10;
	public double volume() {
		return area()*depth;
	}
}
public class MyRectangle {
//	public static double width=20;
//	public static double height=30;
//	
//	public static double area() {
//		return width*height;
//	}
//	
//	public static double width1=25;
//	public static double height1=35;
//	
//	public static double area1() {
//		return width1*height1;
//	}

	public static void main(String[] args) {
		//여러 개의 사각형 넓이를 구해보자.
//		System.out.println("area :" + area());
//		System.out.println("area1 :" + area1());
	
		Rectangle r = new Rectangle();
		r.height=19;
		r.width=20;
		System.out.println(r.area());
		//Rectangle Pillar 클래스 =사각형의 넓이와 부피를 구하는 클래스
		RectanglePillar2 rp= new RectanglePillar2();
		rp.height=30;
		rp.width=20;
		rp.depth=10;
		
		System.out.println("area:"+rp.area());
		System.out.println("volume:"+rp.volume());
		
		RectanglePillar rp2 = new RectanglePillar();
		rp2.width = 10;
		rp2.height = 20;
		rp2.depth = 10;
		System.out.println("area:"+rp2.area());
		System.out.println("volume:"+rp2.volume());
		
		//1.삼각형 클래스를 상속받아 삼각기둥 클래스를 만들어 보자. Triangle,TrianglePillar
		Triangle t =new Triangle();
		t.width=10;
		t.height=15;
		System.out.println("area: "+ t.area());
		TrianglePillar tp = new TrianglePillar();
		tp.width=10;
		tp.height=15;
		System.out.println("area:"+tp.area());
		System.out.println("area:"+tp.volume());
	}

}
