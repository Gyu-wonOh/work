package com.the.dto;

public class MaxValueExample {
	public static int getMaxValue(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
