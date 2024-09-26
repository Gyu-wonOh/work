
public class OperatorExercise {

	public static void main(String[] args) {
//		다음 연산자를 이용한 예제를 쳐보고 결과를 확인해 보자.
//		덧셈 (+):
//		int a = 5; 
//		int b = 3; 
//		int result = a + b; // 5 + 3 = 8
//
//		System.out.println(result);
		int a = 5;
		int b = 3;
		int result = a + b ; // 5 + 3 = 8
		
		System.out.println(result);
	
//		곱셈 (*):
//		int a = 5; 
//		int b = 3; 
//		int result = a * b; // 5 * 3 = 15
//		System.out.println(result);;

		a = 5;
		b = 3;
		result = a*b; // 5*3 = 15
		
		System.out.println(result);
		
//		나눗셈 (/): 
//		int a = 15; 
//		int b = 3; 
//		int result = a / b; // 15 / 3 = 5
//		System.out.println(result);
		a = 15;
		b= 3 ;
		result = a/b; // 15/3 = 5
		System.out.println(result);
		
//		나머지 (%):
//		int a = 11; 
//		int b = 4; 
//		int result = a % b; // 15 -> 3
//		System.out.println(result);

		a = 11;
		b = 4 ;
		result = a % b; // a % b = 3
		System.out.println(result);

//		컴퓨터 프로그래밍에서 비교 연산자는 두 개의 값을 비교하는 연산자입니다. 비교 연산자를 사용하면 조건문과 반복문에서 원하는 조건을 만족하는지 여부를 판단할 수 있습니다. 같음 (==):
//		int a = 5; 
//		int b = 3; 
//		boolean result = (a == b); // false
//		System.out.println(result);
		
		a = 5;
		b = 3;
		boolean result1 = (a == b); //false
		System.out.println (result1);
		
		
//		같지 않음 (!=):
//		int a = 5; 
//		int b = 3; 
//		boolean result = (a != b); // true
//		System.out.println(result);

		a=5;
		b=3;
		boolean result2 = (a != b); //true
		System.out.println(result2);
				
//		크거나 같음 (>=):
//		int a = 5; 
//		int b = 3; 
//		boolean result = (a >= b); // true
//		System.out.println(result);

		a = 5;
		b = 3;
		boolean result3 = (a >= b);//true
		System.out.println(result3);
		
//		작거나 같음 (<=):
//		int a = 5;
//		int b = 3; 
//		boolean result = (a <= b); // false
//		System.out.println(result);

		a = 5;
		b = 3;
		boolean result4 = (a<= b); // false
		System.out.println(a<=b);
		
//		크다 (>):
//		int a = 5; 
//		int b = 3; 
//		boolean result = (a > b); // true
//		System.out.println(result);

		a = 5;
		b = 3;
		boolean result5 = (a>b);
		System.out.println(result5);
		
//		작다 (<):
//		int a = 5;
//		int b = 3; 
//		bool result = (a < b); // false
//		System.out.println(result);

		a=5;
		b=3;
		boolean result6 = (a<b);//false
		
		System.out.println(result6);
		
//		논리 곱(&&:and): 두조건이 true일때만 ture를 생성하는 연산자. 
//		boolean a = true; 
//		boolean b = false; 
//		boolean result = (a && b); // false
//		System.out.println(result);
//		boolean a = true;
//		boolean b = true; 
//		bool result = (a && b); // true
//		System.out.println(result);

		boolean a1 = true;
		boolean b1 = false;
		boolean result7 = (a1 && b1);//false
		System.out.println(result7);
		
		a1 = true;
		b1 = true;
		result7 = (a1 && b1); // true
		
		System.out.println(result7);
		
//		논리 합(||): 두 조건중 하나라도 true 일때만 true를 생성한다.
//		boolean a = true;
//		boolean b = false;
//		boolean result = (a || b); // true
//		System.out.println(result);

		a1 = true;
		b1 = false;
		result7 = (a1 || b1);//true
		System.out.println(result7);
		
//		논리 부정(!):true를 false로 false를 true로 반전 한다.
//		boolean a = true;
//		boolean result = !a; // false
//		System.out.println(result);

		a1 = true;
		result7 = !a1; // false
		
		System.out.println(result7);
		
//		응용결과:
//		boolean a = (23 > 11); //true
//		boolean b = (23 < 11); //false
//		boolean result = a&&b ;//false
//		System.out.println(result);//false
//		System.out.println((23 > 11)||(23 < 11));//false->true
		a1 = (23 > 11);//true
		b1 = (23 < 11);//false
		result7 = a1 && b1; //false
		System.out.println(result7);
		System.out.println((23 > 11)||(23 < 11));//true
		
//		대입 연산자(=):
//		int a = 5; 
//		int b = a;
//		System.out.println(a); 
//		System.out.println(b);
		a = 5;
		b = a;
		System.out.println(a);
		System.out.println(b);
		
//		덧셈 후 대입(+=):
//		int a = 5; 
//		a += 3; // a = a + 3;
//		System.out.println(a);
		a = 5;
		a += 3; //a= a+3;
		System.out.println(a);
		
//		뺄셈 후 대입(-=):
//		int a = 5; 
//		a -= 3; // a = a - 3;
//		System.out.println(a);
		a = 5;
		a-= 3; // a = a-3;
		System.out.println(a);
				
//		곱셈 후 대입(*=):
//		int a = 5; 
//		a *= 3; // a = a * 3;
//		System.out.println(a);

		a= 5;
		a*=3; // a = a*3;
		System.out.println(a);
		
		
//		나눗셈 후 대입(/=):
//
//		int a = 5; 
//		a /= 2; // a = a / 2;
//		System.out.println(a);

		a = 5;
		a /= 2; // a= a/2;
		System.out.println(a);
		
//		증가 연산자(++):변수의 값을 1씩 증가시킨다.
//		int a = 5; a++; // a = a + 1; System.out.println(a);
		a = 5;
		a++; // a = a+1;
		System.out.println(a);
		
//		감소 연산자(--):변수의 값을 1씩 감소시킨다.
//		int a = 5; 
//		a--; // a = a - 1; 
//		System.out.println(a);

		a = 5;
		a--; //a = a-1;
		System.out.println(a);
		
//		전위 증가 연산자(++a):
//		int a = 5; int b = ++a; // a = a + 1, b = a;
//		System.out.println(a); System.out.println(b); //6, 6
		a = 5;
		b = ++a; // a= a+1 , b = a
		System.out.println(a);//6
		System.out.println(b);//6
//		후위 증가 연산자(a++):
//		int a = 5; 
//		int b = a++; // b = a, a = a + 1;
//		System.out.println(a);  System.out.println(b); //6 5
		int a2=5;
		//+//a2=6
		b= ++a2;//b = a2, a2 = a2 + 1; 
		System.out.println(a2);
		
		int a3=5;
		b= a3++;//b = a2, a2 = a2 + 1; 
		//+ ,a2=6
		System.out.println(a3);//6
		System.out.println(b);//5
		
		a=5;
		b=6;
		int sum = a + b;
		a= 7;
		System.out.println(sum + ":" + a + ":"+b);
		System.out.println(a);
		System.out.println(b);
		sum = a+b;
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
		
		//논리연산자
		//1.
		boolean isRaining = true; 
		boolean notRaining = !isRaining;
		System.out.println(notRaining);
		//2.
		boolean hasSubscripction =false;
		boolean canWatchMovie = !hasSubscripction;
		System.out.println(canWatchMovie);
		//3.
		boolean isRaining2 =true;
		boolean hasUmbralla = true;
		boolean isWorkday = false;
		boolean goOutside = (isRaining2 && hasUmbralla) ||!isWorkday;
		System.out.println("Can I go outside?" + goOutside);
		
	}

}
