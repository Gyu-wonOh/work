import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//11. 사용자에게 계속해서 숫자를 입력받아 => scanner
		//1~10사이의 숫자를 3번 입력 할 때 까지 반복한다. =>count 필요/반본문 필요 반복횟수 x while문 사용
		//입력이 끝나면 잘못 입력한 회수와 => wrong count
		//제대로 입력한 회수를 출력하고 
		//사용자가 제대로 입력한 총합을 출력하는 프로그램을 만들어 보자.
		int wrongCount= 0;
		int count = 0;//1~10사이의 숫자를 입력 받을 때마다 1씩증가
		int sum = 0; //총합
	
		Scanner sc = new Scanner(System.in);
		int userInput =0; //사용자가 입력하 변수
		
		while(count<3) {//1~10사이의 숫자를 3번 입력 받으면 종료
			//사용자 입력을 받아서 범위에 맞으면 count를 1 증가 틀리면 wrongCount 증가
			//sum 총합에 사용자가 입력한 수를 합산한다.
			System.out.println("사용자 입력>>");
			userInput = Integer.parseInt(sc.nextLine());//사용자 입력받기
			
			if(userInput>=1&&userInput<10) {//올바른 입력 범위
				// 올바른 입력
				count++;
				sum= sum + userInput;
			}else {
				// 잘못된 입력
				wrongCount++;
			}
		}
		System.out.println("잘못된 입력 횟수"+wrongCount);
		System.out.println("3개의 입력 총합 :" +sum);
	}

}
