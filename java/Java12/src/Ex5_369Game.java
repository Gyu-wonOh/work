

public class Ex5_369Game {

	public static void main(String[] args) {
//		369게임 해답지를 만들어 보자.
//		1부터 순서대로 숫자를 출력 하다가 숫자에 3,6,9중에 하나라도 들어가면
//		박수를 치면 된다.
//		1,2,짝,4,5,짝,7,8,짝,10,11,12,짝,14.....
//		그런데 만약 33, 36같이 두개가 들어가면 박수를 두번 친다.
//		27,28,짝(29),짝(30),짝(31),짝(32),짝짝(33)
//		1000이하의 정답지를 출력하는 프로그램을 만들어 보자.
		
		for (int i = 0; i <= 1000; i++) {
			int oriNum = i;
			String str ="";
			int num = oriNum;
			while (num != 0) {
				if (num % 10 % 3 == 0 && num % 10 != 0) {
					str = str+"짝";
				}
				num = num / 10;
			}
			if(str.equals("")) {
				System.out.println(oriNum);
			}else {
				System.out.println(str+"("+oriNum+")");
			}
		}
	}

}
