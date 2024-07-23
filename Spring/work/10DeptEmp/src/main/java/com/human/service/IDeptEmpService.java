package com.human.service;

import java.util.List;

import com.human.dto.DeptDto;
import com.human.dto.DeptEmpDto;
//import com.human.vo.CustomerHobbyVo;
//import com.human.vo.CustomerHobbyVo2;
import com.human.dto.EmpDto;

public interface IDeptEmpService {
	
	public void insert(DeptDto dto, List<EmpDto> emps) throws Exception;
	public List<DeptEmpDto> selectAll() throws Exception;
	public void delete(int deptNo) throws Exception;
	public void deleteEmp(int empNo) throws Exception;
	public void update(DeptDto dto) throws Exception;	
//	public Integer selectMaxDeptNo() throws Exception;
//	public List<CustomerHobbyVo2> selectAllCustomerHobby() throws Exception;
}
