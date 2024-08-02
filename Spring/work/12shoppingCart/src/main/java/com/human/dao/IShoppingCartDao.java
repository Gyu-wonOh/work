package com.human.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.ShoppingCartDto;


public interface IShoppingCartDao {
	public void insert(ShoppingCartDto dto) throws Exception;
	public ShoppingCartDto select(String shoppingCartCode) throws Exception;
	public List<ShoppingCartDto> selectAll() throws Exception;
	public void delete(int cartId) throws Exception;
	public void update(ShoppingCartDto dto) throws Exception;
	public List<ShoppingCartDto> selectUser(String userId);
}
