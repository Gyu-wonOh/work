package com.the.ex;

import java.util.Scanner;

public class Repetitive {

	public static void main(String[] args) {

		// 3종류
		// while, do~while ,for
//		int a = 0;//초기식
//		while(a<10) {//조건식
//			System.out.println("안녕하세요");
//			a++;//증감식
//		}
//		
//		for(a=0;a<3;a++) {
//			System.out.println("안녕하세요");
//		}
//		a = 0; //초기식
//		do {
//			System.out.println("안녕하세요");
//			a++;//증감식
//		}while(a<10);//조건식
		// 0부터 순서대로 3개의 숫자를 출력해보자
//		int count = 0;
//		System.out.println(count);
//		count++;
//		System.out.println(count);
//		count++;
//		System.out.println(count);
//		count++;
		// while로 구현해보자
//		int count = 0 ;
//		while(count<3) {
//			System.out.println(count);
//			count++;
//		}
//		for(int count =0;count<3;count++) {
//			System.out.println(count);
//		}

//		int count = 0;
//		do {
//			System.out.println(count);
//			count++;
//		}while(count<3);
//		

		// for문
		// 1.//123456789
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		// 2.56789
		for (int i = 5; i < 10; i++) {
			System.out.println(i);
		}
		// 3.56789
		for (int i = 5; i < 10; i++) {
			System.out.println(i);
		}
		// 4. 579
		for (int i = 5; i < 10; i = i + 2) {
			System.out.println(i);
		}
		// 5. 579
		for (int i = 5; i < 10; i = i + 2) {
			System.out.println(i);
		}
		// 6. 579
		for (int i = 5; i < 10; i = i + 2) {
			System.out.println(i);
		}
		// 7. 1 3 6 10 15 21 28 36 45
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		// 8. 5 12 21
		sum = 0;
		for (int i = 5; i < 10; i = i + 2) {
			sum = sum + i;
			System.out.println(sum);
		}
		// do~while문
		// 1.
		int i = 0;
		sum = 0;
		do {
			sum = sum + i;
			System.out.println(sum);
			i++;
		} while (i <= 10);

		// for문
		// 1. 1부터 10까지 합 구하는 예제
		sum = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합: " + sum);
		// 2.구구단 2단을 출력하는 예제
		for (i = 1; i < 10; i++) {
			System.out.println("2X" + i + " = " + (2 * i));
		}
		// 3. 1부터 100까지 홀수들의 합 구하는 문제
		sum = 0;
		for (i = 1; i <= 100; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("1~100까지 홀수들의 합은 " + sum + "이다.");
		// 4.1부터 100까지의 숫자 중 3의 배수만 출력하는 예제
//		for(i=3; i<=100;i=i+3) {
//			System.out.println(i);
//		}
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		// 5. 배열의 요소들 중에서 3의 배수만 출력하는 예제
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(i=0;i< arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.println(arr[i]);
			}
		}
		//6.1부터 50까지의 숫자 중 5의 배수이면서 3의 배수인 숫자들의 합을 구하는 예제
		//15 30 45
		sum = 0;
		for(i = 1; i<=50;i++) {
			if(i%5==0&&i%3==0) {
				sum= sum + i;
			}
		}
		System.out.println("1부터 50까지의 숫자 중 5의 배수이면서 3의 배수인 숫자들의 함: "+ sum);
		//7.1부터 100까지의 숫자 중 3과 5의 공배수인 숫자들의 합을 구하는 예제
		sum = 0;
		for(i = 1; i<=100;i++) {
			if(i%5==0&&i%3==0) {
				sum= sum + i;
			}
		}
		System.out.println("1부터 10까지의 숫자 중 3과 5의 공배수인 숫자들의 함: "+ sum);
		
		
		//1~10까지 출력 , 출력한 수의 총합 출력
		sum = 0;
		for(i =1; i<=10; i++) {
			sum = sum + i;
		} System.out.println(sum);
		//4~20까지 출력 , 출력한 순의 총합 출력
		sum=0;
		for(i =4; i<=20; i++) {
			sum = sum + i;
		} System.out.println(sum);
		//5~29까지 출력 , 출력한 순의 총합 출력
		sum=0;
		for(i =5; i<=29; i++) {
			sum = sum + i;
		} System.out.println(sum);
		//4~15까지 수중 4부터 3씩 증가한 수 출력
		sum=0;
		for(i =4; i<=15; i= i +3) {
			System.out.println(i);
		} 
		//“안녕하세요”를 10번 찍어 보자. 
		for(i = 1 ; i<=10; i++) {
			System.out.println("안녕하세요"+i);
		}
		//0~9까지 찍어보자. 
		for(i = 0 ; i<10; i++) {
			System.out.println(i);
		}
		//3~10까지찍어 보자. 
		for(i = 3 ; i<=10; i++) {
			System.out.println(i);
		}
		//1~10의 합을 구해보자. 
		sum=0;
		for(i = 1 ; i<=10; i++) {
			sum = sum+i;
		}System.out.println(sum);
		//i=i+5 변환식을 사용해서 10~100사이의 i값을 출력해 보자.
		for(i=10; i<=100; i=i+5) {
			System.out.println(i);
		}
		int a=10;
		i=(a<20)?5+4:3+9;
		//조건문
		//1번 절차문
		System.out.println(01);
		System.out.println(02);
		System.out.println(03);
		//2번 조건문에서 01,02,04가 출력 되도록 a값을 설정하여 코드를 만들어 보자.
		System.out.println(01);
		a=2;
		if(a==2) {
			System.out.println(02);
		}else {
			System.out.println(03);
		}
		System.out.println(04);
		//3번 조건문에서 01,03,04가 출력 되도록 a값을 설정하여 코드를 만들어 보자.
		a=3;
		System.out.println(01);
		if (a==2) {
			System.out.println(02);
		}else{
			System.out.println(03);
		}
		System.out.println(04);
		//4. 3번 반복문에서 01,03이 출력 되도록 a값을 설정하여 코드를 만들어 보자.
		System.out.println(01);
		for(i=2; i<2;i++) {
			System.out.println(02);
		}System.out.println(03);
		//5. 3번 반복문에서 01,02,03이 출력 되도록 a값을  설정하여 코드를 만들어 보자.
		System.out.println(01);
		for(i=0; i<1 ; i++) {
			System.out.println(02);
		}System.out.println(03);
		
		//6. 3번 반복문에서 01,02,02,02,03이 출력 되도록 a값을  설정하여 코드를 만들어 보자.
		System.out.println(01);
		for(i=0 ; i<3; i++) {
			System.out.println(02);
		}System.out.println(03);
		//7번
		System.out.println("01");
		a=0;
		while(a<=0) {
			System.out.println("02");
			a++;
		}
		System.out.println("03");
		System.out.println("04");
		for(i=0;i<=0;i++) {
			System.out.println("11");
		}
		System.out.println("05");
		if(a==0) {
			System.out.println("06");
		}else {
			System.out.println("07");
			System.out.println("08");
		}
		System.out.println("09");
		System.out.println("10");
		//9번
		//10번 3을 10번 더하는 코드를 3가지로 만들어 보자. 
		//while문
		int num =0 ;
		sum = 0;
		while(num<10) {
			sum=sum+3;
			System.out.println(sum);
			num++;
		}
		//do~while문
		num=0;
		sum=0;
		do {
			sum = sum+3;
			System.out.println(sum);
			num++;
		}while(num<10);
		//for 문
		num = 0;
		sum = 0;
		for(num =0; num<10; num++) {
			sum+=3;
			System.out.println(sum);
		}
		//11번 3부터 10을 출력하는 코드를 3가지로 만들어 보자.
		//while문
		num = 3;
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		//do~while문
		num= 3;
		do { 
			System.out.println(num);
			num++;
		}while(num<=10);
		//for문
		for(int k =3; k<11; k++) {
			System.out.println(k);
		}
		//12번 15~30까지의  사이 숫자를 
		//더한 총합을 sum에 넣어 출력하는 코드를 3가지로 만들어 보자.
		//while문
		sum=0;
		num=15;
		while(num<=30) {
			sum=sum+num;
			num++;
		}System.out.println(sum);
		//do while 문
		sum = 0;
		num = 15;
		do {
			sum = sum+num;
			num++;
		}while(num<=30);
		//for문
		sum=0;
		for(num=15; num<=30; num++) {
			sum= sum+num;
		}System.out.println(sum);
		//13번 사용자에게 1부터 9 사이의 숫자를 받아서 => scanner 1~9
		//사용자가 입력한 숫자에 맞는 해당 구구단을 출력해 보자.
		//예를 들어 사용자가 4를 입력하면 4단을 출력하면 된다. 
		System.out.println("실행하려는 구구단을 입력하세요(1~9)");
		Scanner scanner3 = new Scanner(System.in);
		int n = Integer.parseInt(scanner3.nextLine());
		for( num = 1; num < 10; num++ ) {
			System.out.println(n+"*"+num+"="+(n*num));

		}
	}

}
