package com.reservation.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

	/*drop table review;
		CREATE TABLE review (
		reviewId NUMBER PRIMARY KEY,
		business_regi_num varchar2(20),
		reviewContent VARCHAR2(1000) NOT NULL,
		reviewName VARCHAR2(100) NOT NULL,
		reviewWriteTime date DEFAULT sysdate,
		reviewUpdateTime date,
		reviewEtc VARCHAR2(1000),
		reiewGroup NUMBER NOT NULL,
		reviewDelete CHAR(1) DEFAULT 'N'
		);
	
		select * from review;
	
		drop sequence reviewId;
		CREATE SEQUENCE reviewId;*/

public class ReviewDto {
	private int reviewId;
	private String business_regi_num;
	private String reviewContent;
	private String reviewName;
	@DateTimeFormat(pattern="YYYY-mm-dd'T'HH:mm:ss")
	private Date reviewWriteTime;
	private Date reviewUpdateTime;
	private String reviewEtc;
	private int reviewGroup;
	private char reviewDelete;
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
	public int getReviewGroup() {
		return reviewGroup;
	}
	public void setReviewGroup(int reviewGroup) {
		this.reviewGroup = reviewGroup;
	}
	public char getReviewDelete() {
		return reviewDelete;
	}
	public void setReviewDelete(char reviewDelete) {
		this.reviewDelete = reviewDelete;
	}
	@Override
	public String toString() {
		return "ReviewDto [reviewId=" + reviewId + ", business_regi_num=" + business_regi_num + ", reviewContent="
				+ reviewContent + ", reviewName=" + reviewName + ", reviewWriteTime=" + reviewWriteTime
				+ ", reviewUpdateTime=" + reviewUpdateTime + ", reviewEtc=" + reviewEtc + ", reviewGroup=" + reviewGroup
				+ ", reviewDelete=" + reviewDelete + "]";
	}
}
