package com.the.ex;

import java.util.ArrayList;

class Pet{
	public void eat(){
		System.out.println("Pet이 밥을 먹습니다.");
	}
	public void move() {
		System.out.println("Pet이 움직입니다.");
	}
}
class Cat extends Pet{
	@Override
	public void eat() {
		System.out.println("고양이가 생선을 먹습니다.");
	}
	public void work() {
		System.out.println("고양이가 쥐를 잡는다.");
	}
}
class Dog extends Pet{
	@Override
	public void eat() {
		System.out.println("강아지가 뼈다귀를 먹습니다.");
	}
	public void hunting() {
		System.out.println("Dog가 꿩을 사냥합니다.");
	}
}
public class MyOverride2 {

	public static void main(String[] args) {
		System.out.println("Pet클래스 사용");
		Pet p = new Pet();
		p.eat();
		p.move();
		System.out.println("Cat클래스 사용");
		Cat c= new Cat();
		c.eat();
		c.move();
		c.work();
		System.out.println("=======dog 클래스 사용=======");
		Dog d =new Dog();
		d.eat();
		d.move();
		d.hunting();
		
		//다형성
		//다양한 형태로 사용함.
		//하나의 클래스 변수에 여러 종류의 클래스를 담을 수 있다.
		
		//부모의 클래스에 자식의 클래스를 넣을 수 있다.
		Pet p1= new Pet();
		Pet p2= new Dog();
		Pet p3= new Cat();
		//자식의 클래스에 부모의 클래스를 넣는 것은 불가하다.
		Dog d1= new Dog();
//		Dog d2= new Pet();
		Cat c1= new Cat();
//		Cat c2= new Pet();
//		Dog d3= new Cat();
//		Cat c3= new Dog();
		
		//pet 2마리
		//Cat 3마리
		//Dog 2마리 관리하는 프로그램 구현
		
		//다형성이 없으면
		ArrayList<Pet> pArrs =new ArrayList<Pet>();
		pArrs.add(new Pet());
		pArrs.add(new Pet());

		ArrayList<Cat> cArrs =new ArrayList<Cat>();
		pArrs.add(new Cat());
		pArrs.add(new Cat());
		pArrs.add(new Cat());

		ArrayList<Dog> dArrs =new ArrayList<Dog>();
		pArrs.add(new Dog());
		pArrs.add(new Dog());

		//다형성을 이용해서 상속받은 모든 클래스를 넣을 수 있다.
		ArrayList<Pet> pArrs2 =new ArrayList<Pet>();
		pArrs2.add(new Pet());
		pArrs2.add(new Pet());
		pArrs2.add(new Cat());
		pArrs2.add(new Cat());
		pArrs2.add(new Cat());
		pArrs2.add(new Dog());
		pArrs2.add(new Dog());
		
		System.out.println("======================");
		p1.eat();
		p1.move();
		System.out.println("======================");
		p2.eat();//다형성에서 재정의된 메소드는 자식의 메소드가 실행된다.
		p2.move();//지식에 재정의되어 있지 않으면 부모의 메소드가 실행
//		p2.hunting();//다형성에서 자식이 들어오면 부모를 통해서는 접근할 수 없다.
		
		//부모에 자식이 들어가면
		//1. 부모클래스에만 있는 메소드는 부모의 메소드가 실행된다.
		//2. 부모클래스와 자식클래스에 있는 메소드는 자식클래스의 메소드가 실행된다.
		//3. 자식클래스에만 있는 메소드는 접근할 수 있는 방법이 없다.
		System.out.println("======================");
		((Dog)p2).hunting();
		p3.eat();
		p3.move();
//		p3.work();
		System.out.println("======================");
		d1.eat(); d1.move(); d1.hunting();
		c1.eat(); c1.move(); c1.work();
	
		//pArr2는 Pet,Cat,Dog 재정의를 통해서 객체가 다르면 다른 메소드를 실행할 수 있게 해준다.
		System.out.println("======================");
		for(int i=0; i<pArrs2.size();i++) {
			pArrs2.get(i).eat();
		}
	}

}
