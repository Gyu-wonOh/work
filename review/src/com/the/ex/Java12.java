package com.the.ex;

class MyCounter1{
	public static String name ="홍길동";
	public static int count =0;
	public static void increment() {
		MyCounter1.count++;
	}
	public static void decrement() {
		MyCounter1.count--;
	}
	public static void getValue() {
		System.out.println(MyCounter1.name+"님 현재 counter은" +MyCounter1.count+" 입니다.");
	}
	
}
class MyCounter2{
	public static String name ="홍길동2";
	public static int count =0;
	public static void increment() {
		MyCounter2.count++;
	}
	public static void decrement() {
		MyCounter2.count--;
	}
	public static void getValue() {
		System.out.println(MyCounter2.name+"님 현재 counter은" +MyCounter2.count+" 입니다.");
	}
	
}
public class Java12 {
	

	public static void main(String[] args) {

		MyCounter1.getValue();
		MyCounter1.increment();
		MyCounter1.getValue();
		MyCounter1.increment();
		MyCounter1.getValue();
		MyCounter1.increment();
		MyCounter1.increment();
		MyCounter1.getValue();

		MyCounter2.getValue();
		MyCounter2.increment();
		MyCounter2.getValue();
		MyCounter2.increment();
		MyCounter2.getValue();
		MyCounter2.increment();
		MyCounter2.increment();
		MyCounter2.getValue();
		
	}

}
