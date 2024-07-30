package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.ProductDto;
import com.human.dto.UserDto;

public interface IProductService {
	public void insert(ProductDto dto) throws Exception;
	public List<ProductDto> selectAll() throws Exception;
	public ProductDto select(String productCode) throws Exception;
	public void update(@Param("productName")String productName, @Param("productPrice")String productPrice,@Param("productDetail")String productDetail, @Param("manufacture")String manufacture, @Param("category")String category,@Param("stockAmount")String stockAmount,@Param("status")String status) throws Exception;
	public void delete(String productCode) throws Exception;
}
