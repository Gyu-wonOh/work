package com.human.charater;

public class Pikachu implements Pet {
	private int experience =40;
	private int energy = 50;
	private int level = 1;
	
	@Override
	public void eat() {//피카추에게 먹이를 준다.
		energy +=25; // 먹을 때마다 energy가 25 증가한다.
	}

	@Override
	public void sleep() {// 잠을 재워 에너지 10dmf 증가시킨다.
		energy+= 10;
	}

	@Override
	public void play() {//놀게 만들어 경험치를 증가 시킨다.
		energy-=30; experience+=30;
	}

	@Override
	public void train() { //훈련을 통해서 경험치를 증가 시킨다.
		energy-=30; experience+=20;
	}

	@Override
	public void levelup() {
		if(experience>60) {
			experience-=40;
			level++;
			System.out.println("렙업");
		}
	}

	@Override
	public boolean endGame() {
		boolean returnValue=true;
		if(level>=4) {// 레벨이 4가 되면 성공으로 게임을 끝낸다.
			System.out.println("피카추가 용이 됨");
			returnValue =false;
		}else if(energy<=0) {//에너지가 0이면 실패로 게임을 끝낸다.
			System.out.println("피카추가 굶어 죽음");
			returnValue= false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("====================================");
		System.out.println("피카추 정보 입니다.");
		System.out.println("experience :" + experience);
		System.out.println("energy :" + energy);
		System.out.println("level :" + level);
		System.out.println("====================================");
	}
}
