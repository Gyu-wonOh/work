package com.the.ex;

import java.util.Arrays;
import com.the.dto.*;
public class ArrayEx2 {

	public static void main(String[] args) {

//		int a [] = new int[3];
//		a[0] = 5;
//		a[1] = 1;
//		a[2] = 3;
//		System.out.println(Arrays.toString(a));//{5,1,3}
//		int b[] = new int[4];
//		b[0] = 2;
//		b[1] = 4;
//		b[2] = 6;
//		b[3] = 3;
//		System.out.println(Arrays.toString(b));//{2,4,6,3}
//		System.out.println(a[0]); //5
//		System.out.println(b[2]); //6
//		a[1] = 8; //{5,8,3}
//		b[0] = 1;//{1,4,6,3}
//		b[3] = a[1]+b[0];// 8+1=9 {1,4,6,9}
//		System.out.println(a[1]);//8
//		System.out.println(b[0]);//1
//		System.out.println(b[3]);//9
//		
//		int[]arr1 =new int [3];
//		arr1[0] = 1;
//		arr1[1] = 5;
//		arr1[2] = 3;
//		System.out.println(Arrays.toString(arr1));
//		double arr2[] = {1.1,2.1,3.1,4.1};
//		String arr3[] = {"강아지","고양이","붕어"}; 
//		arr3[2]="햄스터";
		
		//Human 객체 배열
		Human arr4 [] = new Human[3];
//		Human arr4[]= {
//				new Human(),
//				new Human(),
//				new Human()
//			
//		};
		arr4[0]= new Human();
		arr4[0].name = "홍길동";
		arr4[0].age = 15;
		arr4[0].height = 154.1;
		arr4[1] = new Human();
		arr4[1].name = "홍길남";
		arr4[1].age = 25;
		arr4[1].height = 157.1;
		
		arr4[2]= arr4[0];
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr4[0].name);
		System.out.println(arr4[0].age);
		System.out.println(arr4[0].height);
		
		arr4[1].name = "홍길동";
		arr4[1].age = 15;
		arr4[1].height = 154.1;
		
		System.out.println(arr4[0] == arr4[1]);
		System.out.println(arr4[0] == arr4[2]);
		
		//야구게임 전광판
		int team1 [] = new int [10];
		int team2 [] = new int [10];
		int team1TotalScore= 0;
		int team2TotalScore= 0;
		
		team1[4] = 1;
		team1[5] = 3;
		team1[6] = 2;
		team1[7] = 3;
		team1[8] = 1;
		
		team2[1] = 2;
		team2[2] = 2;
		team2[4] = 4;
		team2[5] = 1;
		team1[9] =team1[0]+team1[1]+team1[2]+team1[3]+team1[4]+team1[5]+team1[6]+team1[7]+
				team1[8];
		team2[9] =team2[0]+team2[1]+team2[2]+team2[3]+team2[4]+team2[5]+team2[6]+team2[7]+
				team2[8];
		System.out.println(Arrays.toString(team1));
		System.out.println(Arrays.toString(team2));
		
		//연습문제
		//1.배열에 53,6,85,3,5를 넣은 다음 배열의 내용을 화면에 출력해 보자.
		int arr5 [] = {53,6,85,3,5};
		System.out.println(Arrays.toString(arr5));
		//2. 배열 a에 1,2,3 을 넣은 후
		//배열 내의 모든 값에 2를 더한 값인 3,4,5로 변경한
		//다음에 배열의 내용을 화면에 인덱스 순서대로 출력해 
		//보고 인덱스 역순으로 출력해 보자.
		int a[]= {1,2,3};
		System.out.println(Arrays.toString(a));
		a[0]=a[0]+2;
		a[1]=a[1]+2;
		a[2]=a[2]+2;
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a[0]);
		
		//3. 배열 a1[]={12,1,53,6,85,3}를 만든 다음에
		//배열의 모든 내용을 더한 값을 sum에 저장하여 출력하는 코드를 만들어 보자.
		int a1[]= new int[6];
		a1[0] = 12;
		a1[1] = 1;
		a1[2] = 53;
		a1[3] = 6;
		a1[4] = 85;
		a1[5] = 3;
		int sum = a1[0]+a1[1]+a1[2]+a1[3]+a1[4]+a1[5];
		System.out.println(Arrays.toString(a1));
		System.out.println(sum);
		
		//4. a3[]={12,1,53,6,85,3}에서
		//a3배열에 들어있는 값중 짝수만 화면에 출력하시오.
		int a3[]= {12,1,53,6,85,3};
		System.out.println(a3[0]);
		System.out.println(a3[3]);
		
//		5. a4[]={12,1,53,6,85,3}에서 인덱스가 홀수인 배열의 값을 출력하시오.
		int a4 []= {12,1,53,85,3};
		System.out.println(a4[0]);
		System.out.println(a4[2]);
		System.out.println(a4[4]);

		//6. tree클래스를 배열로 선언하여 여러개의 데이터를 넣은후 출력해 보자.
		Tree t[] = new Tree[3];
		t[0] = new Tree();
		t[1] = new Tree();
		t[2] = new Tree();
		
		t[0].name = "은행나무";
		t[0].price = 100;
		t[0].time = 1;
		
		t[1].name = "단풍나무";
		t[1].price = 50;
		t[1].time = 1;
		
		t[2].name = "소나무";
		t[2].price = 60;
		t[2].time = 1;
	
		System.out.println(t[0].name);
		System.out.println(t[0].price);
		System.out.println(t[0].time);
		System.out.println();
		
		System.out.println(t[1].name);
		System.out.println(t[1].price);
		System.out.println(t[1].time);
		System.out.println();
		
		System.out.println(t[2].name);
		System.out.println(t[2].price);
		System.out.println(t[2].time);
		System.out.println();
	}

}
