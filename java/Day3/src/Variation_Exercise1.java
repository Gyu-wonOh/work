
public class Variation_Exercise1 {

	public static void main(String[] args) {
		
		//다음 예제를 확인해서 출력해보자
//		1.입력 
//		int a=10;
//		System.out.println(a);
//		출력
//		10
		int a = 10;
		System.out.println(a);//10
		System.out.println("------1번 끝--------");
		
//		2.입력 
//		int b=30;
//		System.out.println(b);
//		출력
//		?
		int b = 30;
		System.out.println(b); //30
		System.out.println("------2번 끝--------");
		
//		3.입력 
//		int b=30;
//		System.out.println(b+10);
//		출력
//		?
		System.out.println(b+10); //40
		System.out.println("------3번 끝--------");
//		​
//		4.입력 
//		int c=30;
//		System.out.println(c+c);
//		출력
//		?
		int c = 30;
		System.out.println(c + c); // 30 + 30 = 60
		System.out.println("------4번 끝--------");

//		5.입력  변수 hello에 50를 넣고 변수를 이용해서 80이 찍히도록 해보자
//		?
//		출력
//		80
		int hello = 50;
		System.out.println(hello + c);
		
		System.out.println("------5번 끝--------");
		
//		6.입력 
//		int   d=30;
//		d=60;
//		System.out.println(d);
//		출력
//		60
		int d = 30;
		d = 60;
		System.out.println(d);
		System.out.println("------6번 끝--------");

//		7.입력 
//		int   d=30;
//		d=60;
//		System.out.println(d);
//		출력
//		60
		int d1 = 30;
		d1 = 60;
		System.out.println(d1);//60
		System.out.println("------7번 끝--------");

//		6.입력 
//		int i1=22;
//		int i2=11;
//		int i3=33;
//		System.out.println(i1+i2+i3)
//		출력
//		66
		int i1 = 22;
		int i2 = 11;
		int i3 = 33;
		System.out.println(i1+i2+i3); //66

		System.out.println("------6번 끝--------");

//		7.입력 
//
//		?
//
//		System.out.println(world);
//
//		?
//
//		System.out.println(world+a);
//
//		출력
//
//		5
//
//		11

		int world = 5;
		int a_ = 6;
		
		System.out.println(world);
		System.out.println(world + a_);
		System.out.println("------7번 끝--------");

//		8.입력 
//		int world=5;
//		System.out.println(world+5);
//		출력
//		10
		int world1 =5;
		System.out.println(world1+5);//10
		System.out.println("------8번 끝--------");

//		9.입력 
//		int world=5;
//		System.out.println(“world”+5);
//		출력
//		world5

		int world2 = 5;
		System.out.println("world" + 5); // world5
		System.out.println("------9번 끝--------");

//		10.입력 
//		int world=5;
//		System.out.println(“world”+world);
//		출력
//		?
		int world3= 5;
		System.out.println("world"+world3); //worldworld
		System.out.println("------10번 끝--------");

//		11.입력
//		int a=5;
//		int b=6;
//		System.out.println(“a+b=”+a+b); 
//		출력
//		?
		int a3 = 5;
		int b1 = 6;
		System.out.println("a3+b1=" + a3+b1);// "a3+b1=" +a3 +b1= "a3+b1=5" +6 = "a3+b1=56"
		System.out.println("------11번 끝--------");

		
//		12.입력
//		int a=5;
//		int b=6;
//		System.out.println(“a+b=”+(a+b)); 
//		출력
//		?
		a = 5;
		b = 6;
		System.out.println("a+b="+ (a+b)); // “a+b=”+(a+b)= “a+b=”+(5+6) =“a+b=”+11 =a+b=11
		System.out.println("------12번 끝--------");

//		13.입력
//		int a=5;
//		System.out.println(a); 
//		a=3;
//		System.out.println(a); 
//		출력
//		5
//		3
		a =5;
		System.out.println(a);//5
		a=3;
		System.out.println(a);//3
		System.out.println("------13번 끝--------");

//		14.입력
//		int a=5;//처음 a를 선언할때는 자료형을 붙인다.
//		System.out.println(a); 
//		a=6;//기존  a를 사용할때는 자료형을 붙이지 않는다.
//		System.out.println(a); 
//		int b=5;
//		System.out.println(a+b); 
//		출력
//		?
		int a4 = 5;
		System.out.println(a4);//5
		a4 = 6;
		System.out.println(a4);//6
		int b2 = 5;
		System.out.println(a4 +b2);//11
		System.out.println("------14번 끝--------");
		
//		15.입력
//		int a=5;
//		a=6;
//		a=7;
//		a=8;
//		System.out.println(a); 
//		출력
//		?
		int a5 = 5;
		a5 = 6;
		a5 = 7;
		a5 = 8;
		System.out.println(a5);
		System.out.println("------15번 끝--------");
//		소수점이 있는 실수는 double사용 문자열은 String사용
//		16. 입력
//		int a=5;
//		double b=5.1;
//		String st= “hello”;
//		System.out.println(a+b+st); 
//		System.out.println(st+b+a); 
//		System.out.println(“a+b=”+(a+b)+st); 
//		출력
//		?
		int a6 = 5;
		double b3 = 5.1;
		String st ="hello";
		System.out.println(a6+b3+st);//10.1hello
		System.out.println(st+b3+a6);//hello5.15
		System.out.println("a+b=" + (a6+b3) + st);//a+b= 10.1hello
		System.out.println("------16번 끝--------");
		
//		17.입력
//		int a=5;
//		a=a+2;
//		System.out.println(a); 
//		출력
//		7
		int a7 = 5;
		a7 = a7 +2;
		System.out.println(a);// 7
		System.out.println("------17번 끝--------");
		
//		18.입력
//		int sum=0;
//		sum=sum+1;
//		System.out.println(sum); 

//		sum=sum+2;
//		System.out.println(sum); 

//		sum=sum+3;
//		System.out.println(sum); 

//		int a=5;
//		sum=a+5;
//		System.out.println(sum); 
//
//		a=7;
//		sum=sum+a;
//		System.out.println(sum); 
//		출력
//		1
//		3
//		6
//		10
//		?
		int sum=0;
		sum=sum+1;
		System.out.println(sum); //1

		sum=sum+2;
		System.out.println(sum); //3

		sum=sum+3;
		System.out.println(sum); //6

		int a8=5;
		sum=a8+5;
		System.out.println(sum); //10

		a8=7;
		sum=sum+a8;
		System.out.println(sum); //17
		

	}

}
