package com.human.service;

import java.util.List;

import com.human.dto.DeptDto;
//import com.human.vo.CustomerHobbyVo;
//import com.human.vo.CustomerHobbyVo2;

public interface IDeptService {
	
	public void insert(DeptDto dto) throws Exception;
	public DeptDto select(int deptNo) throws Exception;
	public List<DeptDto> selectAll() throws Exception;
	public void delete(int deptNo) throws Exception;
	public void update(DeptDto dto) throws Exception;

//	public List<CustomerHobbyVo2> selectAllCustomerHobby() throws Exception;
}
