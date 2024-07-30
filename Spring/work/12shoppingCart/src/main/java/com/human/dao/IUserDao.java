package com.human.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.UserDto;

public interface IUserDao {
	public void insert(UserDto dto) throws Exception;
	public UserDto select(String id) throws Exception;
	public List<UserDto> selectAll() throws Exception;
	public void delete(String id) throws Exception;
	public void update(@Param("pw")String pw, @Param("email")String email,@Param("phoneNumber")String PhoneNumber, @Param("id")String id) throws Exception;
}
