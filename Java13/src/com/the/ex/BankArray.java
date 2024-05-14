package com.the.ex;

public class BankArray {
	// 문자 상수로 표현하였다.//로그인 상태값
	// 상수의 음수 값은 error 종료와 같은 의미를 가진다.
	public static final int STATE_LOGOUT = 0; // 로그아웃
	public static final int STATE_USER_LOGIN = 1; // 사용자로그인
	public static final int STATE_ADMIN_LOGIN = 2;// 관리자로그인
	public static final int STATE_EXIT = -1; // 사용종료

	// 최대 저장 할 수 있는 사용자 id,pw,account를 전역 배열로 생성

	public static String id[] = new String[100];
	public static String pw[] = new String[100];
	public static double account[] = new double[100];

	public static int totalUserCount = 0;// 일반사용자 전체 개수
	public static int loginUserIndex = -1;// 로그인한 사람의 인덱스
	public static int loginUserStatus = BankArray.STATE_LOGOUT;// 로그인 상태

	// 관리자정보
	public static String adminId = "admin";
	public static String adminPw = "1111";

	// 사용자 입력받기 위한 Scanner와 사용자입력을 처리할 변수들
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static String inputId = null;
	public static String inputPw = null;
	public static double inputAccount = 0;

	public static void main(String[] args) {
		// 1명의 관리자와 100명의 은행 사용자를 관리하는 프로그램
		// int 초기화 작업 : 일반사용자 3명 추가
		BankArray.id[0] = "user1";
		BankArray.pw[0] = "user1";
		BankArray.account[0] = 1000;
		BankArray.id[1] = "user2";
		BankArray.pw[1] = "user2";
		BankArray.account[1] = 2000;
		BankArray.id[2] = "user3";
		BankArray.pw[2] = "user3";
		BankArray.account[2] = 3000;
		BankArray.totalUserCount = 3;// 추가된 사용자가 3명

		// 로그인상태가 종료가 아닌동안 반복

		while (BankArray.loginUserStatus != BankArray.STATE_EXIT) {

			// 로그인 작업
			System.out.println("아이디와 pw를 입력하세요" + ".종료하고 싶으면  EXIT를 입력하세요.");
			System.out.println("id>>");
			BankArray.inputId = sc.nextLine();
			System.out.println("pw>>");
			BankArray.inputPw = sc.nextLine();

			// 로그인 시도전 초기상태를 로그아웃으로 만듬
			BankArray.loginUserStatus = BankArray.STATE_LOGOUT;
			for (int i = 0; i < BankArray.totalUserCount; i++) {
				// System.out.println(i);
				if (BankArray.id[i].equals(BankArray.inputId)) {// id 찾음
					if (BankArray.pw[i].equals(BankArray.inputPw)) {
						// 로그인 성공//user1~3 user1~3
						System.out.println(id[i] + " 님 로그인 하셨습니다.");
						BankArray.loginUserIndex = i;
						BankArray.loginUserStatus = BankArray.STATE_USER_LOGIN;
					} else {// user1~3 패스워드 틀릴경우
						System.out.println("잘못된 패스워드 입력");
					}
					break;
				}
			}
			System.out.println("test");
//			// 사용자가 입력한 아이디가 기존 일반 사용자 아이디에 존재하지 않음
//			if (BankArray.loginUserStatus != BankArray.STATE_USER_LOGIN) {
//				// 관리자인지 확인
//				if (BankArray.adminId.equals(BankArray.inputId) && BankArray.adminPw.equals(BankArray.inputPw)) {
//					System.out.println("관리자로 로그인 하였습니다.");// admin 1111
//					BankArray.loginUserStatus = BankArray.STATE_ADMIN_LOGIN;
//				} else {
//					System.out.println("없는 아이디 입니다. 다시입력해주세요.");
//				}
//			}
//
//			// 사용자가 프로그램 종료요청시 실행
//			if (BankArray.inputId.equals("EXIT")) {
//				BankArray.loginUserStatus = BankArray.STATE_EXIT;
//			}
//
//			switch (BankArray.loginUserStatus) {
//			case BankArray.STATE_ADMIN_LOGIN:
//				System.out.println("관리자 관련 작업메뉴");
//				break;
//			case BankArray.STATE_USER_LOGIN:
//				System.out.println("사용자 관련 작업메뉴");
//				break;
//			case BankArray.STATE_LOGOUT:
//				System.out.println("로그아웃된 상태입니다.");
//				break;
//			case BankArray.STATE_EXIT:
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			default:
//				System.out.println("알수 없는 문제가 발생한 상태입니다.");
//			}
		} // while문 종료

	}

}
