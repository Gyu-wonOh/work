package com.the.ex;

public class HelloBye {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("\'안녕\' 또는 \'잘가\' 또는 \'잘 자\' 를 입력하세요");
		String s = sc.nextLine();
		String s1 = s.equals("안녕")?"너도 안녕" :s.equals("잘가")?"너도 잘가":s.equals("잘 자")?"너도 잘자":"";
	
		System.out.println(s1);
	}

}
