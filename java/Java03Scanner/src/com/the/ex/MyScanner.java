package com.the.ex;

public class MyScanner {

	public static void main(String[] args) {

		//스캐너 변수 선언
		//int a; 처럼 스캐너 변수 선언
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("문자열을 일력해주세요>>");
		String str = scanner.nextLine();
		System.out.println("시용자가 입력 : " + str);
		
		//정수 입력
		java.util.Scanner scanner1 = new java.util.Scanner(System.in);
		System.out.println("정수입력>>");
		String st = scanner.nextLine();
		int i = Integer.parseInt(st);
		System.out.println(i);
		
		System.out.println("정수입력2>>");
		i= Integer.parseInt(scanner.nextLine());
		System.out.println(i);
		
		//double 입력
		System.out.println("double 입력 >>");
		st = scanner.nextLine();
		double d = Double.parseDouble(st);
		System.out.println(d);
		
		//boolean 입력
		java.util.Scanner scanner3= new java.util.Scanner(System.in);
		System.out.println("boolean 입력>>");
		String st3 = scanner.nextLine();
		boolean b = Boolean.parseBoolean(st3);
		System.out.println(b);
		
		//스캐너 연산
		System.out.println("a+c 에 들어가 a,c를 입력하세요.");
		int a =Integer.parseInt(scanner.nextLine());
		int c =Integer.parseInt(scanner.nextLine());
		int sum = a + c;
		System.out.println(sum);
		
		
	}

}
