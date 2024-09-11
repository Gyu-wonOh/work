package com.the.ex;

import java.util.ArrayList;
import java.util.Iterator;
public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr1 = new ArrayList<String>();
		//arrayList는 객체만 담을 수 있다.
		ArrayList <Integer> arr = new ArrayList<Integer>();
		
		//리스트에 1~6까지 데이터를 추가해보자.
		arr.add(1);arr.add(2);arr.add(3);
		arr.add(4);arr.add(5);arr.add(6);
		for(int item: arr) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		//2번 인덱스에 9를 넣어보자.
		arr.add(2,9);
		for(int item: arr) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		//3번 인덱스 10번으로 변경
		arr.set(3,10);
		for(int item: arr) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		//인덱스로 삭제
		arr.remove(2); //9삭제
		arr.remove((Integer)10);
		for(int item:arr) {
			System.out.print(item + " ");
		}
		System.out.println();
		//중복 데이터가 있으면 1개만 삭제된다.
		//인덱스로 검색해서 삭제 시 뒤부터 삭제
		
		int index = arr.indexOf((Integer)4); //없으면 -1
		System.out.println("index of 4:" +index);
		
		System.out.println("Contatins 8:"+ arr. contains(((Integer)5)));
		System.out.println("isEmpty:"+arr.isEmpty());
		
		Iterator<Integer> iter =arr.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
//		arr.clear();
//		System.out.println("종료");
//		for(int item: arr) {
//			System.out.print(item+" ");
//		}
//		System.out.println();
	}
}
