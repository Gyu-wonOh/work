package com.human.menu;

public class Ex2_1_Banking {

	public static void main(String[] args) {
//		9) 문제1)에서 구현한 은행 프로그램을 배열을 이용해서 100명의 사용자 계정을 관리하는 프로그램으로 업그레이드 해보자.
//		메뉴 변경 : “메뉴: 1.입금 2.출금 3.조회 0.종료”와 같은 기존 메뉴에서 다음과 같은 메뉴로 변경해서 구현해 보자. “메뉴: 1.입금 2.출금 3.조회 4.0부터99사이의 숫자를 입력받아 작업계정 선택 5. 전체 계정 출력 0.종료”
//		계정저장 : 한명만 저장하던 int account = 0;에서 100명을 저장 할 수 있는 배열 형태로 변경한다. double account[] = new double[100];
//		현재 작업중인 계정 인덱스 저장을 위해서 int nowUserIndex=0; 를 선언한다. 작업할 사용자 인덱스로 사용된다.

		int account [] = new int [100] ;
		String input = "9";
		int nowUserIndex = 0; 
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (!input.equals("0")) {
			System.out.println("'전체메뉴: 1.입금 2.출금 3.조회 4.작업계정 선택 0.종료");
			input = sc.nextLine();
			switch (input) {
			case "1":
				System.out.println("1. 입금 화면입니다.");
				System.out.println("계정을 입력해주세요.");
				nowUserIndex = Integer.parseInt(sc.nextLine());
				System.out.println("입금하실 금액을 입력해주세요.");
				int deposit = Integer.parseInt(sc.nextLine());
				account[nowUserIndex] = account[nowUserIndex] + deposit;
				System.out.println(nowUserIndex+"번 계좌에 " + deposit + " 원이 입금되었습니다.\n 총 잔액은 " + account[nowUserIndex] + " 원 입니다.");
				break;
			case "2":
				System.out.println("2. 출금 화면입니다.");
				System.out.println("계정을 입력해주세요.");
				nowUserIndex = Integer.parseInt(sc.nextLine());
				System.out.println("출금하실 금액을 입력해주세요.");
				int withdraw = Integer.parseInt(sc.nextLine());
				account[nowUserIndex] = account[nowUserIndex] - withdraw;
				System.out.println(nowUserIndex +" 번 계좌에 " + withdraw + " 원이 출금되었습니다.\n 총 잔액은 " + account[nowUserIndex] + " 원 입니다.");
				break;
			case "3":
				System.out.println("3. 조회 화면입니다.");
				System.out.println("계정을 입력해주세요.");
				nowUserIndex = Integer.parseInt(sc.nextLine());
				System.out.println("계좌에 잔액은 " + account[nowUserIndex] + " 원 입니다.");
				break;
			case "4":
				System.out.println("계정을 입력해주세요.");
				nowUserIndex = Integer.parseInt(sc.nextLine());
				System.out.println("메뉴: 1.입금 2.출금 3.조회 0.종료");
				String input2 = sc.nextLine();
				switch(input2) {
				case "1":
					System.out.println("1. 입금 화면입니다.");
					System.out.println("입금하실 금액을 입력해주세요.");
					deposit = Integer.parseInt(sc.nextLine());
					account[nowUserIndex] = account[nowUserIndex] + deposit;
					System.out.println(nowUserIndex+"번 계좌에 " + deposit + " 원이 입금되었습니다.\n 총 잔액은 " + account[nowUserIndex] + " 원 입니다.");
					break;
				case "2":
					System.out.println("2. 출금 화면입니다.");
					System.out.println("출금하실 금액을 입력해주세요.");
					withdraw = Integer.parseInt(sc.nextLine());
					account[nowUserIndex] = account[nowUserIndex] - withdraw;
					System.out.println(nowUserIndex +" 번 계좌에 " + withdraw + " 원이 출금되었습니다.\n 총 잔액은 " + account[nowUserIndex] + " 원 입니다.");
					break;
				case "3":
					System.out.println("3. 조회 화면입니다.");
					System.out.println("계좌에 잔액은 " + account[nowUserIndex] + " 원 입니다.");
					break;
				case "0":
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다.");
				}
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
