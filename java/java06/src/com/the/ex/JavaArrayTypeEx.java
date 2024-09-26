package com.the.ex;

import java.util.Arrays;
import com.the.dto.*;
public class JavaArrayTypeEx {

	public static void main(String[] args) {
		int [] arrInt =new int [3];
		arrInt[0] = 10;
		arrInt[1] = 20;
		arrInt[2] = 30;
		
		System.out.println(Arrays.toString(arrInt));
		System.out.println(arrInt[1]);
		
		// double 배열에 1.5,2.5,3.5 데이터를 넣어 출력해보자
		
		double [] arrDouble = new double[3];
		arrDouble [0] = 1.5;
		arrDouble [1] = 2.5;
		arrDouble [2] = 3.5;
		System.out.println(Arrays.toString(arrDouble));
		System.out.println(arrDouble[1]);
		
		//String 배열을 만드어 과일 3개를 넣어보자
		//String arrString[] = {"사과","배","감"};
		String arrString[] = new String[3];
		arrString[0] = "사과";
		arrString[1] = new String("배");
		arrString[2] = new String("감");
		
		System.out.println(Arrays.toString(arrString));
		System.out.println(arrString[1]);
		
		//Human
		//Human a; a는 Human 객체의 주소를 저장할 수 있는 공간 1개 
		Human a =null;
		System.out.println(a);
		a= new Human();
		a.name = "홍길동";
		a.age = 10;
		a.height=10.10;
		System.out.println(a);
		
		//Human 배열은 Human a; 에서 여러 개 생성한 것이다.
		//따라서 Human 클래스 저장공간이 여러개 생긴 것이 아니고 
		//Human 클래스 저장주소가 여러개 생긴 것이다.
		Human arrHuman[] = new Human[3];
		
		arrHuman[0] =new Human();
		arrHuman[1] =new Human();
		arrHuman[2] =new Human();
		
		System.out.println(arrHuman);
		System.out.println(Arrays.toString(arrHuman));
		System.out.println(arrHuman[1]);
	
		arrHuman[0].name ="홍길동1";
		arrHuman[0].age =13;
		arrHuman[0].height =125.4;

		arrHuman[1].name ="홍길동2";
		arrHuman[1].age =13;
		arrHuman[1].height =125.4;
		
		arrHuman[2].name ="홍길동3";
		arrHuman[2].age =13;
		arrHuman[2].height =125.4;

		//첫번째 사람정보 출력
		System.out.println(arrHuman[0].name);
		System.out.println(arrHuman[0].age);
		System.out.println(arrHuman[0].height);
		System.out.println();
		
		System.out.println(arrHuman[1].name);
		System.out.println(arrHuman[1].age);
		System.out.println(arrHuman[2].height);
		System.out.println();
		
		System.out.println(arrHuman[2].name);
		System.out.println(arrHuman[2].age);
		System.out.println(arrHuman[2].height);
		System.out.println();
		
		
	}

}
