public class Ex01_AttendanceBook {

	public static void main(String[] args) {
//		1. 50명의 학생의 출석 사항을  처리하는 프로그램을 만들어 보자. 출석자는  true이고 결석자는 false 데이터를 가진다.
//		boolean student[]=new boolean[50]; 배열을 사용해서 아래와 같은 메뉴를 가진 프로그램을 만들어 보자. 
//		메뉴: 
//		1.전체 출석사항 2.결석자 추가 3.출석자 추가  6.프로그램 종료
//		설명
//		1.전체 출석사항
//		배열에 true가 들어 있으면 출석, false가 들어 있으면 결석이다.
//		인덱스 + 1 를 학생 번호라 할때 모든 학생별 상황을 다음과 같이 출력 한다.
//		"1번 학생의 출석 사항은 출석입니다."
//		"2번 학생의 출석 사항은 결석입니다."
//		2.결석자 추가 
//		 결석한 학생의 번호를 입력 받아 입력 받은 숫자에 해당하는 배열의 인덱스에 false를 넣으면 된다.
//		3.출석자 추가  
//		 출석한 학생의 번호를 입력 받아 입력 받은 숫자에 해당하는 배열의 인덱스에 true를 넣으면 된다.
//		4.프로그램 종료
//		 진행중인 프로그램을 종료시키면 된다.
		
		boolean student [] =new boolean[50];//학생 출결사항 저장
		java.util.Scanner sc =new java.util.Scanner(System.in);
		String inputString = "9";
		while(!inputString.equals("6")) {
			System.out.println("메뉴: \n1.전체 출석사항 2.결석자 추가 3.출석자 추가 6.프로그램 종료");
			inputString = sc.nextLine();//사용자로 부터 데이터 입력 받음
			switch(inputString) {
			case "1":
				System.out.println("1.전체 출석사항 입니다.");
					for(int i =0;i<student.length;i++) {
						String attendance = (student[i]==true)? "출석":"결석";
						System.out.println((i+1)+"번 학생의 출석 사항은 "+attendance+" 입니다.");
					}
				break;
			case "2":
				System.out.println("2.결석자 추가 메뉴입니다.");
				System.out.print("결석자의 번호를 입력하세요 >> ");
				System.out.print("");
				int i = Integer.parseInt(sc.nextLine());
				student[i-1]= false;
				System.out.println(i+" 번 학생이 결석처리 되었습니다.");
				break;
			case "3":
				System.out.println("3.출석자 추가 메뉴입니다.");
				System.out.print("출석자의 번호를 입력하세요 >> ");
				System.out.print("");
				 i = Integer.parseInt(sc.nextLine());
				student[i-1]= true;
				System.out.println(i+" 번 학생이 출석처리 되었습니다.");
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
