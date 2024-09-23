import java.util.Scanner;

public class Continue_Break {

	public static void main(String[] args) {
		// break; 반복문을 빠져나간다.
		// continue; 반복중인 코드블럭을 빠져나가 증감식으로 이동하여
		// 반복문을 이어나간다.

		// 1. 사용작가 1004를 입력할 동안 반복하는 코드를 만들어보자.
//		String str = "";
//		Scanner sc = new Scanner(System.in);
//		while (!str.equals("1004")) {// String일 경우
//			// while(str == 1004){int일 경우
//			System.out.println("비밀번호 입력>>");
//		str = sc.nextLine();
//			if (str.equals("1004")) {
//
//			} else {
//				System.out.println("잘못 입력했습니다.");
//			}
//			if(str.equals("1004")){
//				break;
//			}
//			System.out.println("잘못 입력 했습니다.");
//		}
//		System.out.println("맞췄습니다.");
//		for (;;) {
//			System.out.println((">>"));
//			int a = Integer.parseInt((new java.util.Scanner(System.in).nextLine()));
//			if (a == 1004) {
//				
//				break;
//			}System.out.println("잘못된 입력");
//		}

		boolean isFlag2 = true;
		while (isFlag2) {
			if (5 > 3) {
				isFlag2 = false;
			}
		}

	}
}
