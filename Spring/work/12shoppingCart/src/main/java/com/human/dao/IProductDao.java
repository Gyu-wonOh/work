package com.human.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.ProductDto;
import com.human.dto.UserDto;

public interface IProductDao {
	public void insert(ProductDto dto) throws Exception;
	public ProductDto select(String productCode) throws Exception;
	public List<ProductDto> selectAll() throws Exception;
	public void delete(String productCode) throws Exception;
	public void update(ProductDto dto) throws Exception;
}
