package com.human.ex;

public class EnumComparisonExample {

	public static void main(String[] args) {

		Mood myMood = Mood.HAPPY;
		if(myMood == Mood.HAPPY) {
			System.out.println("I'm happy!");
		}else {
			System.out.println("I'm not happy");
		}
	}
}
