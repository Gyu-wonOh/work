package com.human.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BoardDto {
	private String  bGroupKind;
	private int bid;
	private String bName;
	private String btitle;
	private String bContent;
	private String bEtc;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date bWriteTime;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date bUpdateTime;
	private int bHit;
	private int bGroup;
	private int bStep;
	private int bIndent;
	private String bDelete;
	private int bLike;
	private int bDislike;
	public String getbGroupKind() {
		return bGroupKind;
	}
	public void setbGroupKind(String bGroupKind) {
		this.bGroupKind = bGroupKind;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
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
	public String getbDelete() {
		return bDelete;
	}
	public void setbDelete(String bDelete) {
		this.bDelete = bDelete;
	}
	public int getbLike() {
		return bLike;
	}
	public void setbLike(int bLike) {
		this.bLike = bLike;
	}
	public int getbDislike() {
		return bDislike;
	}
	public void setbDislike(int bDislike) {
		this.bDislike = bDislike;
	}
	@Override
	public String toString() {
		return "boardDto [bGroupKind=" + bGroupKind + ", bid=" + bid + ", bName=" + bName + ", btitle=" + btitle
				+ ", bContent=" + bContent + ", bEtc=" + bEtc + ", bWriteTime=" + bWriteTime + ", bUpdateTime="
				+ bUpdateTime + ", bHit=" + bHit + ", bGroup=" + bGroup + ", bStep=" + bStep + ", bIndent=" + bIndent
				+ ", bDelete=" + bDelete + ", bLike=" + bLike + ", bDislike=" + bDislike + "]";
	}
	
}
