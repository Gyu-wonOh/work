package com.the.ex;
//프로그램이 현실세계의 데이터를 가공해서 사용자에게 보여주는 것
//자동차 정보 출력 프로그램
//프로그램에서 다루는 자동차 개수 정보
//경고: 연식으로 기준으로 2000년 도 이전.
//모델명,년식,가격
//차량고유번호

//
public class MyClass01 {
	////////////////////////////////////
	///////1대
	
	public static int totalCarCount = 1;
	public static int warningYear = 2000;
	//자동차 정보
	public static int carNumber = 1;
	public static String model = "소나타";
	public static int year = 1990;
	public static int price = 3000;
	
	public static int getTotalCarCount() {
		//totalCarCount 변경이 필요할 경우 기술
		return totalCarCount;
	}
	public static String getWarningString() {
		//차량 연식에 따른 경고 여부 확인
		String str="";
		if(warningYear>year) {
			str="경고 상황";
		}else {
			str="없음";
		}
		return str;
	}
	
	public static void displayInfo() {
		System.out.println("===========차량정보=============");
		System.out.println("회사 전체 보유 차량 : " + totalCarCount + "대");
		System.out.println("차량 경고 기준 : " + warningYear+"년");
		System.out.println("차량 등록 번호 :" + carNumber);
		System.out.println("차량 모델 :" + model);
		System.out.println("차량 연식 :" + year);
		System.out.println("차량 가격 :" + price);
		System.out.println("경고 유무 : " +getWarningString());
	}
	
	////////////////////////////////////
	///////2대
	
	public static int totalCarCount2 = 2;
	public static int warningYear2 = 2000;
	//자동차 정보
	public static int carNumber2 = 2;
	public static String model2 = "아반떼";
	public static int year2 = 2002;
	public static int price2 = 3000;
	
	public static int getTotalCarCount2() {
	//totalCarCount 변경이 필요할 경우 기술
		return totalCarCount;
	}
	public static String getWarningString2() {
	//차량 연식에 따른 경고 여부 확인
		String str2="";
		if(warningYear2>year2) {
		str2="경고 상황";
		}else {
		str2="없음";
		}
		return str2;
		}
	
	public static void displayInfo2() {
		System.out.println("===========차량정보=============");
		System.out.println("회사 전체 보유 차량 : " + totalCarCount2 + "대");
		System.out.println("차량 경고 기준 : " + warningYear2+"년");
		System.out.println("차량 등록 번호 :" + carNumber2);
		System.out.println("차량 모델 :" + model2);
		System.out.println("차량 연식 :" + year2);
		System.out.println("차량 가격 :" + price2);
		System.out.println("경고 유무 : " +getWarningString2());
		}

	////////////////////////////////////
	///////3대
	
	public static int totalCarCount3 = 3;
	public static int warningYear3 = 2000;
	//자동차 정보
	public static int carNumber3 = 2;
	public static String model3 = "아반떼";
	public static int year3 = 2010;
	public static int price3 = 3000;
	
	public static int getTotalCarCount3() {
	//totalCarCount 변경이 필요할 경우 기술
		return totalCarCount3;
	}
	public static String getWarningString3() {
	//차량 연식에 따른 경고 여부 확인
		String str3="";
		if(warningYear3>year3) {
		str3="경고 상황";
		}else {
		str3="없음";
		}
		return str3;
		}
	
	public static void displayInfo3() {
		System.out.println("===========차량정보=============");
		System.out.println("회사 전체 보유 차량 : " + totalCarCount3 + "대");
		System.out.println("차량 경고 기준 : " + warningYear3+"년");
		System.out.println("차량 등록 번호 :" + carNumber3);
		System.out.println("차량 모델 :" + model3);
		System.out.println("차량 연식 :" + year3);
		System.out.println("차량 가격 :" + price3);
		System.out.println("경고 유무 : " +getWarningString3());
		}

	public static void main(String[] args) {
		System.out.println("자동차 프로그램");
		//1.자동차 관련 정보를 입력 받아 화면에 출력
		
		displayInfo();
		displayInfo2();
		displayInfo3();
		
		
	}

}
