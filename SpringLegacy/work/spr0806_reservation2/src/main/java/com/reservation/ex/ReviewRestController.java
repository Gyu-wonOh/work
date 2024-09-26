package com.reservation.ex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.dto.ReviewDto;
import com.reservation.service.IReviewService;
import com.reservation.vo.PageMaker;

@RestController
@RequestMapping("/reviews")
public class ReviewRestController {
	@Autowired
	private IReviewService rs;
	private static final Logger logger = LoggerFactory.getLogger(ReviewRestController.class);
	
	@RequestMapping(value = "/{business_regi_num}/{page}",method = RequestMethod.GET)
	public ResponseEntity<Map<String,Object>> list(@PathVariable("business_regi_num") String business_regi_num,@PathVariable("page")int page){
		ResponseEntity<Map<String,Object>> entity =null;
		try {
			PageMaker pm = new PageMaker();
			pm.setPage(page);
			
			Map<String,Object> map = new HashMap<String,Object>();
			List<ReviewDto> list = rs.reviewList(business_regi_num,pm);
			
			map.put("list",list);
			
			int reviewCount =rs.reviewCount(business_regi_num);
			pm.setTotalCount(reviewCount);
			map.put("pageMaker",pm);
			
			logger.info("pageMaker",pm);
			System.out.println("--list pm"+pm);
			
			entity = new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK); 
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<Map<String,Object>>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping(value ="",method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody ReviewDto dto) {
		System.out.println("aaaaaaaaaaa");
		ResponseEntity<String> entity = null;
		try {
			System.out.println(dto);
			rs.createReview(dto);
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping(value = "/{reviewId}",method = RequestMethod.POST)
	public ResponseEntity<String> reRegister(@PathVariable("reviewId")int reviewId,@RequestBody ReviewDto dto) {
		ResponseEntity<String> entity = null;
		try {
			ReviewDto review = rs.readReview(reviewId);
			int reviewGroup =review.getrGroup();
			int reviewStep = review.getReviewStep();
			int reviewIndent = review.getReviewIndent();
			System.out.println(
					"reviewRGroup" + reviewGroup + ", reviewStep" + reviewStep + ", reviewIndent"+reviewIndent);
			rs.reviewStep(reviewGroup, reviewStep);
			
			dto.setReviewIndent(reviewIndent+1);
			dto.setReviewStep(reviewStep+1);
			
			rs.createReviewReply(dto);
			logger.info("review-reply");
			System.out.println("ReviewDto"+dto);
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping(value ="/{reviewId}", method = RequestMethod.DELETE)
	public ResponseEntity<String> remove(@PathVariable("reviewId") int reviewId) {
		ResponseEntity<String> entity = null;
		try {
			logger.info("delete review");
			System.out.println("--reviewId"+reviewId);
			rs.deleteReview(reviewId);
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@RequestMapping(value= "{reviewId}", method = RequestMethod.PATCH)
	public ResponseEntity<String> update(@PathVariable("reviewId")int reviewId,@RequestBody ReviewDto dto){
		ResponseEntity<String> entity = null;
		try {
			logger.info("update review");
			System.out.println("--update"+reviewId+", ReviewDto"+dto);
			dto.setReviewId(reviewId);
			rs.updateReview(dto);
			
			entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
