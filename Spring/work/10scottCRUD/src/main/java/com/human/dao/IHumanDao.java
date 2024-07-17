package com.human.dao;

import java.util.ArrayList;

import com.human.dto.deptDto;

public interface IHumanDao {
	public void insert(deptDto dto) throws Exception;
	public void update(deptDto dto) throws Exception;
	public void delete(int deptNo) throws Exception;
	public ArrayList<deptDto> selectAll() throws Exception;
	public deptDto selectDeptNo(int deptNo) throws Exception;

}
