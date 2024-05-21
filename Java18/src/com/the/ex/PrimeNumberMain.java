package com.the.ex;

import com.the.dto.PrimeNumberExample;

public class PrimeNumberMain {

	public static void main(String[] args) {

		int number = 17;
		if(PrimeNumberExample.isPrime(number)) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number.");
		}
	}

}
