package com.human.service;

import java.util.ArrayList;

import com.human.dto.DeptDto;

public interface IDeptService {
	public void insert(DeptDto dto) throws Exception;
	public void update(DeptDto dto) throws Exception;
	public void delete(String name) throws Exception;
	public ArrayList<DeptDto> selectAll() throws Exception;
	public DeptDto selectName(String name) throws Exception;
}
