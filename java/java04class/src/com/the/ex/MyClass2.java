package com.the.ex;
import com.the.dto.Human;
import com.the.dto.*;
//클래스 정의 
/*class Human{
	public String name = "홍길동1";
	public int age = 10;
	public double height = 152.4;
}*/
public class MyClass2 {

	public static void main(String[] args) {

		// 휴먼클래스를 사용하려면 선언해서 사용한다.
		
		Human h1 = new Human();
		
		//h1을 통해서 3개의 값을 접근할 수 없다.
		// . 연산자를 이용해서 필드에 접급한다. 
		//필드란 클래스안에서 선언된 변수를 의미한다.
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.height);
		
		h1.name = "홍길동 2";
		h1.age =23;
		h1.height =156.2;
		
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.height);

		com.the.ex.Human humanEx = new com.the.ex.Human();
		com.the.dto.Human humanDto = new com.the.dto.Human();
		
		System.out.println(humanEx.name);
		System.out.println(humanDto.name);
		
		Human humanDto2 = new Human();
		System.out.println(humanDto2.name);
	}

}
