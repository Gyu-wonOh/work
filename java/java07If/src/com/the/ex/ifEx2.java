package com.the.ex;

public class ifEx2 {

	public static void main(String[] args) {

		//1번
		java.util.Scanner scanner = new java.util.Scanner (System.in);
		System.out.println("숫자를 입력하세요");
		int u =  Integer.parseInt(scanner.nextLine());
		int a = 14;
		int b = 11;
		if(u==0) {
			a=5;
		}else {
			b=a+3;
		}
		System.out.println(a+","+b);
		System.out.println("--------1번 끝----------");
		
		//2번 입력 받은 숫자의 절대값을 출력하는 프로그램을 만들어 보자.
		//(힌트: 0보다 작으면 -1를 곱하면 양수가 된다.)
		u = Integer.parseInt(scanner.nextLine());
		if(u<0) {
			u=u*(-1);
		}else {
		}
		System.out.println(u);
		System.out.println("--------2번 끝----------");
	
		//3번 어떤 수를 나누어 떯어지게 하는 수를 약수라고 한다.
		//100을 2로 나누면 0이된다. 따라서, 2는 100의 약수이다. 
		//사용자에게 숫자를 하나 입력받아 126의 약수인지 아닌지 출력해 보자. 
		//(힌트: 사용자가 입력한 수를 126로 나눈 결과가 0이면 약수이다.)
		System.out.println("a는 126의 약수가 인지 확인하시오");
		u = Integer.parseInt(scanner.nextLine());
		if(126%u==0) {
			System.out.println(String.format("%d는 126의 약수이다.",u));
		}else {
			System.out.println(String.format("%d는 126의 약수가 아니다.",u));
		}
		System.out.println("--------3번 끝----------");
		//4번 두수를 입력받아 
		//첫번째수가 두번째수의 약수인지 아닌지 확인하는 프로그램을 구현해 보자.
		System.out.println("b가 a의 약수인지 아닌지 확인하시오 a,b 입력" );
		a = Integer.parseInt(scanner.nextLine());
		b = Integer.parseInt(scanner.nextLine());
				
		if(a%b==0) {
			System.out.println(String.format("%d는 %d의 약수이다.",b,a ));
		}else {
			System.out.println(String.format("%d는 %d의 약수가 아니다.", b,a));
		}
		System.out.println("--------4번 끝----------");
		//5번국영수과목의 점수를 입력받아
		//평균이 80이상이면 합격 
		//80점이하면 불합격을 출력해 보자.
		//(힌트: 과목수만큼 과목점수를사용자 입력을 받아 병균을 구한후 80보다 작으면 불합격 크면 합격)
		System.out.println("국어,영어 ,수학 점수를 입력하세요.");
		u = Integer.parseInt(scanner.nextLine());//국어
		a = Integer.parseInt(scanner.nextLine());//영어
		b = Integer.parseInt(scanner.nextLine());//수학
		int c =(u+a+b)/3;
		if(c>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("--------5번 끝----------");
		//6.사용자에게 입력받은 수 x가 5이하이면 x+15의 계산결과가,
		//5초과 이면 x+5의 계산 결과가 출력되는 프로그램을 만들어 보자.
		//(힌트: 상황에 따라 x=x+5나 x=x+15를 사용하면 된다. 
		//실수로 if문 안의 블럭에 x를 선언하면 블럭이 닫힐때 x가 사라져 
		//if문 밖에서 접근할 수 없게 된다.
		System.out.println("x 값을 입력하세요 > \nx 값이 5이하 x+15\nx값 5초과 x+5 결과 출력");
		int x = Integer.parseInt(scanner.nextLine());
		if(x<=5) {//x 값이 5이하=>x 값이 5보다 작거나 같을 때=> x<=5
			x=x+15;
		}else {//x 값이 5 초과 => x 값이 5보다 크다=> x>5
			x=x+5;
		}
		System.out.println(x);
		System.out.println("--------6번 끝----------");
		//7번
		boolean b1 = 5!=3;
		boolean b2 = 5==3;
		if(b1) {
			if(b2) { System.out.println("1번");
			}else {
			System.out.println("2번");
				}
		}else {
			System.out.println("3번");
		}
			System.out.println("4번");
		
		System.out.println("--------7번 끝----------");
		//8번
				//변수 a에 20, 
				//b에 0를 넣은 다음 
				//만약에 a가 10보다 크면 a에 b를 넣고 
				//아니면 b에 a를 넣어서 
				//a,b값을 출력하는 프로그램을 만들어 보자.
				a=20;
				b=0;
				if(a>10) {
					a=b;
				}else {
					b=a;
				}
				System.out.println("a :" +a+"b:"+b);
				System.out.println("--------8번 끝----------");
		//9번 입력한 숫자가 10보다 큰 수인지 아닌지 출력하는 코드를 만들어 보자.
		u = Integer.parseInt(scanner.nextLine());
		if(u>10) {
			System.out.println(u+" 는 10보다 크다.");
		}else {
			System.out.println(u+" 는 10보다 작거나 같다.");
		}
		System.out.println("--------9번 끝----------");
		//10번 result라는 변수를 선언하고 
		//	사용자에게 수를 입력 받아
		//	0이 면 0를 0이 
		//	아니면 1를 넣어서 출력하는 프로그램을 구현해 보자.
		System.out.println("숫자를 입력하세요\n0이면 0\n0이 아니면 1");
		int result = Integer.parseInt(scanner.nextLine());
		if(result==0) {
		System.out.println(0);
		}else {System.out.println(1);
		}
		System.out.println("--------9번 끝----------");
		//11번 두수를 입력해서 
		//큰수에서 작은수를 뺀 차이를 출력하는 프로그램을 구현해 보자.
		a = Integer.parseInt(scanner.nextLine());
		b = Integer.parseInt(scanner.nextLine());
		if(a>b) {
			System.out.println(a-b);
		}else {
			System.out.println(b-a);
		}
		//12번 입력받은 3개의 숫자 중 
		//가장 큰 수를 출력하는 코드를 구현하시오. 
		//3개중에서 2개를 선택해서 큰수를 구한후 
		//나머지 하나를 비교해 보면된다.
		a = Integer.parseInt(scanner.nextLine());
		b = Integer.parseInt(scanner.nextLine());
		c = Integer.parseInt(scanner.nextLine());
		if(a>b) {//a가 큼
			if(a>c) {//a가 큼
				System.out.println(a + " 이 가장 큰 수이다.");
			}else {//c가 큼
				System.out.println(c + " 이 가장 큰 수 이다.");
			}
		}else {//b가 큼
			if(b>c) {//b가 큼
				System.out.println(b+ " 이 가장 큰 수 이다.");
			
			}else {//c가 큼
				System.out.println(c + " 이 가장 큰 수 이다.");
			
		}
	}
	
	}
}
