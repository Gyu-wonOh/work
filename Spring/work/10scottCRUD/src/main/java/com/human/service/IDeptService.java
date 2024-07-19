package com.human.service;

import java.util.ArrayList;

import com.human.dto.DeptDto;

public interface IDeptService {
	public void insert(DeptDto dto) throws Exception;
	public void update(DeptDto dto) throws Exception;
	public void delete(int deptNo) throws Exception;
	public ArrayList<DeptDto> selectAll() throws Exception;
	public DeptDto selectDeptNo(int deptNo) throws Exception;
}
