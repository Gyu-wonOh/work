package com.human.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.BoardDto;

public interface IBoardDao {
	
	public void create(BoardDto dto)throws Exception;
	
	public BoardDto read(Integer bId) throws Exception;
	
	public void update(BoardDto dto) throws Exception;
	
	public void bHitUpdate(int bId) throws Exception;
	
	public void bLike(int bId) throws Exception;
	
	public void bDislike(int bId) throws Exception;
	
	public void delete(int bId) throws Exception;
	
	public List<BoardDto> listAll() throws Exception;
	
	public List<BoardDto> listMenu(@Param("bGroupKind")String bGroupKind) throws Exception;
	
	public List<String> menuKind() throws Exception;
	
}
