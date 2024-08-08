package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.ProductDto;
import com.human.dto.UserDto;

public interface IProductService {
	public void insert(ProductDto dto) throws Exception;
	public List<ProductDto> selectAll() throws Exception;
	public ProductDto select(String productCode) throws Exception;
	public void update(ProductDto dto) throws Exception;
	public void delete(String productCode) throws Exception;
}
