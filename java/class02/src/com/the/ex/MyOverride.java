package com.the.ex;

//class Pet{
//	public void eat(){
//		System.out.println("Pet이 밥을 먹습니다.");
//	}
//	public void move() {
//		System.out.println("Pet이 움직입니다.");
//	}
//}
//class Cat extends Pet{
//	@Override
//	public void eat() {
//		System.out.println("고양이가 생선을 먹습니다.");
//	}
//	public void work() {
//		System.out.println("고양이가 쥐를 잡는다.");
//	}
//}
//class Dog extends Pet{
//	@Override
//	public void eat() {
//		System.out.println("강아지가 뼈다귀를 먹습니다.");
//	}
//	@Override
//	public void move() {
//		System.out.println("강아지가 움직입니다.");
//	}
//	public void hunting() {
//		System.out.println("Dog가 꿩을 사냥합니다.");
//	}
//}
public class MyOverride {

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
		
//		//pet 2마리
//		//Cat 3마리
//		//Dog 2마리 관리하는 프로그램 구현
//		
//		//다형성이 없으면
//		ArrayList<Pet> pArrs =new
	}

}
