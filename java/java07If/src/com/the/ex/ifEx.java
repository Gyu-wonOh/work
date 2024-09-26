package com.the.ex;

public class ifEx {

	public static void main(String[] args) {

		//1.
		if(5>3) {
			System.out.println(true);
		}//true
		//2.
		if(5<3) {
			System.out.println(true);
		}//
		//3.
		System.out.println(1);
		if(5<3) {System.out.println(true);
		}
		System.out.println(2);//12
		//4.
		if(5>3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}//true
		//5.
		if(5==3) {
			System.out.println(true);
		}else {System.out.println(false);
			}//false
		//6.
		System.out.println(1);
		if(5>3) {
			System.out.println(true);
		}else {System.out.println(false);
		}
		System.out.println(2);//1 ture 2
		//7.
		int a = 10;
		int b = 5;
		if(a>b) {System.out.println(true);
		
		}//true
		//8.
		if(a>b) {System.out.println(true);
		}else {System.out.println(false);
		}//true
		//9.
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String string = scanner.nextLine();
		if(string.contains("java")) {//java 문자열이 들어가 있으면 ture
			System.out.println("java가 포함되어 있습니다.");
		} else {
			System.out.println("java가 포함되어 있지 않습니다. ");
			}
		
		
	}

}
