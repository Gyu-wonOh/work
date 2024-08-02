package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.ShoppingCartDto;

public interface IShoppingCartService {
	public void insert(ShoppingCartDto dto) throws Exception;
	public List<ShoppingCartDto> selectAll() throws Exception;
	public List<ShoppingCartDto> selectUser(String userId) throws Exception;
	public void update(ShoppingCartDto dto) throws Exception;
	public void delete(int cartId) throws Exception;
}
