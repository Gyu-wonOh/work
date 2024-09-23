
public class ArraysRepetitiveEx11 {

	public static void main(String[] args) {
		// 11.컴퓨터에서 주사위 던지는 프로그램을 구현하였을때 => 주사위 (int)(Math.random()*6+1)
		// 던져서 나온수의 빈도(회수)를 구하는 프로그램을 작성해 보자. int count =0; count++; => 출력
		
//		int [] sum = new int [6];//0~5 인덱스
		int [] sum = {0,0,0,0,0,0};
		for(int i = 0; i<200; i++) {
			int num = (int)(Math.random()*6);
			sum[num]++;
		}
		for (int i = 0; i<sum.length;i++) {
			System.out.println(i+1 + " 번 주사위 빈도수는 " + sum[i]);
		}
	}

}
