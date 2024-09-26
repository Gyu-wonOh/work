
public class Variation {

	public static void main(String[] args) {
		int a;
		a = 10;
		double d;
		d = 10.1;
		String s;
		s ="문자열";

		//변수형 연습문제
	
		//boolean
		boolean b1 = true; 
		System.out.println(b1); //true
		boolean b2 = false;
		System.out.println(b2);
		
		System.out.println("________________");
	
		//문자형 변수
		char c1 = 'A';
		char c2 = 'B';
		System.out.println(c1); //A
		System.out.println(c2); //B
		System.out.println(c1 + c2); //131
		
		System.out.println("________________");
		
		//정수형 변수
		// byte
		byte a1 =10; 
		byte a2; 
		a2 =11;
		System.out.println(a1); // 10
		System.out.println(a2); // 11
		System.out.println(a1 + a2); // 21
		System.out.println(a1 + 1); // 11
		
		System.out.println("________________");
		
		//short
		short s1 = 10;
		short s2 = 11;
		System.out.println(s1); // 10
		System.out.println(s2); // 11
		System.out.println(s1 +s2); //21
		System.out.println(s1 + 1); //11
		
		System.out.println("________________");
		
		//int
		int i1 = 10;
		int i2;
		i2 = 11;
		System.out.println(i1); //10
		System.out.println(i2); //11
		System.out.println(i1 +i2); //21
		System.out.println(i1 +1); //11
		
		System.out.println("________________");
		
		//long
		long l1 = 10L;
		long l2 = 11l;
		System.out.println(l1); //10
		System.out.println(l2); //11
		System.out.println(l1 +l2); //21
		System.out.println(l1 +1); //11
		
		System.out.println("________________");
		
		//float
		float k1 = 10.23f; 
		float k2 = 11.f;
		System.out.println(k1); //10.23
		System.out.println(k2); //11.0
		System.out.println(k1 +k2); //21.23
		System.out.println(k1 +1); //11.23
		
		System.out.println("________________");
		
		//double
		double d1 = 10.23;
		double d2 = 11.94;
		System.out.println(d1); // 10.23
		System.out.println(d2); // 11.94
		System.out.println(d1 + d2); // 22.17
		System.out.println(d1 + 1); //11.23
		
		String st1 = "Hello";
		String st2 = "World";
		System.out.println(st1); //Hello
		System.out.println(st1 +"world"); //HelloWorld
		System.out.println(st1 + st2);//HelloWorld
		st1= "new World";
		String st3 = st1 + st2;
		System.out.println(st3);

		System.out.println("________________");
		
		// 변수 연습문제 5번
		
		System.out.println("변수 연습문제 5번");
		
		int z = 15;
		z = z + 15;
		System.out.println(z);
		
	}

}
