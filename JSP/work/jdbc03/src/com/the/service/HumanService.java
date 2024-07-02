package com.the.service;

import java.util.ArrayList;

import com.the.dao.HumanDao;
import com.the.dto.HumanDto;

//1. DB작업이 없는 경우
//2. 여러 DB에 걸쳐서  작업하는 경우,트랜젝션 처리
//3. DB작업시 데이터 변환이 필요한 경우
public class HumanService {
	private HumanDao humanDao = new HumanDao();
	
	public ArrayList<HumanDto> select(){
		ArrayList<HumanDto> humanDtos = humanDao.select();
		//HumanDtos를 통한 데이터 변경 작업
		return humanDtos;
	}
	public void insert(HumanDto dto) {
		humanDao.insert(dto);
	}
	
	public void update(int age,String name) {
		humanDao.update(age, name);
	}
	public void delete(String name) {
		humanDao.delete(name);
	}
	public void info() {
		System.out.println("현 프로그램은 휴먼테이블 관리 프로그램");
	}
	
}
