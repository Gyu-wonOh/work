package com.human.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.CartDto;
import com.human.dto.ProductDto;
import com.human.dto.UserDto;

public interface ICartDao {
	public void insert(CartDto dto) throws Exception;
	public CartDto select(String productCode) throws Exception;
	public List<CartDto> selectAll() throws Exception;
	public void delete(String productCode) throws Exception;
	public void update(CartDto dto) throws Exception;
}
