package com.the.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyClass5 {

	public static void main(String[] args) {
		//정수,실수,String, boolean,시간
		//Date 클래스
		//calendar 클래스
		//LocalDateTime클래스는 하나의 시간 정보를 다루고,
		//Period는 날짜 간의 간격을 다루고, 년월일
		//Duration은 시간 간의 간격을 다룹니다. 시분초
		//현재 날짜와 시간을 LocalDateTime 객체로받아오기
		LocalDateTime now =LocalDateTime.now();
		//LocalDateTime객체를 문차열로 출력하기
		System.out.println("현재 날짜와 시간:" +now.toString());
		//LocalDateTime 객체에서 년,월,일,시,분,초 값 추출하기
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		//추출한 값 출력하기
		System.out.println("년:"+year);
		System.out.println("월:"+month);
		System.out.println("일:"+day);
		System.out.println("시:"+hour);
		System.out.println("분:"+minute);
		System.out.println("초:"+second);
		//다음은 2022년 4월 1일 10시 30분 0초에 해당하는 시간을 dateTime객체에 넣는 방법이다.
		LocalDateTime dateTime =LocalDateTime.of(2022,4,1,10,30,1);
		System.out.println("특정시간:"+dateTime);
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter
		= DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:ss"); //2022/04/01 10:30:01
		String formatterdDateTime = currentDateTime.format(formatter);
		System.out.println(formatterdDateTime);//2023/04/02 09:23:45
	}

}
