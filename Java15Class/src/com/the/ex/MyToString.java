package com.the.ex;

import com.human.dto.Human;
import com.human.dto.Cat;
public class MyToString {

	public static void main(String[] args) {
//		Human h1 = new Human("홍길남", 30);
//
//		System.out.println("h1 주소:" + h1);
//		System.out.println("h1 이름:" + h1.name);
//		System.out.println("h1 나이:" + h1.age);

		// 강아지 고양이 toString응 재정의 해서 객체를 찍어보자.

//		// equals
//		// equals비교는 ==이랑 동일하게 동작하도록 되어있다.
//		// 원하는 인스턴스필드 비교형태로 변경하고 싶으면
//		// equals 를 재정의 해야한다.
//		Human h2 = new Human("홍길남", 30);
//		if (h1 == h2) {
//			System.out.println("h1==h2은 true");
//		} else {
//			System.out.println("h1==h2은 false");
//		}
//
//		if (h1.equals(h2)) {
//			System.out.println("h1.equals(h2)은 true");
//		} else {
//			System.out.println("h1.equals(h2)은 false");
//		}

		String str1 = "안녕";//연산자 중복
		String str2 = "안녕";
		String str3 = new String ("안녕");
		String str4 = new String ("안녕");
		
		if(str1== str2) {
			System.out.println("str1==str2은 true");
		}else {
			System.out.println("str1==str2은 false");
		}
		
		if(str1==str3) {
			System.out.println("str1==str3은 true");
		}else {
			System.out.println("str1==str3은 fasle");
		}
		if(str3==str4) {
			System.out.println("str3==str4은 true");
		}else {
			System.out.println("str3==str4은 fasle");
		}
		if(str1.equals(str4)) {
			System.out.println("str1.equals(str4)은 true");
		}else {
			System.out.println("str1.equals(str4)은 false");
			
		}
		
		Cat c1 = new Cat ("나비",3);
		Cat c2 = new Cat ("냥이",4);
		Cat c3 = new Cat ("나비",3);
		Cat c4 = new Cat ("냥이",4);

		if(c1==c3) {
			System.out.println("c1==c3은 true");
		}else {
			System.out.println("c1==c3은 fasle");
		}
		if(c2==c4) {
			System.out.println("c2==c4은 true");
		}else {
			System.out.println("c2==c4은 fasle");
		}
		
		if(c1.equals(c3)) {
			System.out.println("c1==c3은 true");
		}else {
			System.out.println("c1==c3은 fasle");
		}
	}
}
