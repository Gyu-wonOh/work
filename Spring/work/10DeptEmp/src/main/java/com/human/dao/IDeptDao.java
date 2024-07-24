package com.human.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.DeptDto;
import com.human.dto.DeptEmpDto;

public interface IDeptDao {
	public void insert(DeptDto dto) throws Exception;
	public DeptDto select(int deptNo) throws Exception;
	public List<DeptDto> selectAll() throws Exception;
	public void delete(int deptNo) throws Exception;
	public void update(DeptDto dto) throws Exception;	
	public Integer selectDeptNo() throws Exception;
	public List<DeptEmpDto> selectAllDeptEmp() throws Exception;
	public void insertDept(@Param("deptNo")int deptNo, @Param("dName")String dName, @Param("loc")String loc)throws Exception;
}
