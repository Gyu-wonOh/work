package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.CartDto;

public interface ICartService {
	public void insert(@Param("userId")String userId,@Param("productCode")String productCode, @Param("orderAmount")int orderAmount) throws Exception;
	public List<CartDto> selectAll() throws Exception;
	public List<CartDto> selectUser(String id) throws Exception;
	public void update(CartDto dto) throws Exception;
	public void deleteProduct(String productCode) throws Exception;
	public void deleteCart(int id) throws Exception;
}
