package com.human.service;

import java.util.List;

import com.human.dto.BoardDto;
import com.human.vo.BoardVo;

public interface IBoardService {
	public void regist(BoardDto board) throws Exception;
	public BoardDto read (Integer bId) throws Exception;
	public void modify (BoardDto board) throws Exception;
	public void remove (Integer bId) throws Exception;
	public List<BoardDto> listAll() throws Exception;
	
	public void bHitUpdate(int bId)throws Exception;
	
	public void bLike(int bId) throws Exception;
	public void updateReply (BoardDto dto) throws Exception;
	public List<BoardDto> listMenu(String bGroupKind) throws Exception;
	public void reply (BoardDto dto) throws Exception;
	
	public List<BoardDto> listSearchCriteria(BoardVo vo) throws Exception;
	public List<String> menuKind() throws Exception;
	public void replyUpdate(BoardDto dto)throws Exception;
	public int listSearchCount(BoardVo vo)throws Exception;
}
