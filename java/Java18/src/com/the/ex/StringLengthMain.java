package com.the.ex;

import com.the.dto.StringlengthExample;

public class StringLengthMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Hello, Java!";
		int length = StringlengthExample.getStringLength(message);
		System.out.println("Length: "+length);
	}

}
