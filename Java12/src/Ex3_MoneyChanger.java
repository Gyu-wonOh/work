

public class Ex3_MoneyChanger {

	public static void main(String[] args) {

		//3. 금액을 입력받아 천원, 오백원, 백원, 오십원, 십원 짜리 잔돈으로 거슬러주는 프로그램과 순서도을 구현해 보자. 예제 금액을 1000으로 나눈 몫은 돈을 거슬러 주었을때 천원짜리 개수 이고 1000으로 나눈 나머지는 천원짜리로 환산하고 남은 잔돈이다. 10원 이하는 입력받지 않는다. 최종 결과물은 다음과 같이 될 것이다. 5820원을 잔돈으로 바꾸면 천원짜리 5개, 오백원짜리 1개, 백원짜리 3개, 오십원짜리 0개,십원짜리 2개
		//선언할 변수:change1000,change500,change100,change50,change10,moneyInput
		//출력값:p(“천원짜리 “+change1000+”개, 오백원짜리 “+change500+”개, 백원짜리”+ change100+”개, 오십원짜리 “+change50+”개, 십원짜리 “+change10개)
		
		int change1000 =0;
		int change500 =0;
		int change100 =0;
		int change50 =0;
		int change10 =0;
		int moneyInput =0;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("금액을 투입해주세요");
		moneyInput = Integer.parseInt(sc.nextLine());
		change1000 =moneyInput/1000;
		change500 =(moneyInput-(change1000*1000))/500;
		change100 =(moneyInput-((change1000*1000)+(change500*500)))/100;
		change50 =(moneyInput-((change1000*1000)+(change500*500)+(change100*100)))/50;
		change10 =(moneyInput-((change1000*1000)+(change500*500)+(change100*100)+(change50*50)))/10;
		System.out.println("천원짜리 "+change1000+"개, 오백원짜리 "+change500+"개, 백원짜리"+ change100+"개, 오십원짜리 "+change50+"개, 십원짜리 "+change10+"개");
		
	}

}
