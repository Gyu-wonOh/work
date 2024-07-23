package com.human.service;

import java.util.ArrayList;
import java.util.List;

import com.human.dto.DeptDto;
import com.human.dto.DeptEmpDto;
import com.human.dto.EmpDto;

public interface IDeptEmpService {
	public void insert(DeptEmpDto dto) throws Exception;
	public void update(DeptEmpDto dto) throws Exception;
	public void deleteDeptNo(int deptNo) throws Exception;
	public void deleteEmpNo(int empNo) throws Exception;
	public List<DeptEmpDto> selectAll() throws Exception;
	public DeptDto selectDeptNo(int deptNo) throws Exception;
	public DeptDto selectEmpNo(int empNo) throws Exception;
}
