package com.the.ex;

import java.util.*;

public class ElseIf {

	public static void main(String[] args) {

		// 조건문 else if

		// 에제
		// 1. 입력 else 생략가능
		// 출력 값 없음
		if (5 < 3) {
			System.out.println(1);
		} else if (6 < 3) {
			System.out.println(2);
		}
		// 2. 입력 else if 여러개 중 1개만 출력
		// 출력 조건에 맞음
		if (5 > 3) {
			System.out.println("조건에 맞음");
		} else if (6 > 4) {
			System.out.println("조건이 맞으나 이미 맞는 조건이 있어서 출력되지 않음");
		} else {
			System.out.println("모든 조건에 맞지 않으면 출력");
		}

		// 3.입력
		// 출력 1
		int hi1 = 4;
		if (hi1 > 3) {
			System.out.println(1);
		} else if (hi1 > 5) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		// 4.입력
		// 출력 3
		int j1 = 0;
		int j2 = 1;
		int j3 = 2;
		if (j1 > 3) {// 0>3=>false
			System.out.println(1);
		} else if (j2 > j3) {// 1>2=>false
			System.out.println(2);
		} else {// 조건이 모두 거짓이므로 해당 코드 실행
			System.out.println(3);
		}
		// 5.입력
		// 출력 ?
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 :");
		String input = scanner.nextLine();
		int score = Integer.parseInt(input);
		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else if (score >= 80) {
			System.out.println("B학점입니다.");
		} else if (score >= 70) {
			System.out.println("C학점입니다.");
		} else if (score >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		// 6.입력
		// else if문은 여러개의 조건중 하나의 조건만 실행한다.
		System.out.print("Enter a number between 1 and 3: ");
		input = scanner.nextLine();
		int num = Integer.parseInt(input);
		if (num == 1) {
			System.out.println("You entered 1");
		} else if (num == 2) {
			System.out.println("You entered 2");
		} else if (num == 3) {
			System.out.println("You entered 3");
		} else {
			System.out.println("Invaild input");
		}
		// 7.입력
		// 사용자 입력값에 따라 다른 동작을 수행하는 예제
		System.out.print("Enter a command (start, stop, pause): ");
		String command = scanner.nextLine();
		if (command.equals("start")) {
			System.out.println("Starting the program");
		} else if (command.equals("stop")) {
			System.out.println("Stopping the program");
		} else if (command.equals("pause")) {
			System.out.println("Pausing the program");
		} else {
			System.out.println("Invaild command");
		}
	}

}
