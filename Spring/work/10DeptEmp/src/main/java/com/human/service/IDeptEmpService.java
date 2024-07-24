package com.human.service;

import java.util.List;

import com.human.dto.DeptDto;
import com.human.dto.DeptEmpDto;
import com.human.dto.EmpDto;

public interface IDeptEmpService {
	public List<DeptEmpDto> selectAll() throws Exception;
	public void insertDeptEmp(int deptNo,String dName,String loc,EmpDto emp) throws Exception;
	public void deleteDept(int deptNo) throws Exception;
}
