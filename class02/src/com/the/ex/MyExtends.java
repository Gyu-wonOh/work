package com.the.ex;

class Parent{
	public void print() {
		System.out.println("parent");
	}
}
class Child extends Parent{
	public void study() {
		System.out.println("child study");
	}
}
class Child2{
	public void print() {
		System.out.println("parent");
	}
	public void study() {
		System.out.println("child study");
	}
}
public class MyExtends {

	public static void main(String[] args) {
		//상속:부모 클래스에 있는 모든 코드들을 자식 클래스가 사용하고 싶을 때 사용한다.
		Parent p = new Parent();
		p.print();
		Child c= new Child();
		c.print();
		c.study();
		Child2 c2= new Child2();
		c2.print();
		c2.study();
	}

}
