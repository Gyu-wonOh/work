package com.the.ex;

import java.util.Arrays;

public class BlackJackPratice {

	public static void main(String[] args) {

		// 카드만들기
		int deck[] = new int[52];
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		}
//		System.out.println(Arrays.toString(deck));

		// 카드정보 관련 배열
		String cardNum[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String cardShape[] = { "스페이드", "하트", "클로버", "다이아" };

		// 34의 카드 정보 모양 34/13 숫자 34%13
		System.out.println(34 + "번 카드는 " + cardShape[deck[34 - 1] / 13] + cardNum[deck[34 - 1] % 13]);

		// 가지고 있는 모든 카드에 번호와 모양 출력
		for (int i = 0; i < deck.length; i++) {
			System.out.println((i + 1) + "번 카드 :\t" + cardShape[deck[i] / 13] + cardNum[deck[i] % 13]);
		}

		// 카드 교환
//		int temp = deck[0];
//		int cardIndex = 51;
//		deck[0]=deck[cardIndex];
//		deck[cardIndex]=temp;
//		
		// 카드를 랜덤하게 여러번 섞기
		for (int i = 0; i < 10000; i++) {
			int cardIndex = (int) (Math.random() * 52);
			int tempCard = deck[0];
			deck[0] = deck[cardIndex];
			deck[cardIndex] = tempCard;
		}
		for (int i = 0; i < deck.length; i++) {
			System.out.println((i + 1) + "번 카드 :" + cardShape[deck[i] / 13] + cardNum[deck[i] % 13]);
		}
		// deck에서 카드 한장을 플레이어1에게 주기
		// deckIndex를 이용해서 사용한 카드, 다음 사용할 카드 , 사용 안한 카드를 구분하자.
		int deckIndex = 0;// deck[deckIndex] 다음 사용할 카드

		// p1,p2가 카드 받을 준비
		int p1Deck[] = new int[11];
		int p1DeckIndex = 0; // p1 이 가지고 있는 카드 수
		int p2Deck[] = new int[11];
		int p2DeckIndex = 0; // p2 가 가지고 있는 카드 수
//		//p1에게 카드 한장주기
//		p1Deck[p1DeckIndex] = deck[deckIndex];
//		deckIndex++;
//		p1DeckIndex++;
//		
//		//p2에게 카드 한장주기
//		p2Deck[p2DeckIndex] = deck[deckIndex];
//		deckIndex++;
//		p2DeckIndex++;
//		
//		//한장씩 더 받기
//		p1Deck[p1DeckIndex++]=deck[deckIndex++];
//		p2Deck[p2DeckIndex++]=deck[deckIndex++];
//		//p1이 가지고 있는 카드를 출력하시오.
//		System.out.print("p1이 보유한 카드는 ");
//		for(int i = 0; i < p1DeckIndex; i++) {
//			System.out.print(cardShape[p1Deck[i]/13]+cardNum[p1Deck[i]%13]+" ");
//		}
//		System.out.println(" 입니다.");
//		//p2가 가지고 있는 카드를 출력하시오.
//		System.out.print("p2가 보유한 카드는 ");
//		for(int i = 0; i < p2DeckIndex; i++) {
//			System.out.print(cardShape[p2Deck[i]/13]+cardNum[p2Deck[i]%13]+" ");
//		}
//		System.out.println(" 입니다.");
//		// 사용한 카드, 다음 사용할 카드
//		System.out.print("사용한 카드는 ");
//		for(int i = 0; i < deckIndex; i++) {
//			System.out.print(cardShape[deck[i]/13]+cardNum[deck[i]%13]+" ");
//		}
//		System.out.println(" 입니다.");
//		System.out.println("다음 사용할 카드는 "+ cardShape[deck[deckIndex]/13]+cardNum[deck[deckIndex]%13]);
//		
//		// 앞으로 사용할 카드를 구분해서 출력해보자.
//		System.out.println("앞으로 사용할 카드는 ");
//		for(int i = deckIndex+1; i < deck.length; i++) {
//			System.out.println(cardShape[deck[i]/13]+cardNum[deck[i]%13]+" ");
//		}
//		System.out.println(" 입니다.");

		// 사용자에게 카드 한장씩 준 다음 사용자가 받은 카드를 출력하는 프로그램
		// 본인이 원하는 만큼 번갈아서 1장씩 받는다.
		// 둘다 그만 받으면 프로그램을 종료하고 받은 카드를 출력해준다.
		boolean p1Flag = true;
		boolean p2Flag = true;
		int p1Sum = 0;
		int p2Sum = 0;

		while (p1Flag || p2Flag) {
			if (p1Flag) {
				System.out.println("p1님 카드를 받으시겠습니까? 1.Yes 2.No");
				String input = new java.util.Scanner(System.in).nextLine();
				if (input.equals("1")) {
					p1Deck[p1DeckIndex++] = deck[deckIndex++];
				} else {
					p1Flag = false;
				}

			}
			if (p2Flag) {
				System.out.println("p2님 카드를 받으시겠습니까? 1.Yes 2.No");
				String input = new java.util.Scanner(System.in).nextLine();
				if (input.equals("1")) {
					p2Deck[p2DeckIndex++] = deck[deckIndex++];
				} else {
					p2Flag = false;
				}
			}

			// 받은 카드를 출력할 때 카드의 총합을 구해보자.
			// J, Q, K 는 10으로 계산한다.
			// 2~10까지는 해당 수를 sum에 더한다.
			// A= 1or 11? 처리방버은 알던 11로 계산하고 만약에
			// sum이 21이 넘으면 받은 카드에 A가 있으면 -10을 해준다.
			// A 확인 중간에 21보다 작아지면 확인작업을 중단하고
			// 더 이상 A가 없으면 최종결과값 sum이 된다.

			// p1의 카드 총합 구하기
			p1Sum = 0;
			for (int i = 0; i < p1DeckIndex; i++) {
				if (p1Deck[i] % 13 < 1) {
					p1Sum = p1Sum + 11;
				} else if (p1Deck[i] % 13 <= 10) {
					p1Sum = p1Sum + (p1Deck[i] % 13 + 1);
				} else {
					p1Sum = p1Sum + 10;
				}
			}
			// p1의 카드 패에서 A찾기
			// p1 카드 총합이 21보다 작으면 작업 종료
			for (int i = 0; i < p1DeckIndex; i++) {
				if (p1Sum <= 21) {
					break;
				}
				if (p1Deck[i] % 13 == 0) {// A가 있으면 10을 빼준다.
					p1Sum = p1Sum - 10;
				}
			}

			// p2의 카드 총합 구하기
			p2Sum = 0;
			for (int i = 0; i < p2DeckIndex; i++) {
				if (p2Deck[i] % 13 < 1) {
					p2Sum = p2Sum + 11;
				} else if (p2Deck[i] % 13 <= 10) {
					p2Sum = p2Sum + (p2Deck[i] % 13 + 1);
				} else {
					p2Sum = p2Sum + 10;
				}
			}
			// p2의 카드 패에서 A찾기
			// p2 카드 총합이 21보다 작으면 작업 종료
			for (int i = 0; i < p2DeckIndex; i++) {
				if (p2Sum <= 21) {
					break;
				}
				if (p2Deck[i] % 13 == 0) {// A가 있으면 10을 빼준다.
					p2Sum = p2Sum - 10;
				}
			}

			// p1이 가지고 있는 카드를 출력하시오.
			System.out.print("p1이 보유한 카드는 ");
			for (int i = 0; i < p1DeckIndex; i++) {
				System.out.print(cardShape[p1Deck[i] / 13] + cardNum[p1Deck[i] % 13] + " ");
			}
			System.out.println(" 입니다.");
			System.out.println("p1님의 점수는 " + p1Sum + "입니다.");
			// p2가 가지고 있는 카드를 출력하시오.
			System.out.print("p2가 보유한 카드는 ");
			for (int i = 0; i < p2DeckIndex; i++) {
				System.out.print(cardShape[p2Deck[i] / 13] + cardNum[p2Deck[i] % 13] + " ");
			}
			System.out.println(" 입니다.");
			System.out.println("p2님의 점수는 " + p2Sum + "입니다.");
		} // while 끝

		// 승패 출력
		String winner = "";
		if (p1Sum > 21) {
			winner = "p2 승리";
		} else if (p2Sum > 21) {
			winner = "p1 승리";
		} else if (p1Sum > p2Sum) {
			winner = "p1 승리";
		} else if (p1Sum == p2Sum) {
			winner = "무승부";
		} else {
			winner = "p2 승리";
		}
		System.out.println("최종결과:" + winner);
		System.out.println("게임종료");
	}
}
