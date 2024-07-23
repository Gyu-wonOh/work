package com.human.dao;

import java.util.List;

import com.human.dto.DeptDto;

public interface IDeptDao {
	public void insert(DeptDto dto) throws Exception;
	public DeptDto select(int deptNo) throws Exception;
	public List<DeptDto> selectAll() throws Exception;
	public void delete(int deptNo) throws Exception;
	public void update(DeptDto dto) throws Exception;	
//	public Integer selectMaxDeptNo() throws Exception;
}
