package com.the.ex;

class Human {
	//인스턴스 필드
	public int age = 10;
	public String name = "홍길동";
	
//	public Human() {
//		
//	}
//	public Human(String name) {
//		this(name,20);
//	}
//	public Human(String name, int age) {
//		this.name =name;
//		this.age =age;
//	}
	//매개변수가 없는 생성자는 디폴트 생성자
	//기본 생성자는 정의하지 않으면 컴파일러가 기본적으로 만들어 준다.
	// 인스턴스 필드를 초기화하는데 사용
	//생성자는 매개변수가 다르면 여러개 생성할 수 있다.
	//개발자가 생성자를 건드리면 컴파일러가 기본생성자를 만들어주지 않는다.
	//필요하면 기본 생성자를 직접 만들어 넣어야한다.
	//this는 자기자신의 주소를 의미한다.
	//this(매개변수) 다른 생성자 호출
	//this는 생략할 수 있다. 해당지역의 매개변수(지역변수)로 변수명이 인스턴스 필드명이랑
	//동일하면 생략할 수 없고 생략하면 지역변수를 가리킨다.
	public Human() {//생성자 만드는 방법 public 클래스 이름 (매개 변수)
		System.out.println("기본생성자");
		System.out.println(this.name);
		System.out.println(name);
	}
	public Human(String name) {
		this. name = name;
		this. age =20;
		System.out.println("Human(String name)생성자");//실무에서는 사용 x 확인용으로 사용한 부분임
		System.out.println("name:"+name+"age:"+age);//실무에서는 사용 x 확인용으로 사용한 부분임
		//this 자기주소에 접근
	
	}
	public Human (String name , int age) {
		
		System.out.println("Heuman(String name, int age) 생성자");
		System.out.println("name:"+ name + "age:"+ age);
		this.name =name;
		this.age = age;
		//this 자기자신의 주소에 접근
	}
//	public Human(int age, String name) {
//		super();
//		this.age = age;
//		this.name = name;
//	}
}
public class MyClass {

	public static void main(String[] args) {

		//클래스
		//1.관련 있는 데이터를 묶는다.
		int age1=10;
		String name1="홍길동1";//20개
		
		int age2=11;
		String name2 = "홍길동2";

		Human h1 = new Human();
		Human h2 = new Human();
		h1.age = 10;
		h1.name = "홍길동";
		
		h2.age = 10;
		h2.name = "홍길동";
		
		System.out.println("h1주소:"+h1);
		System.out.println("h1이름:"+h1.name);
		System.out.println("h1나이:"+h1.age);

		System.out.println("h2주소:"+h2);
		System.out.println("h2이름:"+h2.name);
		System.out.println("h2나이:"+h2.age);
//		1.생성자, 2.toString, 3.equals 4.getter, setter

		//1.생성자 : 원하는 값으로 인스터스를 초기화 할때 사용
//		Human h1 =new Human("홍길동1",11);
//		Human h2 =new Human("홍길동2",12);
		Human h3 =new Human("홍길동9",9);
		Human h4 =new Human("홍길동10",10);

		System.out.println("h3주소:"+h3);
		System.out.println("h3이름:"+h3.name);
		System.out.println("h3나이:"+h3.age);
		System.out.println("h4주소:"+h4);
		System.out.println("h4이름:"+h4.name);
		System.out.println("h4나이:"+h4.age);
		
		Human h5 = new Human("홍길동h5");
		
		//강아지 고양이 생ㅈ
	}

}
