
public class Operator_2 {

	public static void main(String[] args) {
		//삼항연산자

		int b1= 5;
		b1=(true)?3+3:3+4;
		System.out.println(b1);//6
		
		//예제
		int number = 15;
		String result =(number >= 0)?"양수":"음수";
		System.out.println(number + "은(는)" + result + "입니다.");
		int a1 = (int)10_000_000_000l;
		System.out.println(a1);
		int a2 = 2_100_000_000;
		System.out.println(a2);
		
		//형변환
		
		//문제 1.
		boolean b = true;
		int i = 1;
		short s= 2;
		char c='a';
		float f = 1.234f; //1번 float는 f식별자가 필요
		
		int s2 = s+ c;// 2번 short+ char = int 이다. 같은 자료형이 아니기에 에러가 발생할 수 있다.
		int s3 = s + s;//3번 short + short = int 이다. 같은 자료형이 아니기에 에러가 발생할 수 있다.
		int c2 = c + s;//4번 char + short =int 이다. 같은 자료형이 아니기에 에러가 발생할 수 있다.
		int i2 = c + s; //5번 같은 자료형이 아니기에 에러가 발생할 수 있다.
		//int i3 = b + i; 6번 boolean 자료형은 문자열 자료형만 연산이 가능
		
		//문제 2.
		System.out.println(3+3+ "hello");//6hello
//		System.out.println(3*"hello");// 에러발생
		System.out.println("hello" + 4 + 4);//hello44
		
		 double d = Double.parseDouble("123.3");
		System.out.println(d);
		
		//문제 4.
		String name = "홍길동";
		int age = 5;
		System.out.println("이름은 " + name + "나이는 " + age + " 입니다.");
		
		//문제 6.
		System.out.println(2.0+1.0/2.0);
		System.out.println(4.2/2+1);
		System.out.println(5+4/5);
		System.out.println(1+2/3d);
		System.out.println(1+2/3d);
		
		System.out.println(10);
		System.out.println(11);
		System.out.println(0XB);
		System.out.println(013);
		System.out.println(012);
		
		
		
		
	}

}
