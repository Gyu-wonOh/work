package com.human.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.human.dto.BoardDto;

public interface IBoardService {
	
	public void create(BoardDto dto)throws Exception;
	
	public BoardDto read(int bId) throws Exception;
	
	public void update(BoardDto dto) throws Exception;
	
	public void bHitUpdate(int bId) throws Exception;
	
	public void bLike(int bId) throws Exception;
	
	public void bDislike(int bId) throws Exception;
	
	public void delete(int bId) throws Exception;
	
	public List<BoardDto> listAll() throws Exception;
	
	public List<BoardDto> listMenu(@Param("bGroupKind")String bGroupKind) throws Exception;
	
	public String menuKind() throws Exception;

}
