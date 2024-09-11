

public class Ex6_RandomOperationQuiz {

	public static void main(String[] args) {
//		6. 랜덤하게 덧셈, 뺄셈, 곱셈, 나눗셈 문제를 내서 사용자가 맞추는 프로그램을 구현해 보자. 
//		레벨이 4단계로 되어 있어 처음에는 더하기 문제만 나오다가 레벨이 업되면 뺄셈,곱셈,나눗셈을 차례대로 추가하여 
//		문제가 나오도록 해보자. 
//		2자리 이하 정수 계산만 하자.
		String operator[] = { "+", "-", "*", "/" };
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input = "9";
		while (!input.equals("0")) {
			System.out.println("랜덤 수학문제입니다.(0을 누르면 종료됩니다.)");
			int num1 = (int) (Math.random() * 99 + 1);
			int num2 = (int) (Math.random() * 99 + 1);
			switch(input) {
			case "1":
				System.out.println("덧셈문제입니다.");
				System.out.println(String.format("%d %s %d = ", num1, operator[0], num2));
				int answer = num1 + num2;
				int solve = Integer.parseInt(sc.nextLine());
				if (solve == answer) {
			
				}
				break;
			case "2":
				System.out.println("뺄셈문제입니다.");
				System.out.println(String.format("%d %s %d = ", num1, operator[1], num2));
				 answer = num1 - num2;
				 solve = Integer.parseInt(sc.nextLine());
				if (solve == answer) {
				
			}
				break;
				
			case "3":
				System.out.println("곱셈문제입니다.");
				System.out.println(String.format("%d %s %d = ", num1, operator[2], num2));
				 answer = num1 * num2;
				 solve = Integer.parseInt(sc.nextLine());
				if (solve == answer) {
				}
				break;
				
			case "4":
				System.out.println("곱셈문제입니다.");
				System.out.println(String.format("%d %s %d = ", num1, operator[2], num2));
				 answer = num1 * num2;
				 solve = Integer.parseInt(sc.nextLine());
				if (solve == answer) {
				
				}
				break;

			}
		}
	}
}
