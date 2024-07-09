package com.the.service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.the.dao.ProductDao;
import com.the.dao.UserDao;
import com.the.dto.ProductDto;
import com.the.dto.UserDto;

public class ShopService {
	
	public UserDao userDao =new UserDao();
	public ProductDao productDao = new ProductDao();
	
	//회원 관련 기능
	public void userInsert(UserDto userDto) {
		userDao.insert(userDto);
	}
	public ArrayList<UserDto> userSelect() {
		ArrayList<UserDto> userDtos = userDao.select();
		return userDtos;
	}
	public void userUpdate (String id,String email,String phoneNumber,String address) {
		userDao.update(id,email,phoneNumber,address);
	}
	public void userDelete (String id) {
		userDao.delete(id);
	}
	public UserDto userLogin(String id,String pw) {
		UserDto userDto =userDao.login(id, pw);
		return userDto;
	}
	//상품 관련 기능
	public void productInsert(ProductDto productDto) {
		productDao.insert(productDto);
	}
	public ArrayList<ProductDto> productSelect() {
		ArrayList<ProductDto> productDtos = productDao.select();
		return productDtos;
	}
	public void productUpdate(String productCode,String productPrice, String stockAmount) {
		productDao.update(productCode, productPrice, stockAmount);
	}
	public void productDelete(String productCode) {
		productDao.delete(productCode);
	}
}
