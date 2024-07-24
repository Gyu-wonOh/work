package com.human.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DeptDto {
	private Integer deptNo;
	private String dName;
	private String loc;
	
	public DeptDto() {}
	public DeptDto(Integer deptNo, String dName, String loc) {
		super();
		this.deptNo = deptNo;
		this.dName = dName;
		this.loc = loc;
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
	@Override
	public String toString() {
		return "DeptDto [deptNo=" + deptNo + ", dName=" + dName + ", loc=" + loc + "]";
	}
	
	
	
}
