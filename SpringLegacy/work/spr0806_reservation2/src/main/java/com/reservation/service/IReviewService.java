package com.reservation.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.reservation.dto.ReviewDto;
import com.reservation.vo.PageMaker;

public interface IReviewService {
	public List<ReviewDto> reviewList(@Param("business_regi_num")String business_regi_num,@Param("pm") PageMaker pm)throws Exception;
	public void createReview(ReviewDto dto)throws Exception;
	public void updateReview(ReviewDto dto)throws Exception;
	public void deleteReview(int reviewId)throws Exception;
	public void createReviewReply(ReviewDto dto)throws Exception;
	public Integer reviewCount(String business_regi_num) throws Exception;
	public ReviewDto readReview(int reviewId)throws Exception;
	public void reviewStep(@Param("rGroup")int rGroup,@Param("reviewStep")int reviewStep) throws Exception;
}
