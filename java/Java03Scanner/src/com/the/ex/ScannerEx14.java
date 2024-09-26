package com.the.ex;

public class ScannerEx14 {

	public static void main(String[] args) {
		
		//14. 연필 1box =12자루
		//연필 1자루는 1000원이다.
		//한 박스의 연필 개수와 연필 가격을 입력 받아
		//구입한 전체 박스 수와 연필자루 수의 비용을 계산하는 프로그램
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int totalBox=0; //계산할 전체 박수
		int pencilNum=0; // 한박스의 연필 개수
		int pencilCost=0; // 연필 하나의 가격
		int totalCost=0; // 총 구입한 박스
		System.out.println("한박스에 들어있는 연필 갯수 입력:");
		pencilNum=Integer.parseInt(sc.nextLine());

		System.out.println("연필 가격 입력:");
		pencilCost=Integer.parseInt(sc.nextLine());

		System.out.println("구입한 전체 박스 입력:");
		totalBox=Integer.parseInt(sc.nextLine());

		System.out.println("전체 비용 : "+totalBox*pencilNum*pencilCost);
	}

}
