package com.human.dto;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EmpDto {
	private Integer empNo;
	private String enName;
	private String job;
	private String mgr;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private LocalDateTime hirDate;
	private Integer sal;
	private Integer comm;
	private Integer deptNo;
	
	public EmpDto() {}

	public EmpDto(Integer empNo, String enName, String job, String mgr, LocalDateTime hirDate, Integer sal,
			Integer comm, Integer deptNo) {
		super();
		this.empNo = empNo;
		this.enName = enName;
		this.job = job;
		this.mgr = mgr;
		this.hirDate = hirDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}

	public EmpDto(Integer empNo, String enName, String job, String mgr, LocalDateTime hirDate, Integer sal,
			Integer comm) {
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
		return "EmpDto [empNo=" + empNo + ", enName=" + enName + ", job=" + job + ", mgr=" + mgr + ", hirDate="
				+ hirDate + ", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
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

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public Integer getComm() {
		return comm;
	}

	public void setComm(Integer comm) {
		this.comm = comm;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
}
