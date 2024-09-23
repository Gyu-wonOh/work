package com.the.ex;

public class DataChange {

	public static void main(String[] args) {

		int a = 5;
		int b = 4;
		System.out.println("교환 전: a=" + a + "b =" + b);

		// 잘못된 교환
		a = b;
		b = a;
		System.out.println("잘못된 교환 후: a=" + a + " b =" + b);// a=4 b=4

		a = 5;// a컵의 콜라
		b = 6;// b컵의 사이다

		int c;
		c = a;// 첫번째 이동: a컵의 콜라를 c컵으로 옮김
		a = b;// 두번째 이동: b컵의 사이다를 a컵으로 옮김
		b = c;// 세번째 이동: c컵의 콜라를 b컵으로 옮김
		// 결과출력
		System.out.println("a컵의 내용물: " + a);
		System.out.println("b컵의 내용물: " + b);

		// 다음 문제를 풀어보자.

		// 1.a, b 의 수를 입력 받아
		// 두 수를 교환후
		// 두 수를 출력하는 순서도이다. 참고 해서 코드를 작성해 보자.

		// a,b 수 입력 받기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("두 수 (a,b)를 입력하세요.");
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		// 두 수 교환
		c = 0;// 변수 초기화
		c = a;// a의 수를 c로 옮김
		a = b;// b의 수를 a로 옮김
		b = c;// c의 수를 b로 옮김
		// 교환한 두 수를 출력
		System.out.println("입력된 두 수는 교환하여 a = " + a + " b= " + b);
		System.out.println("-------1번끝---------");
		System.out.println();
		// 2. 입력한 숫자가 ->scanner 사용
		// 10보다 큰 수인지 true
		// 아닌지 -> 10보다 작은 수인지 false
		// 조건문 if 사용
		// 출력하는 순서도를 보고
		// 프로그램으로 만들어 보자.
		System.out.println("수를 입력하세요.");
		a = Integer.parseInt(sc.nextLine());// 숫자 입력 받기
		// 조건문 if 사용하여 true false 경우 출력
		if (a > 10) {// 10보다 큼
			System.out.println("10보다 크다.");
		} else {// 10보다 작음
			System.out.println("10보다 작다. ");
		}
		System.out.println("-------2번끝---------");
		System.out.println();
		// 3.입력 받은 숫자가
		// 양수인지 0인지 음수인지 판단하는 숫자>0/숫자==0/숫자<0
		// 순서도와 프로그램을 만들어 보자
		System.out.println("수를 입력하세요.");
		a = Integer.parseInt(sc.nextLine());// 숫자 입력 받기
		if (a > 0) {// a가 0보다 큼
			System.out.println("양수이다.");
		} else if (a == 0) {// a가 0과 같다.
			System.out.println("0과 같다.");
		} else {// a는 0보다 작다
			System.out.println("음수이다.");
		}
		System.out.println("-------3번끝---------");
		System.out.println();
		
		//4.3개의 수를 입력 받아 
		//가장 작은 수를 a, 다음 작은수를 b, 나머지 수를 c에 넣어 
		//작은수 부터 출력해 보자.
		//가장 작은 변수를 찾아 a값과 교환한다.
		//남은 변수를 비교해서 c가 더작으면 b와 교환 그렇지 않으면 교환하지 않는다.
		//a,b,c를 순서대로 출력한다.
		
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		c = Integer.parseInt(sc.nextLine());
		
		if(a>b) {//b가 작음
			
			if(b>c) {//c가 가장 작음
				int t=0;
				t=a;
				a=c;
				c=t;
			}else {//b가 가장 작음
				int t=0;
				t=a;
				a=b;
				b=t;
			}
		}else {//a가 작음
				if(a>c) {//c가 가장 작음
					int t=0;
					t=a;
					a=c;
					c=t;
					}else {//a가 가장 작음
				}
				
			}
		System.out.println("a:"+a+"b:"+b+"c:"+c);
		//남은 변수를 비교해서 c가 더작으면 b와 교환 그렇지 않으면 교환하지 않는다.
		if(b>c) {//c가 작음
			int t= 0;
			t=c;
			c=b;
			b=t;
			}else {//b가 작음
				//교환하지 않는다.
			}
		//a,b,c를 순서대로 출력한다.
		System.out.println("a:"+a+"b:"+b+"c:"+c);
		
	}

}
