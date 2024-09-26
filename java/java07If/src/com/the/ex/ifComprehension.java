package com.the.ex;

public class ifComprehension {

	public static void main(String[] args) {

//		조건문 if 
//		if(조건식) {//조건식은 실행결과 boolean값을 가진 식만 올 수 있다.
//			//참일 때 실행되는 코드블록
//		}else {
//		//거짓일 때 실행되는 코드블록
//		}
		//if문 사용방법 및 주의사항
		boolean isFlag =false;
		if(isFlag){//중괄호를 하였지만 ; 때문에 원하는 결과가 나오지 않음
			System.out.println("출력값은");
			System.out.println("true");
		}else
			System.out.println("출력값은");
		 	System.out.println("false");//isFlag값에 관계없이 무조건 출력
		if(isFlag);{//중괄호를 하였지만 ; 때문에 원하는 결과가 나오지 않음
			System.out.println("출력값은");
			System.out.println("true");
		//System.out.println("출력값은");//isFlag값에 관계없이 무조건 출력
		
		}
		//예제1.
		int a = 10;
		if(a>5) {
			System.out.println("수식결과 true여서 a가 5보다 크다.");
		}else {
			System.out.println("수식결과 false여서 ark 5보다 크지 않다.");
		}
		if(1>5) {
			System.out.println("수식결과 true이다.");
		}else {
			System.out.println("수식결과 false 이다.");
		}
		//예제2.
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요. 결과 a>b 크면 a 작으면 b 출력");
		int a1 = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		if(a1>b) {
			System.out.println(a1);
		}else {
			System.out.println(b);
		}
		//true,false 1,0 일반적인 언어에서 0이 아니면 true 취급
		//if(1){} 조건식이 실행
		//if(0) 조건식이 실행 안 됨
		//if(23) 조건식이 실행 됨
		if(a==10) {
			System.out.println("true");
		}
		
	}

}
