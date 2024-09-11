package com.human.charater;

public class Cat implements Pet {
	private int experience = 50;
	private int energy = 50;
	private int level = 1;
	
	
	@Override
	public void eat() {//고양이에게 먹이를 줄 때
		energy+=20; //먹을 때마다 energy가 20 증가 한다.
	}

	@Override
	public void sleep() { //잠을 재워 에너지 15를 증가시킨다.
		energy+= 15 ;
	}

	@Override
	public void play() { //놀게 만들어 겸헝치를 증가시킨다.
		energy-=20; experience+=25;
	}

	@Override
	public void train() { //훈련을 통해서 경험도를 증가시킨다.
		energy -=30; experience += 30;
	}

	@Override
	public void levelup() {//경험치가 쌓이면 렙업하게 만든다.
		if(experience > 60) {
			experience -=40;
			level++;
			System.out.println("렙업");
		}
	}

	@Override
	public boolean endGame() {
		boolean returnValue =true;
		if(level >=4) {//레벨이 4가 되면 성공으로 게임을 끝낸다.
			System.out.println("고양이가 괴가 됨");
			returnValue =false;
		}else if(energy<=0) {//어너지가 0이면 실패로 게임을 끝낸다.
			System.out.println("고양이가 굶어죽음");
			returnValue =false;
		}
		return returnValue;
	}
	
	@Override
	public void printInfo() {
		System.out.println("====================================");
		System.out.println("고양이 정보 입니다.");
		System.out.println("experience :" + experience);
		System.out.println("energy :" + energy);
		System.out.println("level :" + level);
		System.out.println("====================================");
	}
}
