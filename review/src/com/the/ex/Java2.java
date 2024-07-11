package com.the.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.the.dto.HumanDto;

public class Java2 {

	public static void main(String[] args) {
		/*
		 * HumanDto 객첼르 만들어 사용해보자. 
		 * 1. 연산자 사용 
		 * 2. getter setter사용
		 * 3. 생성자 사용
		 */
		//nullpointExcepction 널에 접근하면 에러가 난다.
		HumanDto humanDto=null;
		humanDto=new HumanDto();//인스턴스화
		humanDto.age=10;
		humanDto.name="홍길남";
		humanDto.height= 152.4;
		humanDto.birthday = LocalDateTime.now();
		
		System.out.println("이름:"+humanDto.name+"\n나이: "+humanDto.age+"\n키:"+humanDto.height+"\n생일 :"+humanDto.birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		//객체를 찍었을 때 문자열로 나오게 하고 싶으면 toString을 추가한다.
		System.out.println(humanDto);

		HumanDto humanDto2=null;
		humanDto2=new HumanDto();//인스턴스화
		humanDto2.age=10;
		humanDto2.name="홍길동";
		humanDto2.height= 152.8;
		humanDto2.birthday = LocalDateTime.now();
		
		System.out.println
		("이름:"+humanDto2.name+"\n나이: "+humanDto2.age+"\n키:"+humanDto2.height+"\n생일 :"+humanDto2.birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		//객체를 찍었을 때 문자열로 나오게 하고 싶으면 toString을 추가한다.
		System.out.println(humanDto);
		
		//gettet setter를 이용한 데이터접근
		String name ="홍길동";
		int age =14;
		HumanDto newDto=new HumanDto();
		newDto.setName(name);
		newDto.setName("홍길주");//마지막 설정된 값이 newDto에 실제 값이 된다.
		newDto.setAge(age);
		
		System.out.println(newDto);
		
		//생성자 사용
		
		HumanDto a = new HumanDto();
		HumanDto b = new HumanDto("홍",14,112.3,LocalDateTime.now());
		System.out.println(b);
		
		//이름 나이 키 로만 데이터를 세팅하는 생성자 만들기
		
		HumanDto c = new HumanDto("동",15,145.2);
		System.out.println(c);
		
		//이름 키로만 데이터를 셋팅하는 생성자 만들기
		HumanDto d =new HumanDto("길",153.2);
		System.out.println(d);
		
	}

}
