package com.human.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.BoardDao;
import com.human.dto.BoardDto;
@Service
public class BoardServiceImple implements IBoardService {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void create(BoardDto dto) throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);
		dao.create(dto);
	}

	@Override
	public BoardDto read(int bId) throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);
		return dao.read(bId);
	}

	@Override
	public void update(BoardDto dto) throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);
		dao.update(dto);
	}

	@Override
	public void bHitUpdate(int bId) throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);
		dao.bHitUpdate(bId);
	}

	@Override
	public void bLike(int bId) throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);
		dao.bLike(bId);
	}

	@Override
	public void bDislike(int bId) throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);
		dao.bDislike(bId);
	}

	@Override
	public List<BoardDto> listAll() throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);		
		return dao.listAll();
	}
	
	@Override
	public List<BoardDto> listMenu(String bGroupKind) throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);
		return dao.listMenu(bGroupKind);
	}

	@Override
	public List<String> menukind() throws Exception {
		BoardDao dao=sqlSession.getMapper(BoardDao.class);
		return dao.menukind();
	}


}