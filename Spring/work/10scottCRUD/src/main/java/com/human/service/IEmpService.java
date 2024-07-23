package com.human.service;

import java.util.ArrayList;
import java.util.List;

import com.human.dto.EmpDto;

public interface IEmpService {
	public void insert(EmpDto dto) throws Exception;
	public void update(EmpDto dto) throws Exception;
	public void delete(int empNo) throws Exception;
	public ArrayList<EmpDto> selectAll() throws Exception;
	public List<EmpDto> selectEmpNo(int empNo) throws Exception;
}
