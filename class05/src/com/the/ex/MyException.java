package com.the.ex;

public class MyException {

	public static void main(String[] args) {
		//예외처리 : 프로그램이 실행도중에 잘못된 코드를 만나면 강제종료 되는데
		//예외처리를 이용해서 잘못된 코드를 만났을 때 프로그램이 종료되지 않고
		//계속 실행될 수 있도록 해준다.
		
		try{						
			int a =5/2;						//1
			System.out.println(a);			//2
		}catch(Exception e){
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료")	;	//3			
//		try catch 사용방법은 예외 예상지역은 try로 묶고 catch에서 처리한다.
//		try {
//			int a=5/0;	
//			System.out.println(a);
//		}catch(Exception e) {
//			System.out.println("예외발생");
//			e.printStackTrace();
//		}
//		System.out.println("프로그램 종료");
		
		//사용자에게 인덱스를 입력받아 배열인덱스에 들어잇는 숫자 출력
		int[] arr = {1,2,3,4,5};
		int index =-1;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		try {
		System.out.println("출력하고 싶은 배열의 인덱스 입력>>");
		index = Integer.parseInt(sc.nextLine());
		System.out.println("사용자가 입력한 인덱스의 배열 내용은 :" + arr[index]);
		//ArrayIndexOutOfBoundsException 배열의 인덱스를 벗어 났을 때 발생
		//NumberFormatException 문자를 숫자로 변환할 수 없을 때 발생
		}catch(NumberFormatException e) {
			System.out.println("입력한 문자열을 숫자로 변경할 수 없음");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열에서 벗어난 인덱스 사용");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}finally{
			System.out.println("예외 발생 유무와 관련 없이 항상 실행되는 코드");
		}
		System.out.println("정상종료");
	}
}

