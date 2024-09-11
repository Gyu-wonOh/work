package com.the.ex;

import java.util.Arrays;

public class MyClass3 {
//public static void function1() {
//	 int a =10;
//	 a++;
//	 System.out.println(a); //11
//}
//public static void function2(int a) {
//	System.out.println("함수 매개변수 a 값은 :"+a);
//	return;//리턴 값이 없으면 생략 가능
//}
	public static int[] function6(int a[]) {
		int rValue[]=a;
		rValue[0]= 11;
		a[1]=12;
		return rValue;
	}
	public static int[] function7(int a[]) {
		int rValue[]=new int [a.length];
		rValue[0]=a[0];
		rValue[1]=a[1];
		rValue[0]=13;
		a[1]=14;
		return rValue;
	}
	public static void main(String[] args) {
//		int a =5 ;
//		function1();
//		a++;
//		function1();
//		a++;
//		System.out.println(a);
		
//		function2(10);
//		function2(12);
		int arr[]= {1,2};
		function6(arr);
		System.out.println(Arrays.toString(arr));//11 12
		int rArr[] =function7(arr);
		System.out.println((Arrays.toString(arr)));
		System.out.println((Arrays.toString(rArr)));
//		System.out.println(Arrays.toString(arr));//11 14
//		System.out.println(Arrays.toString(rArr));//13 12
//		
//		rArr[1]=9;
//		System.out.println(Arrays.toString(arr)); //11 14
//		System.out.println(Arrays.toString(rArr)); //13 9
	}
}