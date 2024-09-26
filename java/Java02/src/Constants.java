
public class Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean 형태의 상수 데이터
		System.out.println(true);
		System.out.println(false);

		//int형 상수
		System.out.println(1992);
		System.out.println(30);
		
		//byte, short, int 형 상수
		
		System.out.println("byte: " + 127);
		System.out.println("short: " + 32767);
		System.out.println("short: " + 2147483647);
		
		//long형 상수
		//소문자 ㅣ또는 대문자L을 붙이면된다.
		System.out.println(10000000000L);
		System.out.println(10000000000l);
		
		//float형 상수
		//소수점이 있는 수 끝에 f,F를 붙여서 표시한다.
		System.out.println(3.14F);
		System.out.println(3.14f);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14);
		
		//double 형 상수
		System.out.println(20.145);
		System.out.println(0.145);
		System.out.println(.301);
		System.out.println(15.);	
		
		//문자형 상수
		//char 문자 상수 유닛코드 1개
		//문자상수는 보통 앞뒤에 ''를 사용하여 표시한다.
//		System,out.println(a); error a 에 대해서 약속된 바가 없다.
		System.out.println('a');
		//각 문자를 화면에 출력하려면 어떻게 해야 할까요.
		System.out.println('각');
		
		//문자열 상수
		System.out.println("문자열상수");
		
		//심볼릭 상수
		System.out.println(Math.PI);
		
		//연산 우선순위
		//1. 더하기(+)보다 곱하기(*)가 연산자 우선순위가 높다.
		//2. "문자열" + +모든 자료형" 은 문자열이 된다.
		//3. '+'는 연산자 우선순위에 따라 앞에서부터 2개씩 연산된다.
			
		System.out.println(5+6); // 11
		System.out.println(5+6*5); //35
		System.out.println(50 + "10");
		System.out.println(10 + 10 + "10");
		System.out.println("1010" + 10);
		
		
		
		
		
	}

}
