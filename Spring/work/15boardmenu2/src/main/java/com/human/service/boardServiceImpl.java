package com.human.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.BoardDao;
import com.human.dto.BoardDto;

@Service
public class boardServiceImpl implements IBoardService {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void regist(BoardDto board) throws Exception {
		BoardDao dao =sqlSession.getMapper(BoardDao.class);
		dao.create(board);
	}

	@Override
	public BoardDto read(Integer bId) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		return dao.read(bId);
	}

	@Override
	public void modify(BoardDto board) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.update(board);
	}

	@Override
	public void remove(Integer bId) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.delete(bId);
	}

	@Override
	public List<BoardDto> listAll() throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		List<BoardDto> dtos = dao.listAll();
		return dtos;
	}

	@Override
	public void bHitUpdate(int bId) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.bHitUpdate(bId);
	}

	@Override
	public void bLike(int bId) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.bLike(bId);
	}

	@Override
	public List<BoardDto> listMenu(String bGroupKind) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		List<BoardDto> dtos = dao.listMenu(bGroupKind);
		return dtos;
	}

	@Override
	public List<String> menuKind() throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		List<String> dtos=dao.menuKind();
		return null;
	}

}
