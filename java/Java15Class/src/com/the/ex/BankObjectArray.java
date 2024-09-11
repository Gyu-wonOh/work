package com.the.ex;
import com.human.dto.*;

public class BankObjectArray {
	public static LoginUserState loginUserState = LoginUserState.LOGOUT;
	public static int totalUserCount = 0;
	public static int loginUserIndex = -1;
	
	public static String adminId= "admin";
	public static String password = "1111";
	// 사용자 입력받기 위한 Scanner와 사용자입력을 처리할 변수들
		public static java.util.Scanner sc = new java.util.Scanner(System.in);
		public static String inputId = null;
		public static String inputPw = null;
		public static double inputAccount = 0;

	public static void main(String[] args) {
		// 1명의 관리자와 100명의 은행 사용자를 관리하는 프로그램
		// int 초기화 작업 : 일반사용자 3명 추가
		BankUser[]bankUserArr =new BankUser[100];
		
		bankUserArr[0]= new BankUser();
		bankUserArr[0].id = "user1";
		bankUserArr[0].pw = "user1";
		bankUserArr[0].account = 1000;

		bankUserArr[1] =new BankUser("user2","user2",2000);
		bankUserArr[2] =new BankUser("user3","user3",2000);
		BankObjectArray.totalUserCount = 3;// 추가된 사용자가 3명

		// 로그인상태가 종료가 아닌동안 반복

		while (!loginUserState.equals(LoginUserState.EXIT)) {

			// 로그인 작업
			System.out.println("아이디와 pw를 입력하세요" + ".종료하고 싶으면  EXIT를 입력하세요.");
			System.out.println("id>>");
			BankObjectArray.inputId = sc.nextLine();
			if(BankObjectArray.inputId.equals("EXIT")) {
				loginUserState = LoginUserState.EXIT;
				break;
			}
			System.out.println("pw>>");
			BankObjectArray.inputPw = sc.nextLine();

			// 로그인 시도전 초기상태를 로그아웃으로 만듬
			for (int i = 0; i < BankObjectArray.totalUserCount; i++) {
				// System.out.println(i);
				if (bankUserArr[i].id.equals(BankObjectArray.inputId)) {// id 찾음
					if (bankUserArr[i].pw.equals(BankObjectArray.inputPw)) {
						// 로그인 성공//user1~3 user1~3
						System.out.println(bankUserArr[i].id + " 님 로그인 하셨습니다.");
						BankObjectArray.loginUserIndex = i;
						BankObjectArray.loginUserState = LoginUserState.USER_LOGIN;
					} else {// user1~3 패스워드 틀릴경우
						System.out.println("잘못된 패스워드 입력");
					}
					break;
				}
			}

			// 사용자가 입력한 아이디가 기존 일반 사용자 아이디에 존재하지 않음
			if (BankObjectArray.loginUserState != LoginUserState.USER_LOGIN) {
				// 관리자인지 확인
				if (BankObjectArray.adminId.equals(BankObjectArray.inputId) && BankObjectArray.password.equals(BankObjectArray.inputPw)) {
					System.out.println("관리자로 로그인 하였습니다.");// admin 1111
					BankObjectArray.loginUserState = LoginUserState.ADMIN_LOGIN;
				} else {
					System.out.println("없는 아이디 입니다. 다시입력해주세요.");
				}
			}


		if(loginUserState.equals(LoginUserState.ADMIN_LOGIN)) {
				System.out.println("관리자 관련 작업메뉴");
				boolean isAdmMenu = true;
				while (isAdmMenu) {
					System.out.println("1.계정추가 2.계정삭제 3. id변경 4.모든 사용자 출력 5.종료");
					switch (BankObjectArray.sc.nextLine()) {
					case "1":
						System.out.println("추가할 id>>");
						inputId = sc.nextLine();
						System.out.println("추가할 pw>>");
						inputPw = sc.nextLine();
						bankUserArr[BankObjectArray.totalUserCount]= new BankUser();
						bankUserArr[BankObjectArray.totalUserCount].id = inputId;
						bankUserArr[BankObjectArray.totalUserCount].pw = inputPw;
						bankUserArr[BankObjectArray.totalUserCount].account = 100;
						System.out.println(bankUserArr[BankObjectArray.totalUserCount].id + "계정생성");
						BankObjectArray.totalUserCount++;
						break;

					case "2":
						System.out.println("삭제할 id>>");// 삭제 작업
						inputId = sc.nextLine();
						int findIndex = BankObjectArray.totalUserCount;
						for (int i = 0; i < BankObjectArray.totalUserCount; i++) {
							if (bankUserArr[i].id.equals(inputId)) {// 찾음
								findIndex = i;
							}
						}

						for (int i = findIndex; i < BankObjectArray.totalUserCount - 1; i++) {

							bankUserArr[i].id = bankUserArr[i + 1].id;
							bankUserArr[i].pw = bankUserArr[i + 1].pw;
							bankUserArr[i].account = bankUserArr[i + 1].account;
						}

						BankObjectArray.totalUserCount--;

						break;

					case "3":
						System.out.println("변경할 id>>");
						inputId = sc.nextLine();
						for (int i = 0; i < BankObjectArray.totalUserCount; i++) {
							if( bankUserArr[i].id.equals(inputId)) {
								// 찾음
								System.out.println("변경할 id>>");
								bankUserArr[i].id = sc.nextLine();
								System.out.println("변경할 pw>>");
								bankUserArr[i].pw = sc.nextLine();
							}
						}
						break;

					case "4":
						System.out.println("출력 시작");
						for (int i = 0; i < BankObjectArray.totalUserCount; i++) {
							System.out.print(i + " 번째 id>>" + bankUserArr[i].id);
							System.out.print(" pw>>" + bankUserArr[i].pw);
							System.out.println(" account>>" + bankUserArr[i].account);
						}

						System.out.println("모두 출력");
						break;
					case "5":
						System.out.println("관리자 메뉴 종료");
						BankObjectArray.loginUserState = LoginUserState.LOGOUT;
						isAdmMenu = false;
						break;
					}
				}
		}
				else if(loginUserState.equals(LoginUserState.USER_LOGIN)) {
				System.out.println("사용자 관련 작업메뉴");
				boolean isUseMenu = true;
				while (isUseMenu) {
					System.out.println("1.입금 2.출금 3.잔액 조회 4.종료 입력>>");
					switch (sc.nextLine()) {
					case "1":
						System.out.println("입금액 입력>>");
						inputAccount = Double.parseDouble(sc.nextLine());
						bankUserArr[BankObjectArray.loginUserIndex].account += inputAccount;
						System.out.println(bankUserArr[BankObjectArray.loginUserIndex].id + "님 잔액:" + bankUserArr[BankObjectArray.loginUserIndex].account);
						break;
					case "2":
						System.out.println("출금액 출력>>");
						inputAccount = Double.parseDouble(sc.nextLine());
						bankUserArr[BankObjectArray.loginUserIndex].account -= inputAccount;
						System.out.println(bankUserArr[BankObjectArray.loginUserIndex].id + "님 잔액:" +  bankUserArr[BankObjectArray.loginUserIndex].account);
						break;
					case "3":
						System.out.println("잔액 조회>>");
						System.out.println(bankUserArr[BankObjectArray.loginUserIndex].id + "님 잔액:" + bankUserArr[BankObjectArray.loginUserIndex].account);
						break;
					case "4":
						System.out.println("사용자 메뉴 종료");
						BankObjectArray.loginUserState = LoginUserState.LOGOUT;
						isUseMenu = false;
						break;
					}
				}
			
			}
		} // while문 종료
		System.out.println("프로그램 종료");
	}// main메소드 종료

}// 클래스 종료
