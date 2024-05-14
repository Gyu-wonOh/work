package com.human.ex;


public class Ex01_1_AttendanceBook {

	public static void main(String[] args) {

		// 기존 출결 프로그램은 출결 표시만 가능하다. 프로그램을 업그레이드 해서
		// 출석 결석 지각 조퇴 외출 병결 공결 정보를 처리할 수 있는 프로그램을 구현하시오.
		// boolean 배열을 int배열로 변경
		// 각각의 상태 번호를 부여
		// 상태번호를 상수로 변경
		// 이후 코드를 확인해서 출석관리 프로그램을 구현해 보자.

		AttendanceStatus[] student1 = new AttendanceStatus[50];// 학생 출결사항 저장
		AttendanceStatus student2 = AttendanceStatus.ATTENDANCE;// student2는 출석상태이다.
		student1[0] = student2;
		String input = "9";
		while (!input.equals("6")) {
			System.out.println("메뉴\n1.전체 출결사항 조회 2.출결여부 6.종료");
			input = new java.util.Scanner(System.in).nextLine();
			switch (input) {
			case "1":
				System.out.println("1. 전체 출결사항 조회 화면입니다.");
				for (int i = 0; i < student1.length; i++) {
					System.out.println(i + 1 + "번의 학생은 " + student1[i] + "입니다.");
				}
			case "2":
				System.out.println("2. 출석여부 화면입니다.");
				input = new java.util.Scanner(System.in).nextLine();
				switch (student2) {
				case ATTENDANCE:
					System.out.println("출석");
					break;
				case ABSENCE:
					System.out.println("결석");
					break;
				case LATE:
					System.out.println("지각");
					break;
				case EARLY_LEAVE:
					System.out.println("조퇴");
					break;
				case OUTING:
					System.out.println("외출");
					break;
				case SICK_LEAVE:
					System.out.println("병결");
					break;
				case PUBLIC_LEAVE:
					System.out.println("공결");
					break;
				default:
					System.out.println("알 수 없는 상태");
				}
			case "6":
				System.out.println("프로그램을 종료합니다.");
			}
		}
	}

}
