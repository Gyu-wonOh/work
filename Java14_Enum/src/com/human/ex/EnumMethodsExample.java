package com.human.ex;

public class EnumMethodsExample {

	public static void main(String[] args) {

		Gender [] genders = Gender.values();//Enum의 상수 배열을 가져옴
		for(Gender gender:genders) {
		System.out.println(gender);	
		}
		String genderStr ="MALE";
		Gender parsedGender = Gender.valueOf(genderStr);//문자열을 Enum으로 변환
		System.out.println("Parsed gender: " +parsedGender);
	}

}
