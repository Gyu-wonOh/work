package com.human.dao;

import java.util.ArrayList;

import com.human.dto.DeptDto;
import com.human.dto.EmpDto;

public interface IEmpDao {
	public void insert(EmpDto dto) throws Exception;
	public void update(EmpDto dto) throws Exception;
	public void delete(int empNo) throws Exception;
	public ArrayList<DeptDto> selectAll() throws Exception;
	public DeptDto selectName(int empNo) throws Exception;

}
