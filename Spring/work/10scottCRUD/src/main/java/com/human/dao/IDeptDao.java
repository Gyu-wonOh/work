package com.human.dao;

import java.util.ArrayList;

import com.human.dto.DeptDto;

public interface IDeptDao {
	public void insert(DeptDto dto) throws Exception;
	public void update(DeptDto dto) throws Exception;
	public void delete(int deptNo) throws Exception;
	public ArrayList<DeptDto> selectAll() throws Exception;
	public DeptDto selectName(int deptNo) throws Exception;

}
