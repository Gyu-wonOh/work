package com.human.dao;

import java.util.List;

import com.human.dto.DeptDto;
import com.human.dto.DeptEmpDto;

public interface IDeptEmpDao {
	public void insert(DeptEmpDto dto) throws Exception;
	public DeptDto select(int deptNo) throws Exception;
	public List<DeptEmpDto> selectAll() throws Exception;
	public void delete(int deptNo) throws Exception;
	public void deleteEmpNo(int empNo) throws Exception;
	public void update(DeptEmpDto dto) throws Exception;	
//	public Integer selectMaxDeptNo() throws Exception;
}
