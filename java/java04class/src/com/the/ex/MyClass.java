package com.the.ex;

public class MyClass {

	public static void main(String[] args) {
		// 사람정보를 저장해보자.
		// 이름 나이 키
		String name = "홍길동";
		int age = 10;
		double height = 155.4;
		
		
		System.out.println(String.format("이름:%s 나이:%d 키:%5.1f", name, age, height));
		//고양이 한마리와 강아지 한마리에 정보를 입력받아
		// 출력하는 프로그램을 구현해보자.
		// 털색상, 주인이름 , 본인이름, 나이 이다.
		
		// 고양이
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("고양이 정보를 입력하세요 예)이름/나이/털색상/주인이름");
		String catName = sc.nextLine();
		int catAge = Integer.parseInt(sc.nextLine());
		String furColor = sc.nextLine();
		String ownerName = sc.nextLine();
		System.out.println(String.format("털색상 : %s 주인이름 : %s 본인이름 : %s 나이 : %d", furColor, ownerName, catName, catAge));
		System.out.println("______________________________________________________________________");

		//강아지
//		System.out.println("강아지 정보를 입력하세요 예)이름/나이/털색상/주인이름");
//		String dogName = sc.nextLine();
//		age = Integer.parseInt(sc.nextLine());
//		String dogFurColor = sc.nextLine();
//		String dogOwnerName = sc.nextLine();
//		System.out.println(String.format("털색상 : %s 주인이름 : %s 본인이름 : %s 나이 : %d", dogFurColor, dogOwnerName, dogName, age));
		System.out.println("강아지 정보를 입력하세요 예)이름/나이/털색상/주인이름");
		com.the.dto.Dog dogName = new com.the.dto.Dog();
		com.the.dto.Dog dogAge = new com.the.dto.Dog();
		com.the.dto.Dog dogFurColor = new com.the.dto.Dog();
		com.the.dto.Dog dogOwnerName = new com.the.dto.Dog();
		
		System.out.println(String.format("털색상 : %s 주인이름 : %s 본인이름 : %s 나이 : %d", dogFurColor.dogFurColor, dogOwnerName.dogOwnerName, dogName.dogName, dogAge.age));
	
	}

}
