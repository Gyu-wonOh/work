package com.the.ex;
class Animal extends Object{
	public String name="";
	public Animal() {
		this("무명");
	};
	
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	public Animal(String name) {
		this.name =name;
	}
	void sound() {
		System.out.println(this.name+"의 동물 소리");
	}
}

class Bird extends Animal{
	public String breed;//품종
	
	public Bird() {
		this("없는 품종");
	};
	public Bird(String breed) {
		super();//부모의 기본 생성자 호출
		this.breed =breed;
	}
	
	public Bird(String name, String breed) {
		super();//부모의 기본 생성자 호출
		this.name=name;
		this.breed =breed;
	}
	
	@Override
	void sound(){
//		System.out.println(super.name +"의 동물의 소리");
		System.out.println(this.breed+"품종");
		//human       지역 변수 찾기 + 자기자신의 필드 (this. )+ 부모의 필드 (super. )
		//this.human  자기 자신의 필드 (this. )+ 부모의 필드 (super.)
		//super.human 부모의 필드 (super. )
	}
}
public class MySupper {

	public static void main(String[] args) {
		//supper, this
		//supper 부모클래스에 있는 것들을 접근할 때 사용
		//this 자기 자신의 클래스에 있는 것들을 접근할 때 사용
		//여기서 있는 것들이란 필드, 메소드, 생성자... 등등을 의미한다.
		
		//this(..) 자기자신의 생성자를 다시 호출할 때
		//this.a 자기자신의 필드에 접근할 때
		//this.a() 자기자신의 메소드에 접근할 때

		//super(..)매개변수가 같은 부모의 생성자호출
		//super.a 부모의 필드에 접근
		//super.a() 부모의 메소드에 접근할 때

		Animal a =new Animal("토끼");
		a.sound();
		Animal b= new Animal();
		b.sound();
		System.out.println(a);
		System.out.println(b);
		
		Bird bird = new Bird();
		bird.sound();
		
		Bird bird2 = new Bird("새", "참새");
		bird2.sound();
	}

}
