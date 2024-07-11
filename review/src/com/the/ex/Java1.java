package com.the.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java1 {

	public static void main(String[] args) {
		//변수를 이용해서 사람정보를 입력받아 출력해보자.
		//이를,나이,키
		
		String name = "홍길동";
		int age = 10;
		double height = 161.5;
		LocalDateTime date = LocalDateTime.now();
		
		System.out.println("이름:"+name+"\n나이: "+age+"\n키:"+height+"\n생일 :"+date);

		//내가 원하는 형태로 시간 출력//자바 시간 포멧팅으로 검색해서 확인
		System.out.println("생일:"+date.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println("생일:"+date.format(
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss")));
		
		//3.원하는 시간 생성하기
		date=LocalDateTime.parse("2023-05-11T09:56:08");
		//web에서 날짜만 입력해서 가지고 오면 "2023-05-11"만 있어서
		/*
		 * LocalDateTime birthday = LocalDateTime.parsr(
		 * request.getParameter("birthday")+"T00:00:01");
		 */
				
		System.out.println("생일:"+date.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println("생일:"+date.format(
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss")));
	}

}
