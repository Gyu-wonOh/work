package com.the.service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.the.dao.UserDao;
import com.the.dto.UserDto;

public class ShopService {
	public UserDao userDao =new UserDao();
	
	public void userInsert(UserDto userDto) {
		userDao.insert(userDto);
	}
	public ArrayList<UserDto> userSelect() {
		ArrayList<UserDto> userDtos = userDao.select();
		return userDtos;
	}
	public void userUpdate (String id,String email,String phoneNumber,String address) {
		userDao.update(id,email,phoneNumber,address);
	}
	public void userDelete (String id) {
		userDao.delete(id);
	}
}
