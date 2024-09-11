package com.the.ex;

import com.the.dto.MyClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(MyClass.a);
//		System.out.println(MyClass.aCount()); aCount는 void를 리턴한다.
		MyClass.aCount();//11
		MyClass.aCount();//12
		
		//인스턴스 필드와 메소드에 접근할 수 있는 방법은 없다.
		//접근하려면 인스턴스를 생성해야 한다.
		
		MyClass m1 = new MyClass();
		System.out.println(m1.b);//20
		m1.bCount();//21
		
		MyClass m2 = new MyClass();
		System.out.println(m2.b);//20
		m2.bCount();//21
		m2.bCount();//22
		
	
	}

}
