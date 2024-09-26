package com.reservation.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.dao.ReviewDao;
import com.reservation.dto.ReviewDto;
import com.reservation.vo.PageMaker;
@Service
public class ReviewServiceImpl implements IReviewService {
	@Autowired
	private SqlSession sqlSession;
	@Override
	public List<ReviewDto> reviewList(String business_regi_num, PageMaker pm) throws Exception {
		ReviewDao dao = sqlSession.getMapper(ReviewDao.class);
		return dao.reviewList(business_regi_num, pm);
	}

	@Override
	public void createReview(ReviewDto dto) throws Exception {
		ReviewDao dao = sqlSession.getMapper(ReviewDao.class);
		dao.createReview(dto);
	}

	@Override
	public void updateReview(ReviewDto dto) throws Exception {
		ReviewDao dao =sqlSession.getMapper(ReviewDao.class);
		dao.updateReview(dto);
	}

	@Override
	public void deleteReview(int reviewId) throws Exception {
		ReviewDao dao =sqlSession.getMapper(ReviewDao.class);
		dao.deleteReview(reviewId);
	}

	@Override
	public void createReviewReply(ReviewDto dto) throws Exception {
		ReviewDao dao =sqlSession.getMapper(ReviewDao.class);
		dao.createReviewReply(dto);	
	}

	@Override
	public Integer reviewCount(String business_regi_num) throws Exception {
		ReviewDao dao =sqlSession.getMapper(ReviewDao.class);
		return dao.reviewCount(business_regi_num);
	}

	@Override
	public ReviewDto readReview(int reviewId) throws Exception {
		ReviewDao dao =sqlSession.getMapper(ReviewDao.class);
		return dao.readReview(reviewId);
	}

	@Override
	public void reviewStep(int rGroup, int reviewStep) throws Exception {
		ReviewDao dao =sqlSession.getMapper(ReviewDao.class);
		dao.reviewStep(rGroup, reviewStep);
	}

}
