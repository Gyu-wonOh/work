package com.reservation.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BoardDto {
	private String bGroupKind;
	private int bId;
	private String bName;
	private String bTitle;
	private String bConents;
	private String bEtc;
	@DateTimeFormat(pattern="yyyy-MM-dd'T' HH:mm")
	private Date bWriteTime;
	@DateTimeFormat(pattern="yyyy-MM-dd'T' HH:mm")
	private Date bUpdateTime;
	private int bHit;
	private int bGroup;
	private int bStep;
	private int bIndent;
	private int bDelete;
	private int blike;
	private int disLike;
	public String getbGroupKind() {
		return bGroupKind;
	}
	public void setbGroupKind(String bGroupKind) {
		this.bGroupKind = bGroupKind;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbConents() {
		return bConents;
	}
	public void setbConents(String bConents) {
		this.bConents = bConents;
	}
	public String getbEtc() {
		return bEtc;
	}
	public void setbEtc(String bEtc) {
		this.bEtc = bEtc;
	}
	public Date getbWriteTime() {
		return bWriteTime;
	}
	public void setbWriteTime(Date bWriteTime) {
		this.bWriteTime = bWriteTime;
	}
	public Date getbUpdateTime() {
		return bUpdateTime;
	}
	public void setbUpdateTime(Date bUpdateTime) {
		this.bUpdateTime = bUpdateTime;
	}
	public int getbHit() {
		return bHit;
	}
	public void setbHit(int bHit) {
		this.bHit = bHit;
	}
	public int getbGroup() {
		return bGroup;
	}
	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}
	public int getbStep() {
		return bStep;
	}
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}
	public int getbIndent() {
		return bIndent;
	}
	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	public int getbDelete() {
		return bDelete;
	}
	public void setbDelete(int bDelete) {
		this.bDelete = bDelete;
	}
	public int getBlike() {
		return blike;
	}
	public void setBlike(int blike) {
		this.blike = blike;
	}
	public int getDisLike() {
		return disLike;
	}
	public void setDisLike(int disLike) {
		this.disLike = disLike;
	}
	@Override
	public String toString() {
		return "boardDto [bGroupKind=" + bGroupKind + ", bId=" + bId + ", bName=" + bName + ", bTitle=" + bTitle
				+ ", bConents=" + bConents + ", bEtc=" + bEtc + ", bWriteTime=" + bWriteTime + ", bUpdateTime="
				+ bUpdateTime + ", bHit=" + bHit + ", bGroup=" + bGroup + ", bStep=" + bStep + ", bIndent=" + bIndent
				+ ", bDelete=" + bDelete + ", blike=" + blike + ", disLike=" + disLike + "]";
	}
	
	
}
