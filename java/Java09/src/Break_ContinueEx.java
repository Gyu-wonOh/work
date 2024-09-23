import java.util.Scanner;

public class Break_ContinueEx {

	public static void main(String[] args) {

		// 예제
		// 1.break를 사용 - while 문에서 5이상의 값을 출력하고 반복문을 종료하는 에제
//		int i = 0;
//		while (true) {
//			i++;
//			if (i >= 5) {
//				System.out.println(i);
//				break;
//			}
//		}
		// 2. break를 사용한 예제 - for문에서 4이상의 값을 출력하고 반복문을 종료하는 예제
//		for (int i = 0; i < 10; i++) {
//			if (i >= 4) {
//				System.out.println(i);
//				break;
//			}
//		}
		// 3. continue를 사용한 예제 - while 문에서 짝수를 출력하는 예제
//		int i = 0;
//		while(i<10) {
//			i++;
//			if(i%2 ==1) {
//				continue;
//			}
//			System.out.println(i);
//		}
		// 4.continue를 사용한 예제 - for 문에서 3의 배수를 출력하지 않는 예제
//		for(int i = 1; i<=10; i++) {
//			if(i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		// 5. break와 continue를 함께 사용한 예제 - while문에서 3의 배수를 출력하지
		// 않고,5이상의 값을 출력하고 반복문을 종료하는 예제
//		int i = 0;
//		while (true) {
//			i++;
//			if(i%3==0) {
//				continue;
//			}else if(i>=5) {
//				break;
//			}
//			System.out.println(i);
//		}
		// 6. break와 continue를 함께 사용한 예제 -
		// for 문에서 짝수를 출력하고, 6 이상의 값이 나오면 반복문을 종료하는 예제
//		for(int i = 0; i<=10; i++) {
//			if(i%2==1) {
//				continue;
//			}
//			System.out.println(i);
//			if(i>=6) {
//				break;
//			}
//		}
		// 7.break와 continue를 함께 사용한 예제 - while 문에서 2의 배수를
		// 출력하지 않고, 8 이상의 값을 출력하고 반복문을 종료하는 예제
//		int i = 0;
//		while(true) {
//			i++;
//			if(i%2==0) {
//				continue;
//			}
//			if(i>=8) {
//				System.out.println(i);
//				break;
//			}
//		}
//		for(int i =0; i<10;i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.println(i);
//		}
		// 연습문제
		// 1.1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지 누적한 결과값을
		// 순서대로 출력하시오.
		// 1:1 2:3 3:6 4:10 5:15 6:21 … 100이전의 총합들을
		// 다음과 같이 출력되면 된다.
		// for 문
//		int sum = 0;
//		for (int i = 1; i < 100; i++) {
//			sum = sum + i;
//			if (sum >= 100) {
//				break;
//			}
//			System.out.println(i + ": " + sum);
//		}
//		 while문
//		 int sum = 0;
//		 int count = 1;
//		 while(count<=100) {
//			 sum =sum+count;
//			 if(sum>=100) {
//				 break;
//			 }
//			 System.out.println(count+":"+sum);
//			 count++;
//			
//		 }
		// 2. 문자열과 숫자를 입력받아
		// 입력받은 문자열을 숫자만큼 출력하는 프로그램을 만들어 보자.
//		 Scanner sc =new Scanner(System.in);
//		 System.out.println("반복할 문자열을 입력하세요");
//		 String str = sc.nextLine();
//		 System.out.println("문자열을 반복할 횟수를 입력하세요");
//		 int r = Integer.parseInt(sc.nextLine());
//		 
//		 for (int i =1; i<= r; i++ ) {
//			 System.out.println(str);
//		 }
		// 3.입력 받은 두수 사이의 숫자들의 합을 구하는 프로그램을 만들어 보자.
//		 System.out.println("두수 사이의 숫자들의 합을 구하는 프로그램입니다.");
//		 System.out.println("두 수를 입력하세요");
//		 int a = Integer.parseInt(sc.nextLine());
//		 int b = Integer.parseInt(sc.nextLine());
//		 int sum = 0;
//		 int t;
//		 if(b>a) {
//			
//		}else if(b<a) {
//			t=a;
//			a=b;
//			b=t;
//		}
//			
//		for(int i = a; i<=b; i++) {
//			 sum= sum+i;
//		 }
//		System.out.println(a+"와"+b+" 사이의 합은 "+sum+ "입니다.");
		// 4. 두 수를 입력 받아
		// 첫 번째수 부터 시작하여 하나씩 카운트하여
		// 두 번째수 만큼 화면에 출력 하는 프로그램을 만든다.
		// 예)5 와 6을 입력 받으면 5부터 6개 5 6 7 8 9 10 이 화면에 출력 된다.
//		 Scanner sc =new Scanner(System.in);
//		 System.out.println("a부터 시작하여 b개의 숫자를 나열하는 프로그램입니다.");
//		 System.out.println("시작 숫자 a를 입력하세요. >>");
//		 int a = Integer.parseInt(sc.nextLine());
//		 System.out.println("나열하려는 숫자 개수 b를 입력하세요.>>");
//		 int b = Integer.parseInt(sc.nextLine());
//		
//		 for (int i = a ; i <= (a+b)-1; i++ ) {
//			 System.out.println(i);
//		 }
		// 5.사용자가 “종료”를 입력할때 까지 무한 반복하는 프로그램을 3가지 방법으로 구현하시오.
		// while문
//		String s ="";
//		Scanner sc = new Scanner(System.in);
//		while(!s.equals("종료")) {
//			System.out.println("명령어를 입력하세요>>");
//			s = sc.nextLine();
//			if(s.equals("종료")) {
//				break;
//			}
//		}System.out.println("프로그램을 종료합니다.");
//		 for문
//		String s ="";
//		Scanner sc = new Scanner(System.in);
//		for( ; ; ) {
//			System.out.println("명령어를 입력하세요>>");
//			s = sc.nextLine();
//			if(s.equals("종료")) {
//				break;
//			}
//		}
//		System.out.println("프로그램을 종료합니다.");
		
		// 6.100의 모든 약수를 구하시오.
//		for(int i=1;i<=100;i++) {
//			if (100%i==0) {
//				System.out.println(i);
//			}else {
//				continue;
//			}
//			
//		}
		// 8. 두 수를 입력받아
		// 두수의 공통된 약수를 모두 출력해 보자.
		// 0부터 하나씩 증가시키며 두수 모두 나눠지는 수를 출력하면 된다.
		// 출력된 수중에서 가장 큰수를 입력받은 두수의 최대공약수라고 한다.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 a를 입력하세요. >>");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("숫자 b를 입력하세요. >>");
//		int b = Integer.parseInt(sc.nextLine());
//		int t;
//		if(a>b) {
//			t = a;
//			a = b;
//			b = t;
//		}else if (a<b) {
//			
//		}
//		for (int i = 1; i <= b; i++) {
//			if (a % i == 0 && b % i == 0) {
//				System.out.println(i);
//			}
//		}
		 //while
//		int k=1;
//		while(k<=b) {
//			if(a%k==0&&b%k==0) {
//				System.out.println(k);
//			}
//			k++;
//		}
		// 9. 두수를 입력받아 두수의 최대 공약수를 구하는 프로그램을 만들어 보자.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 a를 입력하세요. >>");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("숫자 b를 입력하세요. >>");
//		int b = Integer.parseInt(sc.nextLine());
//		int t;
//		if(a>b) {
//			t = a;
//			a = b;
//			b = t;
//		}else if (a<b) {
//			
//		}
//		int math =0;
//		
//		int i;
//		for ( i = 1; i <= b; i++) {
//			if (a % i == 0 && b % i == 0) {
//			math = i;
//			}
//		}
//		System.out.println(math);
	
		// 10. 사용자에게 숫자를 하나 입력받아
		// 입력한 숫자들의 합이 100이 될때까지 계속입력을 받다가
		// 100이 넘으면
		// 최종 합산한 값을 출력하는 프로그램을 구현해 보자.
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int a = 0;
//		while (sum <= 100) {
//			System.out.println("숫자 a를 입력하세요. >>");
//			a = Integer.parseInt(sc.nextLine());
//			sum= sum+a;
//			if (sum >= 100) {
//				break;
//			}
//		}System.out.println(sum);
		// 11. 사용자에게 계속해서 숫자를 입력받아
		// 1~10사이의 숫자를 3번 입력 할 때 까지 반복한다.
		// 입력이 끝나면 잘못 입력한 회수와
		// 제대로 입력한 회수를 출력하고
		// 사용자가 제대로 입력한 총합을 출력하는 프로그램을 만들어 보자.
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int a = 0;
//		int count = 0;
//		int wrongCount=0;
//		while (count<3) {
//			System.out.println("숫자 a를 입력하세요. >>");
//			a = Integer.parseInt(sc.nextLine());
//			if(a>0&&a<=10) {
//				count++;
//				sum = sum+a;
//			}else {
//				wrongCount++;
//			}
//		}
//		System.out.println(sum);
//		System.out.println(wrongCount);
		// 12. 0부터 시작하는 4의 배수 10개를 출력하시오.
		// ex) 어떤수에 0,1,2,3,4.. 를 곱해서 나온 수를 어떤수의 배수라 한다.
//		int m = 0;
//		for(int i = 0 ; i < 10; i++) {
//			m=i*4;
//			System.out.println(m);
//		}
//		int sum =0;
//		for (int i = 0; i< 10; i++) {
//			System.out.println(sum);
//			sum= sum+4;
//		}
		// 13. 두수를 입력 받아 최소 공배수를 출력하는 프로그램을 만들어 보자.
		// ex)2의 배수도 되고 3의 배수도 되는 공배수는 6,12,18,24 등이 있다.
		// 이중에서 가장 작은 수 6를 최소 공배수 라고 한다. 2에 어떤수를 곱해서 나온 결과가 2의 배수 이므로 어떤 수를 2로 나누어 0이 되면
		// 2의 배수이다.
		// 1 부터 하나씩 증가시켜 입력 받은 두 수가 모두 0으로 나누어 떨어지는 수들은 공배수 이고 이중 가장 먼저 찾은 수가 가장 작은 수이므로
		// 처음 찾은수가 최소 공배수이다. 2와 5의 최소 공배수는 5이다.
//		Scanner sc =new Scanner(System.in);
//		System.out.println("최소공배수를 확인할 수 a ,b를 입력하세요. >>");
//		int a = Integer.parseInt(sc.nextLine());
//		int b = Integer.parseInt(sc.nextLine());
//		int lcm=0;
//		int count =0;
//		while(count<1) {
//			lcm=a*b;
//			count++;
//		}
//		System.out.println(lcm);
//		
//		int num1 = 54;
//		int num2 = 23;
//		for (int x = 1;; x++) {
//			if (x % num1 == 0 && x % num2 == 0) {
//				System.out.println(num1 + "와" + num2 + "의 최소 공배수 :" + x);
//			break;
//			}
//		}
		// 14. 3개의 수를 입력 받아
		// 가장 작은 수와
		// 가장 큰수를 출력하는 프로그램을 만들어 보자.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("크기를 비교할 수 a ,b,c를 입력하세요. >>");
//		int a = Integer.parseInt(sc.nextLine());
//		int b = Integer.parseInt(sc.nextLine());
//		int c = Integer.parseInt(sc.nextLine());
//		if (a > b) {
//			if (b > c) {// a가 가장 큼, c가 가장 작음
//				System.out.println("가장 큰수 :" + a + "가장 작은 수: " + c);
//			} else {// a가 가장 큼 , b가 가장 작음
//				System.out.println("가장 큰수 :" + a + "가장 작은 수: " + b);
//			}
//		}else if (b > a) {
//			if (a > c) {// b가 가장 큼 , c가 가장 작음
//				System.out.println("가장 큰수 :" + b + "가장 작은 수: " + c);
//			} else {// b가 가장 큼 , a가 가장 작음
//				System.out.println("가장 큰수 :" + b + "가장 작은 수: " + c);
//			}
//		}else if (c > a) {
//			if (a > b) {// c가 가장 큼, b가 가장 작음
//				System.out.println("가장 큰수 :" + c + "가장 작은 수: " + b);
//			} else {// c가 가장 큼, a가 가장 작음
//				System.out.println("가장 큰수 :" + c + "가장 작은 수: " + a);
//			}
//			
//		}else if (c > b) {
//			if (a > b) {// c가 가장 큼, b가 가장 작음
//				System.out.println("가장 큰수 :" + c + "가장 작은 수: " + b);
//			} else {// c가 가장 큼, a가 가장 작음
//				System.out.println("가장 큰수 :" + c + "가장 작은 수: " + a);
//			}
//		}
		//15. 100이하의 수학과목 점수를 5번 입력받아 60이하 점수가 몇 개인지 출력하는 프로그램을 구현해 보자.
//		int count =0 ;
//		int score = 0;
//		int sCount =0;
//		while (count<5) {//사용자로 부터 5번 입력 받는다.
//			System.out.println("수학 점수를 입력하세요. >>");
//			score = Integer.parseInt(sc.nextLine());
//			if(score<=60) {//60점 이하인 경우를 횟수로 저장한다.
//			sCount++;
//			}else {
//				
//			}
//			count++;
//		}System.out.println("60점 이하 점수의 개수는"+sCount+" 개 입니다.");
		//16. 소수는 1과 자기 자신만으로 나눠지는 수이다. 
		//2,3,5같은 경우 1과 본인 자신만으로 나눠지므로 소수이다.
		//수를 하나 입력받아 소수인지 아닌지 판별하는 프로그램을 구현하시오.
		//ex) 2부터 본인 보다 하나 작은 숫자를 차례대로 나눠서 나누어 떨어지는 수가 없으며 1과 자기 자신만 나눠지는 수이므로 소수에 해당한다.
//		System.out.println("수를 입력하세요");
//		int num = Integer.parseInt((new Scanner(System.in).nextLine()));
//		for(int i =2;i<num ; i++) {
//			if(num%i==0) {
//				System.out.println(num+"은 소수가 아닙니다.");
//			break;
//			}
//			else {
//				System.out.println(num+ "은 소수입니다.");
//			break;
//			}
//		}
		
		//17.숫자를 하나 입력받아 1~1000사이에 입력받은 
		//숫자의 배수가 몇 개인지 출력하는 프로그램을 만들어 보자.
//		System.out.println("수를 입력하세요");
//		int num = Integer.parseInt((new Scanner(System.in).nextLine()));
//		int count = 0;
//		for (int i =1; i<=1000; i++) {
//			if(i%num==0) {
//				count++;
//			}
//		}
//		System.out.println(num+"의 배수는 "+count+"개 입니다.");
		
		//18. 사용자에게 열의 데이터 개수을 입력받아 
		//열에 맞춰서 1부터 100까지 순서대로 출력하는 프로그램을 구현해 보자. 
		//ex) 3을 입력하면 한줄에 3개씩 출력 하면 된다.
//		System.out.println("한 줄에 출력할 데이터 개수를 입력하세요.");
//		int num= Integer.parseInt((new Scanner(System.in)).nextLine());
//		for (int k= 1; k<=100;k++) {//1~100까지 출력
//				System.out.print(k+"    \t");
//				if(k%num==0) {
//					System.out.println();
//			}
//		}
		//19. 컴퓨터가 던진 동전이 앞면 인지 뒷면 인지 맞추는 프로그램을 구현해 보자. 
		//맞춘 회수와 틀린 회수를 기록해서 보여주고 
		//3번 맞추면 프로그램이 종료되게 만들자.
//		int correct =0;
//		int incorrect = 0;
//		for(int i = 0 ;; i++) {
//			int comNumber = (int)(Math.random()*2);
//			System.out.println("동전의 예상 면를 입력하세요.앞-0 뒤-1");
//			int userNumber =Integer.parseInt((new Scanner(System.in)).nextLine());
//			if(comNumber==userNumber) {
//				correct++;
//				System.out.println("맞췄습니다.");
//			if(correct==3) {
//				break;
//			}
//			}else {
//				incorrect++;
//				System.out.println("틀렸습니다.");
//			}
//		}
//		System.out.println("맞춘 횟수 :"+ correct);
//		System.out.println("틀린 횟수 :"+ incorrect);
		//20. 컴퓨터가 던진 주사위 수를 맞추는 프로그램을 구현해 보자. 
		//10회 맞추어 맞춘 회수와 틀린 회수를 기록해서 보여 주자.
//		int correct =0;
//		int incorrect = 0;
//		for(int i = 0 ; i < 10; i++) {
//			int comNumber = (int)(Math.random()*6+1);
//			System.out.println("컴퓨터의 예상 주사위를 입력하세요.");
//			int userNumber =Integer.parseInt((new Scanner(System.in)).nextLine());
//			if(comNumber==userNumber) {
//				correct++;
//				System.out.println("맞췄습니다.");
//			}else {
//				incorrect++;
//				System.out.println("틀렸습니다.");
//			}
//		}
//		System.out.println("맞춘 횟수 :"+ correct);
//		System.out.println("틀린 횟수 :"+ incorrect);

	}
}
