package com.the.ex;
import java.util.Iterator;
import java.util.ArrayList;
public class MyArrayListEx {

	public static void main(String[] args) {

		//예제
		//문자열을 저장하는 ArrayList를 생성
		ArrayList<String> stringList =new ArrayList<>();
		//문자열 추가
		stringList.add("Apple"); stringList.add("Banana");
		stringList.add("Orange"); stringList.add("Grapes");
		stringList.add("Mango");
		
		//ArrayList의 크기 출력
		System.out.println("ArrayList의 크기: " + stringList.size());
		//특정 인덱스의 요소 가져오기
		String fruit =stringList.get(2);
		System.out.println("인덱스2의 과일:"+ fruit);
		//전체 목록 출력 - 방법1: 향상된 for문 사용
		System.out.println("ArrayList 목록 -방법 1: 향샹된 for문");
		for(String item:stringList) {
			System.out.println(item);
		}
		//요소 존재여부 확인
		boolean containsBanana = stringList.contains("Banana");
		System.out.println("ArrayList에 Banan가 포함돠어 있는가?"+containsBanana);
		//특정 요소 삭제
		stringList.remove(1);//인덱스 1 삭제
		stringList.remove("Grapes");//리스트에 들어있는 Grapes삭제
		//특정 요소 변경
		stringList.set(0, "Grapes");//0번 인덱스 Grapes로 변경
		//전체 목록 출력 - 방법 2: Iterator 사용
		System.out.println("ArrayList 목록 - 방법 2: Iterator");
		Iterator<String> iterator =stringList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//ArrayList비우기
		stringList.clear();
		//ArrayList가 비어있는지 확인
		boolean isEmpty = stringList.isEmpty();
		System.out.println("ArrayList가 비어있는가?"+ isEmpty);
	}

}
