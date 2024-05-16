package com.the.ex;

class Cat{
	String name = "나비";
	int age = 3;
	public Cat (String name, int age) {
	this.name = name;
	this.age = age;
	System.out.println("고양이 이름:" + name + " 고양이 나이:" + age);
	}
}

class Dog{
	String name ="";
	int age = 0;
	
	public Dog (String name,int age) {
		this.age =age;
		this.name = name;
		System.out.println("개 이름: "+ name +" 개 나이:" +age);
	}
}
public class CatDog {
	public static void main (String[] args) {
		Cat c1 =new Cat("나비", 3);
		Dog d1 =new Dog("바둑이", 3);
		
		System.out.println("c1주소:"+c1);
		System.out.println("c1이름:"+c1.name);
		System.out.println("c1나이:"+c1.age);
		System.out.println("d1주소:"+d1);
		System.out.println("d1이름:"+d1.name);
		System.out.println("d1나이:"+d1.age);
	}
}
