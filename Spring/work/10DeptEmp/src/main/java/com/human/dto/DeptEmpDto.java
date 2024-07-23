package com.human.dto;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DeptEmpDto {
	private int deptNo;
	private String dName;
	private String loc;
	
	private EmpDto empDto;
	
	public DeptEmpDto(DeptDto dto, EmpDto empDto) {
		super();
		this.deptNo = dto.getDeptNo();
		this.dName = dto.getdName();
		this.loc = dto.getLoc();
		this.empDto = empDto;
	}


}
