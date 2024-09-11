package com.the.ex;

import com.the.dto.EvenOddExample;

public class EvenOddMain {

	public static void main(String[] args) {

		int number =7;
		if(EvenOddExample.isEven(number)) {
			System.out.println(number + " is even.");
		}else {
			System.out.println(number + " is odd.");
		}
	}

}
