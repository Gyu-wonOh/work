package com.the.service;

import java.util.ArrayList;

import com.the.dao.HumanDao;
import com.the.dto.HumanDto;

public class HumanService {
	private HumanDao humanDao = new HumanDao();
	
	public ArrayList<HumanDto> select(){
		ArrayList<HumanDto> humanDtos = humanDao.select();
		return humanDtos;
	}
	public void insert(HumanDto dto){
		humanDao.insert(dto);
	}
	public void delete( String name){
		humanDao.delete(name);
	}
	public void update(int age, String name){
		humanDao.update(age,name);
	}
}
