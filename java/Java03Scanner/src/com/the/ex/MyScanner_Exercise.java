package com.the.ex;

public class MyScanner_Exercise {
	public static void main(String[] args) {
		
//		5. 세로와 가로를 입력 받아 사각형의 넓이를 만드는 순서도와 프로그램을 만들어 보자.
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("사각형의 가로(a),세로(b)를 입력하세요.");
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		int square = a *b;
		System.out.println("사각형의 넓이는 " + square + "cm2 입니다.");
		
//		6. 세로 가로 높이를 입력 받아 사각기둥의 부피를 만드는 순서도와 프로그램을 만들어 보자.
		System.out.println("사각기둥의 가로(a), 세로(b), 높이(c)를 입력하세요");
		a = Integer.parseInt(scanner.nextLine());
		b = Integer.parseInt(scanner.nextLine());
		int c = Integer.parseInt(scanner.nextLine());
		int cubic = a * b *c;
		System.out.println("a*b*c = " + cubic );
		System.out.println("사각기둥의 부피는 " + cubic + "cm3 입니다." );
		
//		7. a 센치미터가 몇 미터 몇 센치인지 출력하는 프로그램을 구현 하시오. 100cm=1m
			System.out.println("미터 환산이 필요한 수를 입력하세요>>11");
			a = Integer.parseInt(scanner.nextLine());
			b = a/100;
			c = a-(b*100);
			System.out.println(a +"센치미터는 " + b+"미터"+ c+ "센치 입니다.");
//		8. 잔디의 가격은 1 제곱 미터에 a원일 때 윗변이 b,아래변이 c, 높이d인 사다리꼴에 잔디를 심으려면 얼마의 비용이 드는지 구하는 순서도를 작성하시오.
			System.out.println("사다리꼴의 아래 길이를 입력하세요 윗변이 b,아래변이 c, 높이d");
			b = Integer.parseInt(scanner.nextLine());
			c = Integer.parseInt(scanner.nextLine());
			int d = Integer.parseInt(scanner.nextLine());
			a = ((b+c)*d)/2;
			System.out.println("사다리꼴의 넓이는 0.5*(윗변(b)+ 아랫변(c))*높이ㅣ(d) 입니다.");
			System.out.println("따라서 사다리꼴의 넓이는" + a+"cm2 입니다.");
			System.out.println("하여 잔디의 가격은 " + a+ "원 입니다.");
			
//		9. 이름 나이 키를 입력받은 화면에 출력하는 프로그램을 작성해 보자. 출력결과: 당신의 이름은 홍길동 입니다.당신의 나이는 23입니다. 당신의 키는 165.5 입니다.
			System.out.println("당신의 이름, 나이, 키를 입력하세요.");
			String name = scanner.nextLine();
			int age =Integer.parseInt(scanner.nextLine());
			double height = Double.parseDouble(scanner.nextLine());
			System.out.println("당신의 이름은 " + name + " 입니다.");
			System.out.println("당신의 나이는 " + age + " 살 입니다.");
			System.out.println("당신의 키는 " + height + " cm 입니다.");
//		10. 두수를 입력받아 두수의 차를 출력하는 프로그램을 작성해보자.
			
			System.out.println("두 수의 차를 알고 싶은 수 a ,b를 입력하세요");
			a = Integer.parseInt(scanner.nextLine());
			b = Integer.parseInt(scanner.nextLine());
			int gap = a-b;
			System.out.println("a-b = " + gap + " 입니다.");
			
//		11. 다음은 국어,영어,수학 점수를 입력 받아 평균을 구하여 다음과 같이 출력하는 프로그램을 만들어보자. 출력결과: 국어:80 영어:70 수학:90 평균:80
			
			System.out.println("국어, 영어 ,수학 점수를 입력하세요.");
			a = Integer.parseInt(scanner.nextLine());
			b = Integer.parseInt(scanner.nextLine());
			c = Integer.parseInt(scanner.nextLine());
			int avg = (a+b+c)/3;
			System.out.println("국어: " + a + " 영어" + b +"수학:" + c+ "평균: "+ avg);
			
//		12. 키를 m로 소수점 2째 자리까지 입력받아 cm로 바꿔주는 프로그램을 만들어 보자.
			System.out.println("당신의 키(m)를 입력하세요.(소수점 둘째자리까지 입력하세요)");
			height= Double.parseDouble(scanner.nextLine());
			double height_cm = height *100;
			System.out.println("당신의 키는"+ height_cm + "(cm)입니다.");
			
//		13. 상자의 가로, 세로, 높이를 입력받아 부피를 구하는 프로그램을 만들어 보자.
			System.out.println("상자의 가로(a), 세로(b), 높이(c)를 입력하세요");
			a = Integer.parseInt(scanner.nextLine());
			b = Integer.parseInt(scanner.nextLine());
			c = Integer.parseInt(scanner.nextLine());
			cubic = a * b *c;
			System.out.println("a*b*c = " + cubic );
			System.out.println("상자의 부피는 " + cubic + "cm3 입니다." );
			
//		14. 연필 한박스에 12자루의 연필이 들어 있고 연필 1자루는 1000원 이다. 소비자가 몇 박스와 연필 몇자루를 구매할 것인지 입력 받아 지불해야 할 돈을 계산해주는 프로그램을 만들어 보자.
			System.out.println("구매할 연필 개수(자루)를 입력하세요.");
			a = Integer.parseInt(scanner.nextLine());
			int box = a/12;
			int pencil = a - box*12;
			int cost = a*1000;
			System.out.println("구매한 연필은 " + box +"박스" + pencil + " 자루이며 " + "가격은 " +cost+ " 원 입니다.");
		
		
	}
}
