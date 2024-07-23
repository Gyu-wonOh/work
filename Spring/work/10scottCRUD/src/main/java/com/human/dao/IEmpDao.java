package com.human.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.DeptDto;
import com.human.dto.EmpDto;


public interface IEmpDao {
	public void insert(EmpDto dto) throws Exception;
	public EmpDto select(EmpDto dto) throws Exception;
	public ArrayList<EmpDto> selectAll() throws Exception;
	public void delete(EmpDto dto) throws Exception;
	public void update(EmpDto dto) throws Exception;
}
