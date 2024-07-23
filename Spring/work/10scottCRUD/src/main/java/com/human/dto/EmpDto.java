package com.human.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class EmpDto {
	private int empNo;
	private String enName;
	private String job;
	private String mgr;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private LocalDateTime hirDate;
	private int sal;
	private int comm;
	
	
	public EmpDto(int empNo, String enName, String job, String mgr, LocalDateTime hirDate, int sal, int comm) {
		super();
		this.empNo = empNo;
		this.enName = enName;
		this.job = job;
		this.mgr = mgr;
		this.hirDate = hirDate;
		this.sal = sal;
		this.comm = comm;
	}
	
	@Override
	public String toString() {
		return "empDto [empNo=" + empNo + ", enName=" + enName + ", job=" + job + ", mgr=" + mgr + ", hirDate="
				+ hirDate + ", sal=" + sal + ", comm=" + comm + "]";
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public LocalDateTime getHirDate() {
		return hirDate;
	}
	public void setHirDate(LocalDateTime hirDate) {
		this.hirDate = hirDate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
}
