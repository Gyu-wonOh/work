package com.reservation.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ReviewDto {
	private int reviewId;
	private String business_regi_num;
	private String reviewContent;
	private String reviewName;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date reviewWriteTime;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date reviewUpdateTime;
	private String reviewEtc;
	private int rGroup;
	private int reviewStep;
	private int reviewIndent;
	private char delete;
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getBusiness_regi_num() {
		return business_regi_num;
	}
	public void setBusiness_regi_num(String business_regi_num) {
		this.business_regi_num = business_regi_num;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public String getReviewName() {
		return reviewName;
	}
	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}
	public Date getReviewWriteTime() {
		return reviewWriteTime;
	}
	public void setReviewWriteTime(Date reviewWriteTime) {
		this.reviewWriteTime = reviewWriteTime;
	}
	public Date getReviewUpdateTime() {
		return reviewUpdateTime;
	}
	public void setReviewUpdateTime(Date reviewUpdateTime) {
		this.reviewUpdateTime = reviewUpdateTime;
	}
	public String getReviewEtc() {
		return reviewEtc;
	}
	public void setReviewEtc(String reviewEtc) {
		this.reviewEtc = reviewEtc;
	}
	public int getrGroup() {
		return rGroup;
	}
	public void setrGroup(int rGroup) {
		this.rGroup = rGroup;
	}
	public int getReviewStep() {
		return reviewStep;
	}
	public void setReviewStep(int reviewStep) {
		this.reviewStep = reviewStep;
	}
	public int getReviewIndent() {
		return reviewIndent;
	}
	public void setReviewIndent(int reviewIndent) {
		this.reviewIndent = reviewIndent;
	}
	public char getDelete() {
		return delete;
	}
	public void setDelete(char delete) {
		this.delete = delete;
	}
	
	@Override
	public String toString() {
		return "ReviewDto [reviewId=" + reviewId + ", business_regi_num=" + business_regi_num + ", reviewContent="
				+ reviewContent + ", reviewName=" + reviewName + ", reviewWriteTime=" + reviewWriteTime
				+ ", reviewUpdateTime=" + reviewUpdateTime + ", reviewEtc=" + reviewEtc + ", rGroup=" + rGroup
				+ ", reviewStep=" + reviewStep + ", reviewIndent=" + reviewIndent + ", delete=" + delete + "]";
	}
	
}
