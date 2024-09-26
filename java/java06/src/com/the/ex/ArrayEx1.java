package com.the.ex;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {

		//일반변수와 배열에 3명의 나이를 저장해서 출력해보자.
		//1. 일반변수 선언
		int humanAge1=10; 
		int humanAge2=12; 
		int humanAge3=15;
//		int humanAgeArr[] = new int[3];
//		humanAgeArr[0] = 10;
//		humanAgeArr[1] = 12;
//		humanAgeArr[2] = 15;
		int humanAgeArr[] = {10,12,15};// 상위 주석 4개와 같은 의미이다.
		// human1의 나이를 입력해보자.
		System.out.println(humanAge1);
		System.out.println(humanAgeArr[0]);//배열에서 읽어오기
		//human2의 나이를 8로 변경해보자.
		humanAge2=8;
		humanAgeArr[1] =8;//배열의 값 변경하기
		//human3의 기존나이에 3을 더해보자.
		humanAge3 = humanAge3+3;
		humanAgeArr[2] = humanAgeArr[2]+3;
		//human 정보 출력하기
		System.out.println(humanAge1 + ":" + humanAge2 + ":" + humanAge3);
		System.out.println(humanAgeArr[0] + ":" + humanAgeArr[1] + ":" + humanAgeArr[2]);
		System.out.println(humanAgeArr); //배열의 주소가 출력
		System.out.println(Arrays.toString(humanAgeArr));//배열의 내용 출력
		System.out.println("---------------1번 끝----------------");
		System.out.println();
		
		//2.배열 선언과 동시에 값 할당
		
		int[]numbers1 = {10,20,30,40,50};// 배열선언과 동시에 값 할당
		int[]numbers2 = new int [] {10,20,30,40,50};//new 연산자와 함께 배열
		
		//배열 선언 후 값 할당
		// 타입[] 배열이름 = new 타입[배열크기];
		int[]numbers =new int [5]; // 5개의 int형 요소를 저장하는 배열선언
		//5개의 공간에 값 할당
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		int size = numbers.length;//5 배열의 사이즈를 알고 싶을 때 기술한다.
		System.out.println(numbers.length);//배열의 크기
		System.out.println(numbers);//배열의 주소
		System.out.println(Arrays.toString(numbers));//배열의 내용 출력
		System.out.println("---------------2번 끝----------------");
		System.out.println();
		
		//3번
		int[]numbers3 = {1,2,3,4,5};
		//배열 요소 접근
		int num1 = numbers3[0]; //1
		int num2 =numbers3[2]; //3
		System.out.println(num1 + num2);
		//배열 요소 변경
		numbers3[1] = 10; // {1,10,3,4,5}
		System.out.println(Arrays.toString(numbers3));
		numbers3[3] = 8; // {1,10,3,8,5}
		System.out.println(Arrays.toString(numbers3));
		numbers3[0] = num1 +numbers3[4]; // {6,10,3,8,5}
		System.out.println(Arrays.toString(numbers3));
		System.out.println("---------------3번 끝----------------");
		System.out.println();
		
		//a에는 1,2,3,5
		//b에는 6,7,8
		// 2개의 배열 생성
		// 3의 배수 0으로 변경 
		//b의 배열의 내용은 하나씩 증가 시켜보자
		//1. 배열 a,b 생성
		int a[] = {1,2,3,5};
		int b[] = {6,7,8};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		//2. 3의 배수 0으로 변경 b의 배열의 내용은 하나씩 증가 시켜보자
		a [2] = 0;
		b [0] = 0;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		//3. b의 배열의 내용은 하나씩 증가 시켜보자
//		b [0] = b[0] + 1;
		b[0]++;
		b [1] = b[1] + 1;
		b [2] = b[2] + 1;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//int 4 개 저장하는 배열 a2 선언
		int a2[] =new int[4];
		int b2 =1;
		//a라는 배열에 5,2,3 대입
		a2[0] = 5;
		a2[1] = 2;
		a2[2] = 3;
		System.out.println(Arrays.toString(a2));
		// a 배열 인덱스 1번의 값을 b2만큼 증가시킨다.
		a2[1] = a2[1] + b2; //2+1=3 {5,3,3,?}
		System.out.println(Arrays.toString(a2));
		//a배열의 인덱스 0과 인덱스 1를 더해서 인덱스 2에 넣은 다음 
		a2[2]=a2[0]+a2[1]; //5+3 =8 {5,3,8,?}
		System.out.println(Arrays.toString(a2));
		// a배열의 인덱스 0,1,2를 더한 값을 a[3]에 넣은 다음
		a2[3]=a2[0]+a2[1]+a2[2]; //5+3+8=16 {8,3,3,16}
		System.out.println(Arrays.toString(a2));
		//a 배열의 모든 값의 합을 변수 sum에 넣은 다음
		double sum=a2[0]+a2[1]+a2[2]+a2[3]; //32
		System.out.println(sum);
		sum = sum/5;//5
		System.out.println(sum);
		
		
		
	}

}
