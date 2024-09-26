package com.the.ex;

import java.util.*;
import java.time.*;

public class ConditonalStatementAndBoolean {

	public static void main(String[] args) {

		/*
		 * // 1. AND연산자(&&)를 이용한 예제: int x = 4; int y = 10; if (x > 0 && y > 0) {
		 * System.out.println("x와 y는 모두 양수입니다."); } // 2.OR 연산자(||)를 이용한 예제 x = 5; y =
		 * -12; if (x > 0 || y > 0) { System.out.println("x와 y중에 적어도 하나는 양수입니다."); } //
		 * 3.NOT 연산자(!)를 이용한 예제 boolean isTrue = true; if (!isTrue) {
		 * System.out.println("isTrue는 false입니다."); } else {
		 * System.out.println("isTrue는 True입니다."); } // AND 연산자(&&)와 OR 연산자(||)를 함께 이용한
		 * 예제: // 조건식이 3개 이상 되고 &&와 || 가 섞여 있으면 반드시 괄호를 사용해서 기술 하는 습관을 가지자 // 두연산자는
		 * 우선순위가 달라 생각과 다른 결과를 얻을 수 있다. x = 5; y = 10; if ((x > 0 && y > 0) || (x < 0 &&
		 * y < 0)) { System.out.println("x와 y는 둘 다 양수이거나 둘 다 음수입니다."); } else {
		 * System.out.println("x와 y는 서로 다른 부호 입니다."); } // 5. NOT 연산자(!)를 이용한 문자열 비교 예제:
		 * boolean b = true;
		 * 
		 * if (!b) { System.out.println("true입니다."); } else {
		 * System.out.println("false입니다."); } // 6. int i = 5; if (!(i < 3)) {
		 * System.out.println("true입니다."); } else { System.out.println("false입니다."); }
		 * // 7.삼항 연산자(?:)를 이용한 예제: x = 10; y = x > 5 ? 20 : 30;
		 * System.out.println("y = " + y);
		 * 
		 * // 만약 a가 4보다 크고 a>4 // b가 3보다 크면 b>3 // 합격 a>4&&b>3 // 아니면 불합격을 출력하는 프로그램을 구현
		 * int a = 5; int b1 = 4; if (a > 4 && b1 > 3) { System.out.println("합격"); }
		 * else { System.out.println("불합격"); } // 1번 // x>14 if (x > 14) {
		 * System.out.println(true); } else { System.out.println(false); } //
		 * x<=12||x>22 if (x <= 12 || x > 22) { System.out.println(true); } else {
		 * System.out.println(false); } // x>5 && x<=9 if (x > 5 && x <= 9) {
		 * System.out.println(true); } else { System.out.println(false); } // 2번 //
		 * 부정연산자 미사용 // x<14 if (x < 14) { System.out.println(true); } else {
		 * System.out.println(false); } // x>12 && x<22 if (x > 12 && x < 22) {
		 * System.out.println(true); } else { System.out.println(false); } // x<=5||x>9
		 * if (x <= 5 || x > 9) { System.out.println(true); } else {
		 * System.out.println(false); } // 3. 입력받은 수가 3의 배수 이거나 7의 배수이면=>x%3==0||x%7==0
		 * // ‘3또는 7의 배수’가 출력되고, // 2의 배수도 되고 5의 배수도 되면 =>x%2==0 && x%5==0 // ‘2와 5의
		 * 배수’를 출력하고 // 두가지 경우 다 만족하면 2가지 다 출력하는 프로그램을 만들어 보자. Scanner sc = new
		 * Scanner(System.in); System.out.println("숫자를 입력하세요."); x =
		 * Integer.parseInt(sc.nextLine()); if ((x % 2 == 0 && x % 5 == 0)) {// 2와 5의 배수
		 * 
		 * if (x % 3 == 0 || x % 7 == 0) { System.out.println("2와 5의 배수");
		 * System.out.println("3또는 7의 배수"); } else { System.out.println("2와 5의 배수"); }
		 * 
		 * } else { if (x % 3 == 0 || x % 7 == 0) { System.out.println("3또는 7의 배수"); }
		 * else { System.out.println("2,3,5,7 중 어느 배수도 아니다."); } } // 4-1번 왼쪽 이미지는 하나의
		 * 점이 x,y좌표를 가질때 위치할 수 있는 장소를 4개로 구분한 것이다. // x,y가 모두 양수이면 2번 위치에 점이 존재하게 될것이고
		 * // 모두 음수이면 4번위치에 점이 위치하게 될것이다. // 해당 점의 좌표를 입력받아 해당 점이 어느 위치에 있는지 출력해 보자. //
		 * x,y축 위에 있을 때는 x,y축 위에 있다고 출력하면 된다.
		 * System.out.println("위치를 확인할 좌표(a,b)를 입력하세요."); x =
		 * Integer.parseInt(sc.nextLine()); y = Integer.parseInt(sc.nextLine()); if (x >
		 * 0 && y > 0) { System.out.println("2번위치"); } else if (x < 0 && y < 0) {
		 * System.out.println("4번 위치"); } else if (x > 0 && y < 0) {
		 * System.out.println("3번 위치"); } else if (x < 0 && y > 0) {
		 * System.out.println("1번 위치"); } // 4-2번 버스요금계산하는 프로그램을 구현해보자. // 15세 이하는 1300원
		 * 초과는 1600원이고 // 버스카드로 결제하면 100원 할인해 준다. // 문자열을 boolean형으로 변경하는 방법은 다음과 같다. //
		 * Boolean a= Boolean.parseBoolean("true"); // 입력: 16엔터 true엔터 // 출력: 버스요금은
		 * 1500원 입니다. System.out.print("나이를 입력하세요. : "); int age =
		 * Integer.parseInt(sc.nextLine());
		 * System.out.print("버스카드를 사용하나요?(True or False)"); boolean busCard =
		 * Boolean.parseBoolean(sc.nextLine()); if (age > 15 && busCard) {
		 * System.out.println("버스 요금은 1500원 입니다."); } else if (age <= 15 && busCard) {
		 * System.out.println("버스 요금은 1300원 입니다."); } else if (age > 15 && !busCard) {
		 * System.out.println("버스 요금은 1600원 입니다."); } else {
		 * System.out.println("버스 요금은 1400원 입니다."); } // 5. 다음을 구현하려면 어떤문을 사용해야 하는지 고민해
		 * 보고 사용자 입력을 받아 결과가 출력되도록 구현해 보자. (if elseif // ifelse 논리연산자)
		 * 
		 * // a. 밥을 먹었으면 ‘밥을 먹었음’ 이 출력 되고 밥을 먹지 않았으면 아무것도 출력되지 않음. boolean rice = true;
		 * if (rice == true) { System.out.println("밥을 먹었음"); }
		 * 
		 * // b. 빵을 먹었으면 ‘빵을 먹었음’이 출력되고 빵을 먹지 않았으면 ‘밥을 먹었음’이 출력됨 boolean bread = true;
		 * if (bread) { System.out.println("빵을 먹었음"); } else {
		 * System.out.println("밥을 먹었음"); } // c. 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘빵을 먹었음’이
		 * 출력되도록 구현. rice = true; if (rice) { System.out.println("밥을 먹었음"); } else {
		 * System.out.println("빵을 먹었음"); } // d. 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘아무것도 안먹었음’이
		 * 출력 되도록 구현. if (rice == true) { System.out.println("밥을 먹었음"); } else {
		 * System.out.println("아무것도 안먹었음"); } // e. 식사로 ‘밥’과 ‘빵’이 있고 // 후식으로 국,우유,
		 * 아이스크림, 커피가 있는데 // 밥을 먹으면 국과 아이스크림중 하나를 // 빵을 먹으면 우유 커피 중 하나를 후식으로 먹을수 있다.
		 * System.out.println("아침 식사로 무엇을 드시겠습니까? 밥(True),빵(False)"); boolean meal =
		 * true;// true - 밥 false -빵
		 * 
		 * if (meal) { System.out.println("후식으로 무엇을 드시겠습니까? 국(True),아이스크림(False) ");
		 * 
		 * } else { System.out.println("후식으로 무엇을 드시겠습니까? 우유(True),커피(False)");
		 * 
		 * } // 6. 다음과 같이 기술하면 오늘의 요일이 i에 숫자로 들어간다. // i가 7일 경우 일요일이고 월화수목금토일은 1234567과
		 * 같다. // i값을 가지고 오늘의 요일을 출력하는 프로그램을 만들어 보자. // 빨간줄에 마우스를 올리면 임포트 할 패키지가 뜬다. //
		 * 잘확인해서 해당 클래스를 클릭해서 자동으로 임포트하자.
		 * 
		 * LocalDateTime now = LocalDateTime.now(); System.out.println(now);// 현재시간 출력
		 * DayOfWeek dayOfWeek = now.getDayOfWeek();
		 * 
		 * // 1 (월요일)부터 7 (일요일)까지의 값을 가집니다. i = dayOfWeek.getValue();
		 * System.out.println(i); switch (i) { case 1: System.out.println("월"); break;
		 * case 2: System.out.println("화"); break; case 3: System.out.println("수");
		 * break; case 4: System.out.println("목"); break; case 5:
		 * System.out.println("금"); break; case 6: System.out.println("토"); break; case
		 * 7: System.out.println("일"); break; default: } // 7.한국사이즈를 입력받아 미국사이즈로 출력하시오.
		 * //Size s ; 90<=s<=95=> s>=90&&s<=95 //M<=100 L<=105 XL<=120 XXL<=110
		 * System.out.print("한국 사이즈를 입력하세요:"); int size =
		 * Integer.parseInt(sc.nextLine()); if(size>=90&&size<=95) {
		 * System.out.println("Size S"); }else if(size<=100){
		 * System.out.println("Size M"); }else if(size<=105){
		 * System.out.println("Size L"); }else if(size<=120){
		 * System.out.println("Size XL"); }else if(size>=110){
		 * System.out.println("Size XXL"); }
		 */
		// 8.java,html,db과목의 점수를 입력받아.
		// 평균이 60점 이상이면 합격, 평균이 60점 미만이면 불합격,
		// 40점 이하인 과목이 하나라도 있으면 과락이 출력되도록 프로그램을 구현해 보자.
		// 최종결과 화면은 다음과 같다.
		// 국어 35 과락, 수학 10과락 또는 총점 40로 60점미만 불합격 또는 총점 60이상 합격이 출력된다.
		final int CutLine = 60;
		final int Min = 40;
		java.util.Scanner scanner1 = new Scanner(System.in);
		System.out.println("합격 여부 조회 페이지 입니다.");
		System.out.println("각 과목의 점수를 입력하세요");
		System.out.print("java 점수를 입력하세요");
		int java = Integer.parseInt(scanner1.nextLine());
		System.out.print("html 점수를 입력하세요");
		int html = Integer.parseInt(scanner1.nextLine());
		System.out.print("db 점수를 입력하세요");
		int db = Integer.parseInt(scanner1.nextLine());
		int avg = (java + html + db) / 3;
		if (avg >= CutLine && java >= Min && html >= Min && db >= Min) {
			System.out.println("java: " + java + "html: " + html + "db :" + db + "\n평균이 +" + CutLine + " 이상으로 합격 입니다.");
		} else {
			if (java <= Min) {
				System.out.println(
						"java: " + java + "과락" + "html: " + html + "db :" + db + "\n평균이 +" + avg + " 점 으로 불합격 입니다.");
			} else if (html <= Min) {
				System.out.println(
						"java: " + java + "html: " + html + "과락" + "db :" + db + "\n평균이 +" + avg + " 점 으로 불합격 입니다.");
			} else if (db <= Min) {
				System.out.println(
						"java: " + java + "html: " + html + "db :" + "과락" + db + "\n평균이 +" + avg + " 점 으로 불합격 입니다.");
			} else if (avg <= CutLine) {
				System.out.println(avg + " 로" + CutLine + "점 미만");
			}
			System.out.println("불합격");
		}
		// 9번 비만도 산출식 =(몸무게 /(키-100))*100
		System.out.println("비만도 조회 페이지 입니다.");
		System.out.println("키(cm)를 입력하세요");
		int x = Integer.parseInt(scanner1.nextLine());
		System.out.print("몸무게(kg)를 입력하세요");
		int y = Integer.parseInt(scanner1.nextLine());
		int bmi = (int) (y / ((100 - x) * 0.9)) * 100;// 비만도
		int age = 1;// 성인:1 or 초중고교생:0
		switch (age) {
		case 1:
			if (bmi < 100) {
				System.out.println("체중미달");
			} else if (bmi < 110) {
				System.out.println("정상");
			} else if (bmi < 120) {
				System.out.println("과체중");
			} else if (bmi < 150) {
				System.out.println("비만");
			} else if (bmi >= 150) {
				System.out.println("고도비만");
			}
			break;
		case 0:
			if (bmi < 95) {
				System.out.println("체중미달");
			} else if (bmi < 120) {
				System.out.println("정상");
			} else if (bmi < 130) {
				System.out.println("과체중");
			} else if (bmi < 150) {
				System.out.println("비만");
			} else if (bmi >= 150) {
				System.out.println("고도비만");

			}
			break;
		}
		// 10 신체사이즈중 하나를 입력받아 해당 미국사이즈와 한국사이즈를 출력하시오.
		// 겹치는 부분은 본인이 원하는 쪽으로 해석 해서 출력하자. /
		// 명확하지 않은 경계는 본인이 적절히 결정하자.
		// Size s ; 90<=s<=95=> s>=90&&s<=95 //M<=100 L<=105 XL<=120 XXL<=110
		System.out.println("사이즈 알고 있는 곳을 입력하세요" + "\n목둘레 , 가슴둘레, 팔길이, 허리둘레");
		String body = scanner1.nextLine();
		System.out.println("신체 사이즈를 입력하세요:");
		int size = Integer.parseInt(scanner1.nextLine());
		switch (body) {
		case "목둘레":
			if (size >= 33 && size <= 35) {
				System.out.println("Size S (90~95)");
			} else if (size <= 37) {
				System.out.println("Size M(95~100)");
			} else if (size <= 39) {
				System.out.println("Size L(100~105)");
			} else if (size >= 41 && size <= 42) {
				System.out.println("Size XL(105~120)");
			} else if (size <= 45) {
				System.out.println("Size XXL(110이상)");
			}
			break;
		case "가슴둘레":
			if (size >= 86 && size <= 91) {
				System.out.println("Size S (90~95)");
			} else if (size >= 96 && size <= 102) {
				System.out.println("Size M(95~100)");
			} else if (size >= 107 && size <= 112) {
				System.out.println("Size L(100~105)");
			} else if (size >= 117 && size <= 122) {
				System.out.println("Size XL(105~120)");
			} else if (size >= 127 && size <= 132) {
				System.out.println("Size XXL(110이상)");
			}
			break;
		case "팔길이":
			if (size >= 78 && size <= 81) {
				System.out.println("Size S(90~95)");
			} else if (size <= 84) {
				System.out.println("Size M(95~100)");
			} else if (size <= 86) {
				System.out.println("Size L(100~105)");
			} else if (size <= 89) {
				System.out.println("Size XL(105~120)");
			} else if (size <= 91) {
				System.out.println("Size XXL(110이상)");
			}
			break;
		case "허리둘레":
			if (size >= 28 && size <= 29) {
				System.out.println("Size S(90~95)");
			} else if (size >= 30 && size <= 31) {
				System.out.println("Size M(95~100)");
			} else if (size >= 32 && size <= 34) {
				System.out.println("Size L(100~105)");
			} else if (size >= 34 && size <= 37) {
				System.out.println("Size XL(105~120)");
			} else if (size >= 38 && size <= 40) {
				System.out.println("Size XXL(110이상)");
			}
			break;
		}
		// 11.다음과 같이 실행되는 계산기 프로그램을 만들어보자.
		// 첫번째수 입력>>5, 연산자선택 1. + 2. - 3. * 4. / >>3 두번째수 입력>>12
		// 5*12=60 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers:");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.print("Enter an operation (+,-,*,/): ");
		String operator = sc.nextLine();
		System.out.print("Enter numbers:");
		double num2 = Double.parseDouble(sc.nextLine());

		switch (operator) {
		case "+":
			System.out.println("Result: " + (num1 + num2));
			break;
		case "-":
			System.out.println("Result: " + (num1 - num2));
			break;
		case "*":
			System.out.println("Result: " + (num1 * num2));
		case "/":
			if (num2 != 0) {
				System.out.println("Result: " + (num1 / num2));
			} else {
				System.out.println("Cannot divide by zero");
			}
		}
		// 12. 가위바위보 게임
		System.out.println("가위바위보를 입력하세요(가위-1/바위-2/보-3");
		double random = Math.random();
		int user = Integer.parseInt(scanner1.nextLine());
		int com = (int) (random * 3 + 1);
		if (user == com) {
			System.out.println("비겼다");
		} else {
			if (user == ((com + 1) % 3)) {
				System.out.println("user가 이겼습니다.");
			} else {
				System.out.println("com이 이겼습니다.");
			}
		}
		// 12-1. 6~10사이의 램덤한 수를 만들어 보자. 총 수에 범위는 6,7,8,9,10 5개 이므로 랜덤 함수에 5를 곱하고 시작을 6부터
		// 하니 더하기 6를 하면 될 것이다. 제대로 동작하는지 확인해 보자.
		random = Math.random();
		x = (int) (random * 5 + 6);
		// 13. 1~45까지의 수를 랜덤하게 만들어보자.
		random = Math.random();
		x = (int) (random * 45 + 1);
		// 14. 가위,바위,보 문자열중 하나를 랜덤하게 화면에 출력하는 프로그램을 구현해보자.하나를 내는 것 처럼 구현 하려면 0,1,2 3개의
		// 수를 랜덤하게 리턴하게 만든 다음 가위,바위,보 3개에 1:1 매핑하면 된다.
		random = Math.random();
		x = (int) (random * 3);
		switch (x) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
		// 15 왼쪽표를 기본으로 본인이 낼 새금이 얼마인지 출력하는 프로그램을 구현해 보자. 만약에 본인이 번돈이 1600만원 이라면 1200만원은
		// 세율이 6%이고 나머지 400만원은 세율이 15%이다.
		java.util.Scanner sc2 = new java.util.Scanner(System.in);
		System.out.println("과세액 조회 프로그램입니다.\n본인의 연소득을 입력하세요 (ex)1000만원 =1000");
		double salary = Double.parseDouble(sc2.nextLine());
		double tax = 0;
		if (salary <= 1200) {
			tax = salary * 0.06;
		} else if (salary > 1200 && salary <= 4600) {
			tax = (1200 * 0.06) + ((salary - 1200) * 0.15);
		} else if (salary > 4600 && salary <= 8800) {
			tax = (1200 * 0.06) + (3400 * 0.15) + ((salary - 4600) * 0.24);
		} else if (salary > 8800 && salary <= 15000) {
			tax = (1200 * 0.06) + (3400 * 0.15) + (4200 * 0.24) + ((salary - 8800) * 0.35);
		} else if (salary > 15000 && salary <= 30000) {
			tax = (1200 * 0.06) + (3400 * 0.15) + (4200 * 0.24) + (6200 * 0.35) + ((salary - 15000) * 0.38);
		}else if (salary > 30000 && salary <= 50000 ) {
			tax = (1200 * 0.06) + (3400 * 0.15) + (4200 * 0.24) + (6200 * 0.35) + (15000 *0.38) + ((salary - 30000) * 0.4);
		}else if (salary > 50000) {
			tax = (1200 * 0.06) + (3400 * 0.15) + (4200 * 0.24) + (6200 * 0.35) + (15000 *0.38) + (20000 * 0.4)+((salary - 50000) * 0.42);
		}
		System.out.println("연소득액에 대한 세금은 "+ tax + "만원 입니다.");
	}

}
