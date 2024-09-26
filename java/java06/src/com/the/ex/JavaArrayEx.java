package com.the.ex;

import java.util.Arrays;

public class JavaArrayEx {

	public static void main(String[] args) {
		//배열 : 하나의 변수에 여러 개의 데이터 저장
		//배열 : 하나의 배열변수를 통해서 여러 개의 같은 데이터를 인덱스를 이용해서 관리한다.
		
		//배열 선언 방법
		//자료형 변수명[] = new 자료형 [원하는 데이터 생성 개수]
		//int를 10개 arr1 배열 변수에 생성하고 싶다.
		int arr1[] = new int [10];
		
		//Arrays.toString 배열의 내용을 문자영로 만든다.
		System.out.println(Arrays.toString(arr1));

		//배열에 5번 인덱스에 50을 넣고 배열의 내용을 출력해보자
		arr1[5]=50;
		System.out.println(arr1[5]);
		System.out.println(Arrays.toString(arr1));
		
		int [] arr2 = new int[5];
		int [] arr3;
		arr3 = new int[6];
		int [] arr4 = {1,2,3,4};
		int [] arr5 = {0,3,6,9,12};
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		//arr5 = {1,2,3}; // 코드 진행 중에는 추가할 수 없다.
		
		//arr4[3] 일반 int 변수처럼 사용하면 된다.
		
		int  a;
		
		a= arr4[3];
		a= arr4[0] + arr4[2];
		a= a+ arr4[1];
		arr4[0] = a;
		arr4[0] = arr4[1]+arr4[2];
		System.out.println(arr4.length);
		
		

	}

}
