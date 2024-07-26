package com.human.dao;

import com.human.dto.UserDto;

public interface IUserDao {
	public void insert(UserDto dto) throws Exception;
}
