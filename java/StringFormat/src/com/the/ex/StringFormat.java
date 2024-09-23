package com.the.ex;

public class StringFormat {

	public static void main(String[] args) {

		String str1 = "홍길동";
		String str2 = String.format("이름 : %s", str1);
		String str3 ="이름 : "+str1;
		System.out.println(String.format("이름 : %s",str1));
		System.out.println(str2);
		System.out.println(str3);
		
		//예제
		str1=String.format("안녕 내이름은 %s이고 사는 곳은 %s", "홍길동", "대전");
		System.out.println(str1);
		
		str1 = String.format("안녕 내이름은 %s이고 사는 곳은 %s 다니는"+"학교는 %s 입니다.","홍길동","대전", "휴먼");
		System.out.println(str1);
		
		str1=String.format("나이는 %d", 20);
		System.out.println(str1);
		//%s는 문자열
		//%d는 정수
		//%f는 실수
		str1 = String.format("나이는 %d,키는 %f", 20,170.3);
		System.out.println(str1);
		
		//예제
		System.out.println(String.format(":%f:", 3.141592));
		System.out.println(String.format(":%+f:", 3.141592));
		System.out.println(String.format(":%10f:", 3.141592));
		System.out.println(String.format(":%10.3f:", 3.141592));
		System.out.println(String.format(":%-10.3f:", 3.141592));
		System.out.println(String.format(":%%f:", 3.141592));
		
		//연습문제 
		//메소드와 매개변수란?
		//메소드는 미리 만들어 놓은 코드 블록을 호출해서 사용하는 것을 의미한다.
		//매개변수는 메소드에서 필요한 기능을 실행할 때 필요한 데이터를 넘겨줄 때 사용한다.
		//메소드 소괄호 안에 ,로 구분하여 넘겨주는 여러 데이터를 말한다.
		//String.format()은 어디에 사용하는 메소드 인지 기술하고 %s,%d,%f에 매칭되는 자료형은 무엇인지 기술하시오.
		//매개변수를 사용하여 새로운 문자열을 만들어 주는 메소드이다.
		// %s는 문자열 %d는 정수형 %f는 실수형과 매칭된다.
		
		//  3. int age=156, String name = “hong”, double height=175.3 다음 데이터와 String.format를 이용해서 문자열로 만들어 출력해 보자.
			int age = 156;
			String name ="hong";
			double height=175.3;
			System.out.println(String.format("내 이름은 %s이고 나이는 %d , 키는 %5.1f cm 입니다.", name,age,height));
			
		//  4. 사용자로부터 2개의 정수를 받아서 첫번째 정수를 두번째 정수로 나누었을때의 몫과 나머지를 계산하는 프로그램을 작성하시오. ex) 몫은 2 이고, 나머지는 1이다.
			java.util.Scanner sc =new java.util.Scanner(System.in);
			System.out.println("2개의 정수 a,b 입력해주세요 입력 시 a/b 를 수행 후 몫과 나머지를 산출합니다.");
			int a = Integer.parseInt(sc.nextLine());
			int b = Integer.parseInt(sc.nextLine());
			int result = a / b;
			int remainder = a % b;
			System.out.println("몫은 "+ result + " 이고, 나머지는" + remainder + " 이다.");
			
		//  5. 3자리 숫자를 입력하여 각자리의 숫자를 출력하시오. 힌트) %연산자와 /연산자를 이용하여 만들수 있다. 423를 100으로 나누면 몫은 4고 나머지는 23이다. 23를 10으로 나눈 몫은 2이고 나머지는 3이다. ex)423를 입력하였다면 백의 자리:4 십의 자리:2 일의 자리:3 이 출력 되도록 만들어 보자.
			System.out.println("3자리 숫자를 입력하세요.");
			a= Integer.parseInt(sc.nextLine());
			b= a / 100;
			int c= a % 100;
			int d = c % 10;
			System.out.println( a+" 를 입력하면 백의 자리:" + b +" 십의 자리 : " + c + "일의 자리 : " + d);
			
		//	6. 두점을 입력 받아 두점의 거리를 구하는 프로그램을 만들어보자. 두점의 거리를 구하는 방법을 웹에서 검색해보자. 힌트) Math.sqrt(25)=5 이다. x제곱은 x*x 이다.
			System.out.println("거리를 구하고자 하는 점의 좌표를 입력하세요 ex) (a,b), (c,d)");
			a = Integer.parseInt(sc.nextLine());
			b = Integer.parseInt(sc.nextLine());
			c = Integer.parseInt(sc.nextLine());
			d = Integer.parseInt(sc.nextLine());
			double dd= Math.sqrt((a*a)-(c*c))+Math.sqrt((b*b)-(d*d));
			System.out.println(String.format("두 점 사이의 거리는 %10.5f 입니다.",dd));
	}

}
