package com.human.dto;

import java.util.ArrayList;
import java.util.Iterator;
import com.human.dto.Rect;

public class RectArrayList {

	public static void main(String[] args) {
		ArrayList<Rect> arrList = new ArrayList<Rect>();
		// add메소드를 이용해서 사각형 객체 6개를 리스트 마지막에 추가
		arrList.add(new Rect(11, 11));
		arrList.add(new Rect(21, 11));
		arrList.add(new Rect(11, 41));
		arrList.add(new Rect(11, 21));
		arrList.add(new Rect(31, 11));
		arrList.add(new Rect(11, 31));
		for (int i = 0; i < arrList.size(); i++) {// size를 통해서 배열의 개수 생성
			//toString이 있어야 찍힌다.
			System.out.println(arrList.get(i));
		}
		System.out.println("___________________________");
		//add메소드를 이용해서 특정위치에 데이터를 추가하는 방법이다.
		//특정 위치에 추가되면 기존 특정 위치 데이터가 사라지는 것이 아니라 특정 위치 이후에 들어 있는 모든 데이터가 
		// 뒤로 하나씩 밀린다.
		arrList.add(2,new Rect(99,99));//2번인덱스에 3 추가(인덱스, 넣을값)
		for(Rect i: arrList) {
			System.out.println(i);
		}
		System.out.println("---------------------------");
		//특정위치의 데이터를 삭제하는 방법 특정위치의 데이터가 삭제되면 특정위치 이후에 들어 있는 모든 데이터가 앞으로 당겨진다.
		arrList.remove(2);//index 삭제
		//Rect클래스에 equals가 있어야 정상 동작한다.
		arrList.remove(new Rect(31,11));//데이터를 이용한 삭제
		for(Rect i : arrList) {
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		//indexOf메소드로 해당 데이터의 인덱스 위치 확인 리턴 없으면 -1
		int index = arrList.indexOf(new Rect(11,21));//equals가 있어야 동작
		System.out.println(index);
		//.contains 메소드는 해당 데이터가 존재하는지 여부 확인 true,false
		System.out.println(arrList.contains(new Rect(11,21)));//equals
		System.out.println(arrList.contains(new Rect(91,21)));//equals
		System.out.println(arrList.isEmpty());//비어 있는지 true false 리턴
		//set 메소드를 이용해서 데이터를 수정할 수 있다.
		arrList.set(2, new Rect(44,55));//수정 시프트가 일어나지 않는다.
		
		Iterator<Rect> iter= arrList.iterator();//전체 데이터순회 
		while(iter.hasNext()) {//인덱스 다음에 데이터가 있는가?
			//인덱스를 하나 증가하고 들어 있는 데이터를 읽어옴
			System.out.println(iter.next());
			
		}
	}

}
