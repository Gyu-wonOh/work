package com.human.ex;

public class SeasonalActivities {

	public static void main(String[] args) {
//		Season [] seasons = new Season[4];
//			seasons[0]=Season.SPRING;
//			seasons[1]=Season.SUMMER;
//			seasons[2]=Season.AUTUMN;
//			seasons[3]=Season.WINTER;
		Season[]seasons =Season.values();//enum의 모든 값들을 배열로 얻어옴.
		Season currentSeason = Season.AUTUMN;//선언 및 할당
		switch (currentSeason) {
		case SPRING :
			System.out.println("꽃 구경하기");
			break;
		case SUMMER:
			System.out.println("해수욕");
			break;
		case AUTUMN:
			System.out.println("단풍 구경하기");
			break;
		case WINTER:
			System.out.println("눈싸움");
			break;
		}
		
	}

}
