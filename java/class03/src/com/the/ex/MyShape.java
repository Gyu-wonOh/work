package com.the.ex;
import com.the.dto.Shape;
import com.the.dto.Triangle;

public class MyShape {

	public static void main(String[] args) {
		//Shape s =new Shape();
		Triangle t = new Triangle();
		t.drow1();
		t.drow2();
		t.drow3();
		Shape s1 = t;
		Shape s2 = new Triangle();
		s2.drow1();
		s2.drow2();
//		s2.drow3(); //인터페이스에 없는 메소드

		
	}

}
