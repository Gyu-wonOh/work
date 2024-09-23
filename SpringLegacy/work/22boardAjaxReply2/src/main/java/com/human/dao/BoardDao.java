package com.human.dao;

import java.util.List;

import com.human.dto.BoardDto;
import com.human.vo.BoardVo;

public interface BoardDao {
	public void create(BoardDto dto) throws Exception;
	public BoardDto read(Integer bId) throws Exception;
	public void update(BoardDto dto) throws Exception;
	public void delete(Integer bId) throws Exception;
	public List<BoardDto> listAll() throws Exception;
	public void bLike(int bId) throws Exception;
	public void bDislike(int bId) throws Exception;
	public void bHitUpdate(int bId) throws Exception;
	public void updateReply(BoardDto dto)throws Exception;
	public List<BoardDto> listMenu(String bGroupKind) throws Exception;
	
	public List<String> menuKind() throws Exception;
	public void reply(BoardDto dto) throws Exception;
	public void replyUpdate(BoardDto dto) throws Exception;
	public List<BoardDto> listSearch(BoardVo vo)throws Exception;
	public int listSearchCount(BoardVo vo) throws Exception;
}