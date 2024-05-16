package com.human.dto;

import java.util.Objects;

public class Human {
	// 클래스필드
	// public static int count = 0;
	// 인스턴스 필드
	private String name = "홍길동1";
	private int age = 0;

	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name ;
	}
	
	
	
	
//	// 생성자
//	public Human() {
//	};// 기본 생성자
//
//	public Human(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//
	// toString 호출되면 return 뒤에 오는 문자열을 생성한다.
	// 객체 찍으묜 toString 메소드에서 생성된 리턴된 문자열이 출력된다.
//	public String toString() {
//		return "해당 인스턴스는 name은" + this.name + "age는" + this.age + "이다.";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Human other = (Human) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}
//	
//	
//	// Override Overload
//	// override 부모에 있는 메소드를 내가 재정의
//	// overload 매개변수가 다르면 같은이름으로 메소드 생성이 가능
		
	//클래스는 3개로 나뉜다. 필드 생성자,메소드
	//5개로 나뉘면 다음과 같다.
	//클래스 필드    필드 클래스의 인스턴스를 대표하는 값
	//인스턴스 필드   인스턴스마다 다른 값을 저장
	//생성자        인스턴스 필드를 초기화 하는데 사용
	//정적블럭       클래스 필드를 초기화
	//클래스메소드    클래스 필드를 조작
	//인스턴스 메소드 인스턴스 필드를 조작
		
	
}
