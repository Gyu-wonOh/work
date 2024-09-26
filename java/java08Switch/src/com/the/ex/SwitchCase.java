package com.the.ex;

import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		// Switch Case 조건문
		// 여러 조건 중 하나의 블록만 실행되는 제어문이다.
		// else if은 범위 조건이 조건식으로 사용 가능
		// switch문은 범위 조건은 조건식으로 사용 불가
		// 1:1 일치 여부만 조건식으로 허용
//		int i = 5;
//		switch (i) {
//		case 5:
//			System.out.println("최우수");
//			break;
//		case 4:
//			System.out.println("우수");
//			break;
//		case 3:
//			System.out.println("보통");
//			break;
//		default:
//			System.out.println("불합격");
//		}
//		// case문 다음에 break; 가 없으면 다음줄이 이어서 실행된다.
//		// default 안에 있는 break;의 경우 기술하지 않아도
//		// switch문의 맨 마지막 부분으로 스위치문을 빠져나가 생략이 가능하다.
//		i = 4;
//		switch (i) {
//		case 5:
//			System.out.println("최우수");
//			break;
//		case 4:
//			System.out.println("우수");
//			break;
//		case 3:
//		case 2:
//		case 1:
//		case 0:
//			System.out.println("불합격");
//		default:
//			System.out.println("미응시");
//		}
//
//		// 예제
//		// 1. int a=3;//a=1 a=6으로 변경해서 실행해 보자.
//		int a = 6;
//		switch (a) {
//		case 1:
//			System.out.println(1);
//			break;
//		case 2:
//			System.out.println(2);
//			break;
//		case 3:
//			System.out.println(3);
//			break;
//		case 4:
//			System.out.println(4);
//			break;
//		default:
//			System.out.println(5);
//		}
//		// 2.사용자 입력값에 따라 다른 메시지를 출력하는 예제
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a number between 1 and 3: ");
//		int num = Integer.parseInt(sc.nextLine());
//		switch (num) {
//		case 1:
//			System.out.println("You entered 1");
//			break;
//		case 2:
//			System.out.println("You entered 2");
//			break;
//		case 3:
//			System.out.println("You entered 3");
//			break;
//		default:
//			System.out.println("invaild input");
//			break;
//		}
//		// 3. 월을 입력받아 해당하는 계절을 출력하는 예제
//		System.out.print("Enter a month (1-12): ");
//		int month = Integer.parseInt(sc.nextLine());
//		switch (month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("It's spring");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("It's summer");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("It's fall");
//			break;
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("It's winter");
//			break;
//		default:
//			System.out.println("Invaild input");
//			break;
//		}
//		// 4-1.
//		System.out.print("Enter numbers:");
//		double num1 = Double.parseDouble(sc.nextLine());
//		System.out.print("Enter numbers:");
//		double num2 = Double.parseDouble(sc.nextLine());
//		System.out.print("Enter an operation (+,-,*,/): ");
//		String operator = sc.nextLine();
//		switch (operator) {
//		case "+":
//			System.out.println("Result: " + (num1 + num2));
//			break;
//		case "-":
//			System.out.println("Result: " + (num1 - num2));
//			break;
//		case "*":
//			System.out.println("Result: " + (num1 * num2));
//		case "/":
//			if (num2 != 0) {
//				System.out.println("Result: " + (num1 / num2));
//			} else {
//				System.out.println("Cannot divide by zero");
//			}
//		}
//
//		// 4-2.
//		System.out.print("Enter an alphabet: ");
//		String alphabet = sc.nextLine();
//		switch (alphabet) {
//		case "a":
//		case "A":
//			System.out.println("You entered A");
//			break;
//		case "b":
//		case "B":
//			System.out.println("You entered B");
//			break;
//		// 알파벳 c ~ z까지 모두 동일한 방식으로 처리할 수 있음
//
//		default:
//			System.out.println("Invalid input");
//			break;
//		}

		// 연습문제
		// 1번
		// switch 문 else if문으로 바꾸기
		int i = 2;
		switch (i) {
		case 2:
			i++;
			break;
		case 3:
		case 4:
			i = i + 2;
			break;
		case 6:
			i++;
			break;
		}
		System.out.println(i);
		// else if 문으로 바꾸기
		i = 2;
		if (i == 2) {
			i++;
		} else if (i > 2) {
			if (i < 4) {
				i = i + 2;
			}
		} else if (i == 6) {
			i++;
		}
		System.out.println(i);
		// else if 문 -> switch문으로 바꾸기
		i = 0;
		if (i == 0) {
			i++;
		} else if (i == 2) {
			i = i - 2;
		} else if (i == 3) {
			i = 3;
		}
		System.out.println(i);
		// switch문으로 바꾸기
		i = 0;
		switch (i) {
		case 0:
			i++;
			break;
		case 2:
			i = i - 2;
			break;
		case 3:
			i = 3;
			break;
		}
		System.out.println(i);
		// 2.1~5사이의 숫자를 변수 c에 저장하여
		// 한글로 출력하는 switch문을 만들어 보자.
		int c = 1;
		switch (c) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		case 4:
			System.out.println("넷");
			break;
		case 5:
			System.out.println("다섯");
			break;
		}
		System.out.println(c);

		// 다음을 else if문과 switch문으로 풀어 보자.
		// 3번
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter an number");
		i = Integer.parseInt(sc2.nextLine());
		int a = 5;
		int b = 7;
		switch (i) {
		case 0:
			a = a + 2;
			break;
		case 1:
			b = b + 4;
			break;
		case 2:
			a = a + b;
		default:
			b = b + 5;
		}
		System.out.println("a: " + a + "b:" + b);
		// 4번점수를 입력받아
		// 90점이상은 수,
		// 80점이상은 우,
		// 70점 이상은 미
		// ..로 출력하는 프로그램을
		// else if문과 switch문으로 만들어 보자.
		// 범위 조회여서 switch문으로 처리하기 어려울 것 처럼 보이지만
		// %연산자를 사용하면 switch문을 사용할 수 있다.
		// 100/10==10이고 99~90/10==9이다.
		// 정수 연산이기 때문에 소수점이 없다. 89~80/10==8이다. 74/10==7이 된다.
		// 이를 이용하면 충분히 switch문으로 구현할 수 있다. 수우미양가를 출력하는 프로그램을 switch문으로 구현해 보자.
		System.out.println("Enter your score");
		i = Integer.parseInt(sc2.nextLine());
		if (i >= 90) {
			System.out.println("수");
		} else if (i >= 80) {
			System.out.println("우");
		} else if (i >= 70) {
			System.out.println("미");
		} else if (i >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		int j = i / 10;
		switch (j) {
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		}

		// 5번
		System.out.println("Enter an number(1~5) \n(if you want to change digit to korean.)");
		c = Integer.parseInt(sc2.nextLine());
		switch (c) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		case 4:
			System.out.println("넷");
			break;
		case 5:
			System.out.println("다섯");
			break;
		}

		// 6번 월을 입력받아 해당하는 계절을 출력하는 예제
		System.out.print("Enter a month (1-12): \nIf you want to know how many days the month.");
		int month = Integer.parseInt(sc2.nextLine());
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
		}

		// 7번 나이를 입력 받아
		// 해당 나이의 때의
		// 학력이 초,중,고 중 어디에 해당하는지 출력해보자.
		// if문 사용
		int age = 10;
		if (age <= 13) {
			System.out.println("초등학생");
		} else if (age <= 16) {
			System.out.println("중학생");
		} else if (age <= 19) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
		// switch문 사용
		switch (age) {
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			System.out.println("초등학생");
			break;
		case 14:
		case 15:
		case 16:
			System.out.println("중학생");
			break;
		case 17:
		case 18:
		case 19:
			System.out.println("고등학생");
		default:
			System.out.println("미성년자 또는 성인");
		}
	}

}
