package com.human.dao;

import java.util.List;

import com.human.dto.EmpDto;

public interface IEmpDao {
	public void insert(EmpDto dto) throws Exception;
	public EmpDto select(int empNo) throws Exception;
	public List<EmpDto> selectAll() throws Exception;
	public void delete(int empNo) throws Exception;
	public void update(EmpDto dto) throws Exception;	
//	public Integer selectMaxDeptNo() throws Exception;
}
