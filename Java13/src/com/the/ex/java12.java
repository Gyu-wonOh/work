package com.the.ex;

public class java12 {

	public static void main(String[] args) {

		//컴퓨터가 낸 숫자 맞추기?
		int count = 0;
//		int comNumber = (int)(Math.random()*100+1);
		int comNumber = 15;
		int userNumber = 0;
		while(comNumber!=userNumber) {
			//사용자 입력
			System.out.println(count + " 번째 "+"컴퓨터 숫자는?");
		userNumber =Integer.parseInt (new java.util.Scanner(System.in).nextLine());
			count++;
			
			//컴퓨터의 힌트
			if(comNumber>userNumber) {
				System.out.println(userNumber+"는 컴퓨터가 가지고 있는 숫자보다 작습니다.");
			}else if(comNumber<userNumber) {
				System.out.println(userNumber+"는 컴퓨터가 가지고 있는 수보다 큽니다.");
			}else {
				System.out.println(count+"번 도전해서 "+userNumber+" 수를 맞췄습니다.");
			}
			
			//앞으로 구현할 것들
		}
		System.out.println("종료");
	}

}
