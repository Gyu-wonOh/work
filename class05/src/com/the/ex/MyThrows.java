package com.the.ex;

public class MyThrows {

	public static void test1() {
		
		try {
			System.out.println("hello");
			throw new Exception();	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void test2() throws Exception{
		throw new Exception();
	}
	public static void main(String[] args) throws Exception {
		test1();
		try {
			test2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test2();
		
		System.out.println("정상종료");
	}

}
