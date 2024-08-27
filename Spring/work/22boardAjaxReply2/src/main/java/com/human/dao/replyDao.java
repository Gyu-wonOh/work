package com.human.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.ReplyDto;

public interface replyDao {
	public void boardReplyCreate(ReplyDto dto)throws Exception;
	public void reReplyCreate(ReplyDto dto)throws Exception;
	public void boardReplyStep(@Param("rGroup")int rGroup,@Param("rStep")int rStep) throws Exception;
	public void boardReplyUpdate(ReplyDto dto)throws Exception;
	public void boardReplyDelete(int rId) throws Exception;
	public List<ReplyDto> replyList(@Param("bId") int bId,@Param("pm") PageMaker pm) throws Exception;
	public int replyCount(int bId) throws Exception;
	public ReplyDto readPrint(int rId)throws Exception;
}
