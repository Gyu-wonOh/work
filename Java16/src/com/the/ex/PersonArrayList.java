package com.the.ex;

import java.util.ArrayList;
import java.util.Iterator;

import com.human.dto.Person;

public class PersonArrayList {

	public static void main(String[] args) {

		ArrayList<Person>personList =new ArrayList<>();
		//Person 객체 추가
		personList.add(new Person("Alice",25));
		personList.add(new Person("Bob",30));
		personList.add(new Person("Charlie",22));
		//전체 목록 츌력
		System.out.println("ArrayList 목록:");
		for(Person person:personList) {
			System.out.println(person);
		}
		System.out.println("--------------------------------");
		//특정 위치에 데이터 추가
		personList.add(1,new Person("David",28));
		//수정된 목록 출력
		System.out.println("수정된 목록");
		for(Person person:personList) {
			System.out.println(person);
		}
		System.out.println("--------------------------------");

		//특정 위치의 데이터 삭제
		personList.remove(2);
		//삭제된 목록 출력
		System.out.println("삭제된 목록:");
		for(Person person:personList) {
			System.out.println(person);
		}
		System.out.println("---------------------------------");
		//데이터 수정
		personList.set(0,new Person("Eva",35));
		//수정된 목록 출력
		System.out.println("수정된 목록");
		for(Person person : personList){
			System.out.println(person);
		}
		System.out.println("----------------------------------");
		//Iterator를 사용하여 전체 데이터 출력
		Iterator<Person>iter = personList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	

}
