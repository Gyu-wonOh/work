

public class Ex2_Banking {

	public static void main(String[] args) {
//		2. 은행 프로그램을 순서도와 프로그래밍 언어로 만들어 보자.
//		은행 프로그램의 메뉴는 다음과 같다. ‘전체메뉴: 1.입금 2.출금  3.조회 0.종료’
//		account 변수에 처음에 0으로 세팅하고 입금 출금을 통에 원하는 액수를 더하거나 빼준다. 결국 account 변수에 있는 숫자가 은행계좌에 남은 돈이 된다.
//		입금 메뉴를 통해 입금 액을 받아 account 변수에 추가 할 수 있다.
//		출금 메뉴를 통해 출금 액을 account 변수에서 뺄 수 있다.
//		조회 메뉴를 통해 account에 입금 액이 얼마나 남아 있나 확인 할 수 있다.
//		조심해야 할 부분은 운영중 account의 값이 유지될수 있도록 적절한 위치에 선언해야 운영중에 값 손실이 생기지 않는다.
		int account = 0;
		String input = "9";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while(!input.equals("0")) {
			System.out.println("'전체메뉴: 1.입금 2.출금 3.조회 0.종료");
			input = sc.nextLine();
			switch(input) {
			case "1":
				System.out.println("1. 입금 화면입니다.\n입금하실 금액을 입력해주세요.");
				int deposit = Integer.parseInt(sc.nextLine());
				account= account+deposit;
				System.out.println("계좌에 "+deposit+" 원이 입금되었습니다.\n 총 잔액은 "
				+account+" 원 입니다.");
				break;
			case "2":
				System.out.println("2. 출금 화면입니다.\n출금하실 금액을 입력해주세요.");
				int withdraw = Integer.parseInt(sc.nextLine());
				account= account-withdraw;
				System.out.println("계좌에 "+withdraw+" 원이 출금되었습니다.\n 총 잔액은 "
						+account+" 원 입니다.");
				break;
			case "3":
				System.out.println("3. 조회 화면입니다.");
				System.out.println("계좌에 잔액은 "+account+" 원 입니다.");
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
