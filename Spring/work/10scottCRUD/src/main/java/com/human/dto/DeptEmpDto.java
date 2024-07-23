package com.human.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class DeptEmpDto {
	private Integer deptNo;
	private String dName;
	private String loc;
	private List<EmpDto> emp;
	
	public DeptEmpDto() {}
	
	public DeptEmpDto(DeptDto dto, List<EmpDto> emp) {
		super();
		this.deptNo = dto.getDeptNo();
		this.dName = dto.getdName();
		this.loc = dto.getLoc();
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "DeptEmpDto [deptNo=" + deptNo + ", dName=" + dName + ", loc=" + loc + ", emp=" + emp + "]";
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<EmpDto> getEmp() {
		return emp;
	}

	public void setEmp(List<EmpDto> emp) {
		this.emp = emp;
	}
	
	
}
