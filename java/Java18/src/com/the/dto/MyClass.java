package com.the.dto;

public class MyClass {
	public static int a = 10; //클래스 필드 클래스의 인스턴스를 대표하는 하나의 값 ex) 카드 높이,넓이,카드제조사
	public int b = 20; //인스턴스 필드 인스턴스마다 값을 가지는 경우 사용 ex) 카드 모양 카드넘버
	
	public static void aCount() { //클래스 메소드 클래스 필드 조작  인스턴스 필드, 메소드 조작 불가능
		MyClass.a++;
		System.out.println(MyClass.a);
		//bCount(); 호출 안됨 this.b접근 안됨
	}

	public void bCount() {  //인스턴스 메소드 인스턴스 필드 조작 클래스필드 ,메소드 접근 가능하다.
		this. b++;
		System.out.println(this.b);
	}
}
//클래스 내부에 선언 하는 것들
//클래스필드     클래스를 대표하는 하나의 데이터
//인스턴스필드    인스턴스화 했을 때 힙에 생성되는 데이터(new)
//클래스메소드    클래스 필드 조작
//인스턴스메소드  인스턴스필드 조작
//생성자        인스턴스필드 초기화 
//정적필드      클래스필드 초기화