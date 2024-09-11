package com.the.ex;

import com.the.dto.MaxValueExample;

public class MaxValueMain {

	public static void main(String[] args) {
		int[]numbers = {14,6,23,8,31};
		int max = MaxValueExample.getMaxValue(numbers);
		System.out.println("Max value"+max);
	}
}
