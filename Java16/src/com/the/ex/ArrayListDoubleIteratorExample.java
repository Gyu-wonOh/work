package com.the.ex;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDoubleIteratorExample {

	public static void main(String[] args) {

		//double 값을 저장하는 ArrayList 생성
		ArrayList<Double> doubleList = new ArrayList<>();
		//double 값 추가
		doubleList.add(3.14); doubleList.add(2.718);
		doubleList.add(1.618); doubleList.add(0.707);
		doubleList.add(4.669);
		//전체 목록 출력 - 방법 1: 향상된 for문 사용
		System.out.println("ArrayList 목록 - 방법1: 향상된 for문");
		for(double num: doubleList) {
			System.out.println(num);
		}
		//전체 목록 출력 - 방법 2: Iterator 사용
		System.out.println("ArrayList 목록 - 방법 2: Iterator");
		Iterator<Double>iterator = doubleList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//특정 값이 포함된 요소 제거
		iterator =doubleList.iterator();
		while(iterator.hasNext()){
			double value = iterator.next();
			if(value == 2.718) {
			iterator.remove();
			}
		}
		//요소 제거후 목록 출력
		System.out.println("요소 제거 후 목록");
		for (double num : doubleList) {
			System.out.println(num);
		}
		System.out.println("종료");
	}
}
