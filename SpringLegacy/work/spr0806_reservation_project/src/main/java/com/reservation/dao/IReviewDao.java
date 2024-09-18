package com.reservation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.reservation.dto.ReviewDto;

public interface IReviewDao {
	public List<ReviewDto> reviewList(@Param("reviewId") int reviewId)throws Exception;
    public void reviewCreate(ReviewDto dto) throws Exception;
    public void reviewUpdate(ReviewDto dto) throws Exception;
    public void reviewDelete(int reviewId)throws Exception;
}
