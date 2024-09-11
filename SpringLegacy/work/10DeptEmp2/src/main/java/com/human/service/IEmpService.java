package com.human.service;

import java.util.List;

import com.human.dto.EmpDto;
//import com.human.vo.CustomerHobbyVo;
//import com.human.vo.CustomerHobbyVo2;

public interface IEmpService {
	
	public void insert(EmpDto dto) throws Exception;
	public EmpDto select(int deptNo) throws Exception;
	public List<EmpDto> selectAll() throws Exception;
	public void delete(int deptNo) throws Exception;
	public void update(EmpDto dto) throws Exception;	
//	public Integer selectMaxDeptNo() throws Exception;
//	public List<CustomerHobbyVo2> selectAllCustomerHobby() throws Exception;
}
