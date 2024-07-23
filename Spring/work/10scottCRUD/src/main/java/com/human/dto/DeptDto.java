package com.human.dto;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DeptDto {
	private int deptNo;
	private String dName;
	private String loc;
	
	public DeptDto() {}
	
	public DeptDto(int deptNo, String dName, String loc) {
		super();
		this.deptNo = deptNo;
		this.dName = dName;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "deptDto [deptNo=" + deptNo + ", dName=" + dName + ", loc=" + loc + "]";
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
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
	
	

}
