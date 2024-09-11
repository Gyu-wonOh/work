package com.the.ex;
//복사 붙여넣는 부분을 클래스로 만들어 놓고 필요할 때 가져다 쓰자.
//class Car{
//	//필드 값을 저장하는 공간
//	//클래스 필드 인스턴스들을 대표하는 값 클래스를 대표하는 값
//	public static int totalCarCount = 1;
//	public static int warningYear = 2000;
//	
//	//인스턴스 필드 인스턴스마다 따로 저장되는 값
//	//자동차 정보
//	public int carNumber = 1;
//	public String model = "소나타";
//	public int year = 1990;
//	public int price = 3000;
//	
//	//메소드: 복잡한 코드를 묶어놓고 필요할 때 호출해서 사용하는 코드묶음
//	//클래스 메소드: 클래스 필드들을 조작할 때 사용
//	//인스턴스 메소드: 인스턴스 필드들을 조작할 때 사용한다.
//	public static int getTotalCarCount() {
//		//totalCarCount 변경이 필요할 경우 기술
//		return totalCarCount;
//	}
//	public String getWarningString() {
//		//차량 연식에 따른 경고 여부 확인
//		String str="";
//		if(warningYear>year) {
//			str="경고 상황";
//		}else {
//			str="없음";
//		}
//		return str;
//	}
//	
//	public void displayInfo() {
//		System.out.println("===========차량정보=============");
//		System.out.println("회사 전체 보유 차량 : " + Car.totalCarCount + "대");
//		System.out.println("차량 경고 기준 : " + warningYear+"년");
//		System.out.println("차량 등록 번호 :" + carNumber);
//		System.out.println("차량 모델 :" + model);
//		System.out.println("차량 연식 :" + year);
//		System.out.println("차량 가격 :" + price);
//		System.out.println("경고 유무 : " +getWarningString());
//	}
//	
//}
	

public class MyClass02 {

	public static void main(String[] args) {
		System.out.println("자동차 프로그램");
		Car a=new Car();
		a.carNumber = 1;
		a.model="소나타";
		a.year =1990;
		a.price=4000;
		
		
		Car b = new Car();
		b.carNumber = 2;
		b.model="경차";
		b.year =2000;
		b.price=3000;
		
		Car.totalCarCount=2;
		Car.warningYear=1990;
		a.displayInfo();
		b.displayInfo();
		
		System.out.println(Car.getTotalCarCount());
		
		//1.필드
		//2.메소드
		//3.생성자 필드를 초기화하는데 사용 클래스 필드는 정적 블럭에서 초기화
		//인스턴스 필드는 
	}

}
