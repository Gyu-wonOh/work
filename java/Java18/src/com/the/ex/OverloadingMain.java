package com.the.ex;

import com.the.dto.OverloadingExample;

public class OverloadingMain {

	public static void main(String[] args) {

		int result1 =OverloadingExample.add(5, 3);
		double result2 = OverloadingExample.add(2.5,1.5);
		
		System.out.println("Result: " + result1);
		System.out.println("Result: " + result2);
	}

}
