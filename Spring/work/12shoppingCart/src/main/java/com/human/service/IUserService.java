package com.human.service;

import com.human.dto.UserDto;

public interface IUserService {
	public void insert(UserDto dto) throws Exception;
	public UserDto selectAll() throws Exception;
}
