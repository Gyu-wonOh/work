import com.human.menu.AttendanceBookEx;

public class Ex01_1_AttendanceBook {

	public static void main(String[] args) {

		// 기존 출결 프로그램은 출결 표시만 가능하다. 프로그램을 업그레이드 해서
		// 출석 결석 지각 조퇴 외출 병결 공결 정보를 처리할 수 있는 프로그램을 구현하시오.
		// boolean 배열을 int배열로 변경
		// 각각의 상태 번호를 부여
		// 상태번호를 상수로 변경
		// 이후 코드를 확인해서 출석관리 프로그램을 구현해 보자.

		int student[] = new int[50];// 학생 출결사항 저장
		int student2 = AttendanceBookEx.ATTENDANCE; // 출결사항;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String inputString = "9";
		while (!inputString.equals("6")) {
			System.out.println("메뉴: \n1.전체 출석사항 2.출결 추가 6.프로그램 종료");
			inputString = sc.nextLine();// 사용자로 부터 데이터 입력 받음
			switch (inputString) {
			case "1":
				System.out.println("1.전체 출석사항 입니다.");
				for (int i = 0; i < student.length; i++) {
					String attendance = (student[i] == 0) ? "출석"
							: (student[i] == 1) ? "결석"
									: (student[i] == 2) ? "지각"
											: (student[i] == 3) ? "조퇴"
													: (student[i] == 4) ? "외출"
															: (student[i] == 5) ? "병결"
																	: (student[i] == 6) ? "공결" : "알 수 없음";
					System.out.println((i + 1) + "번 학생의 출석 사항은 " + attendance + " 입니다.");
				}
				break;
			case "2":
				System.out.println("2.출결 추가 메뉴입니다.");
				System.out.print("학생의 번호를 입력하세요 >> ");
				System.out.print("");
				int i = Integer.parseInt(sc.nextLine());
				System.out.print("출결사항을 입력하세요 >> "
						+ "\n0.출석 1.결석 2.지각 3.조퇴 4.외출 5.병결 6.공결");
				student2 = Integer.parseInt(sc.nextLine());
				switch (student2) {
				case AttendanceBookEx.ATTENDANCE:
					System.out.println("출석");
					student[i-1] = 0;
					break;
				case AttendanceBookEx.ABSENCE:
					System.out.println("결석");
					student[i-1] = 1;
					break;
				case AttendanceBookEx.LATE:
					System.out.println("지각");
					student[i-1] = 2;
					break;
				case AttendanceBookEx.EARLY_LEAVE:
					System.out.println("조퇴");
					student[i-1] = 3;
					break;
				case AttendanceBookEx.OUTING:
					System.out.println("외출");
					student[i-1] = 4;
					break;
				case AttendanceBookEx.SICK_LEAVE:
					System.out.println("병결");
					student[i-1] = 5;
					break;
				case AttendanceBookEx.PUBLIC_LEAVE:
					System.out.println("공결");
					student[i-1] = 6;
				default:
					System.out.println("알 수 없는 상태");
				}
				break;
			case "6":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}
