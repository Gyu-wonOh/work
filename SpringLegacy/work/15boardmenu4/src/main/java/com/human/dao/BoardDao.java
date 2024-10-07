package com.human.dao;

import java.util.List;

import com.human.dto.BoardDto;

public interface BoardDao {
	public void create(BoardDto dto) throws Exception;
	public BoardDto read(int bId)throws Exception;
	public void update(BoardDto dto) throws Exception;
	public void bHitUpdate(int bId) throws Exception;
	public void bLike(int bId) throws Exception;
	public void bDislike(int bId) throws Exception;
	public List<BoardDto> listAll()throws Exception;
	public List<BoardDto> listMenu(String bGroupKind)throws Exception;
	public List<String> menukind()throws Exception;
}