package com.the.dto;

public class MyFunction {
	
	//달러랑 환율을 입력받아 원을 리턴해주는 함수
	public static double exchange(double dollar,double exchangeRate) {
		double won = dollar*exchangeRate;
		return won;//리턴값 함수가 종료되면 남는 값
	}
	//나머지 메소드 제착위치
	public static int expense(int cupCount, int cupPrice) {
		int expense = cupCount*cupPrice;
		return expense;
	}
	public static double translateTemp(double celsius) {
		double fahrenheit = (celsius*1.8)+32;
		return fahrenheit;//화씨
	}
	public static int sum (int a, int b) {
		int sum =0;
		sum =a+b;
		return sum;
	}
	public static int min (int a, int b) {
		int min =0;
		min =a-b;
		return min;
	}
	public static int mul (int a, int b) {
		int mul =0;
		mul =a*b;
		return mul;
	}
	public static int div (int a, int b) {
		int div =0;
		div =a/b;
		return div;
	}
	public static void hello() {
		System.out.println("안녕하세요");
	}
	//7의 배수 찾기
	public static boolean seven() {
		 
		
	}
	
	public static void main(String[] args) {
	 //달러를 원으로 출력 1161
		double dollar=6.2;
		double won = 0;
		double exchangeRate = 1161;
		won = MyFunction.exchange(dollar,exchangeRate);
		System.out.println(dollar+ "달러를 "+exchangeRate+ " 환율로 변환하면 "+won+" 원이 된다.");
	//구입할 컵의 개수와 가격을 통해 비용을 계산하는 함수를 만들어보자.
		int cupCount =10;
		int cupPrice =2500;
		int expense = MyFunction.expense(cupCount,cupPrice);
		System.out.println("발생하는 총비용은 총 "+ expense+" 원 입니다.");
	//썹시 화씨로 변환
		System.out.println("썹씨 온도");
		double celsius =30;
		double fahrenheit = MyFunction.translateTemp(celsius);
		System.out.println("섭씨"+celsius+" 도는 화씨"+ translateTemp(celsius)+"F 입니다.");
	//연산자 메소드
		int a = 13;
		int b = 15;
		int sum= MyFunction.sum(a,b);
		int min =MyFunction.min(a,b);
		int mul =MyFunction.mul(a,b);
		int div =MyFunction.div(a,b);
		System.out.println(sum);
		System.out.println(min);
		System.out.println(div);
		//안녕하세요 출력
		hello();
		hello();
		for(int i = 0; i<3; i++) {
			hello();
		}

	
	}

}
