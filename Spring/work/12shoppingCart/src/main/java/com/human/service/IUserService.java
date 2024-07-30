package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.UserDto;

public interface IUserService {
	public void insert(UserDto dto) throws Exception;
	public List<UserDto> selectAll() throws Exception;
	public UserDto select(String id) throws Exception;
	public void update(@Param("pw")String pw, @Param("email")String email,@Param("phoneNumber")String PhoneNumber, @Param("id")String id) throws Exception;
	public void delete(String id) throws Exception;
}
