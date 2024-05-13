

public class Menu {

	public static void main(String[] args) {
		String inputString ="9";
		while(!inputString.equals("0")){
			System.out.println("전체메뉴: 1.메뉴 2.메뉴 3.메뉴 0.종료");
			inputString = new java.util.Scanner(System.in).nextLine();
			switch(inputString) {
			case "1":
				System.out.println("1.메뉴");
				break;
			case "2":
				System.out.println("2.메뉴");				
				break;
			case "3":
				System.out.println("3.메뉴");
				break;
			case "0":
				System.out.println("메뉴종료");
				break;
			default:
				System.out.println("잘못된 입력");
			}
		}
		System.out.println("프로그램 종료");
	}

}
