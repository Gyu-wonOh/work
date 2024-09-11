

public class Ex4_Dispenser {

	public static void main(String[] args) {
		//4. 실존하는 자판기와 동일하게 만들어 보자. 문자열 변수를 처리하려면 int 가 아닌 String 자료형을 사용해서 선언해야 한다.
//		String 사용방법은 다음과 같다.
//		String str=“”; str=str+“사이다”; str=str+“콜라”;
//		System.out.println(str); 
//		String 변수 str를 출력하면 사이다콜라가 출력된다.
//		메뉴:
//		남은돈 0원.
//		1.사이다 700 2.콜라 500 3.환타 350 4.100투입 5.500투입 6.반환
//		음료반환구에  사이다 콜라 가 있음
//		메뉴를 보여주고 사용자가 선택을 하면 선택 사항을 반영하여 선택후 항상 메뉴를 보여 준다.
//		시나리오 :
//		천원짜리 세장 넣고 사이다1개 콜라2개 환타1개 를 구매한다.
//		최종 출력값: 
//		     사이다 콜라 콜라 환타 천원짜리 0개 오백원짜리 1개 백원짜리 4개 오십원 1개

		String buying= "" ;
		String str ="";
		int change = 0 ;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("지폐 또는 동전을 투입하세요>>");
		change = Integer.parseInt(sc.nextLine());
		while(!str.equals("6")) {
			System.out.println("메뉴:\n남은돈"+change+"원.\n1.사이다 700 2. 콜라 500 3.환타 350 4. 100투입 5.500 투입 6. 반환");
			str = sc.nextLine();
			switch(str) {
			case "1":
				System.out.println("1.사이다를 구매합니다");
				System.out.println("남은 돈에서 700원을 차감합니다");
				change = change -700;
				System.out.println("남은 돈은 "+change+" 원 입니다.");
				buying= buying+" 사이다 ";
				break;
			case "2":
				System.out.println("2.콜라를 구매합니다.");
				System.out.println("남은 돈에서 500원을 차감합니다.");
				change=change -500;
				System.out.println("남은 돈은 "+change+" 원 입니다.");
				buying= buying+" 콜라 ";
				break;
			case "3":
				System.out.println("3.환타를 구매합니다.");
				System.out.println("남은 돈에서 350원을 차감합니다.");
				change=change -350;
				System.out.println("남은 돈은 "+change+" 원 입니다.");
				buying= buying+" 환타 ";
				break;
			case "4":
				System.out.println("4.100원을 투입합니다.");
				System.out.println("남은 돈에 100원이 증가합니다.");
				change = change +100;
				System.out.println("남은 돈은 "+change+" 원 입니다.");
				break;
			case "5":
				System.out.println("5. 500원을 투입합니다.");
				System.out.println("남은 돈에 500원이 증가합니다.");
				change=change +500;
				System.out.println("남은 돈은 "+change+" 원 입니다.");
				break;
			case "6":
				System.out.println("6. 남은 돈을 반환합니다.");
				break;
			default:
				System.out.println("잘못된 값이 입력되었습니다.");
			}
		}
		int change1000 = change /1000;
		int change500 =(change-(change1000*1000))/500;
		int change100 =(change-((change1000*1000)+(change500*500)))/100;
		int change50 =(change-((change1000*1000)+(change500*500)+(change100*100)))/50;
		int change10 =(change-((change1000*1000)+(change500*500)+(change100*100)+(change50*50)))/10;
		System.out.println(buying+" 천원짜리 "+change1000+"개, 오백원짜리 "+change500+"개, 백원짜리"+ change100+"개, 오십원짜리 "+change50+"개, 십원짜리 "+change10+"개");
	}

}
