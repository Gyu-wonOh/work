package com.the.ex;

public class HumanTest {

	public static void main(String[] args) {

	Human h1 = new Human();
	h1.name = "홍길동";
	h1.age = 25;
	h1.height = 166.5;
	System.out.println("name : " +h1.name);
	System.out.println("age : " + h1.age);
	System.out.println("height : " + h1.height);
	
	Human h2 =h1;
	h2.name ="홍길남";
	h2.height =164.5;
	System.out.println("h1.name : "+ h1.name);
	System.out.println("h1.age : "+ h1.age);
	System.out.println("h1.height : "+ h1.height);
	System.out.println("h2.name : "+ h2.name);
	System.out.println("h2.age : "+ h2.age);
	System.out.println("h2.height : "+ h2.height);
	
	}

}
