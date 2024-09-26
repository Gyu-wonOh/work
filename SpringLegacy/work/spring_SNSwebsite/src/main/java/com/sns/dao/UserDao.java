package com.sns.dao;

import com.sns.dto.UserDto;

public interface UserDao {
	public void createUser(UserDto dto)throws Exception;
	public UserDto selectUser(String nickname) throws Exception;
	public void updateUser(UserDto dto)throws Exception;
	public void deleteUser(String nickname)throws Exception;
}
