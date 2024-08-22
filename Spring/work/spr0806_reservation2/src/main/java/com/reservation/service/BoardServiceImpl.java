package com.reservation.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.dao.BoardDao;
import com.reservation.dto.BoardDto;
@Service
public class BoardServiceImpl implements IBoardService {
	@Autowired
	SqlSession sqlSession;
	@Override
	public List<BoardDto> listAll() throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		List<BoardDto> dtos = dao.listAll();
		return dtos;
	}

	@Override
	public List<String> listMenu() throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		List<String> dtos = dao.listMenu();
		return dtos;
	}

	@Override
	public void create(BoardDto dto) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.create(dto);
	}

	@Override
	public BoardDto read(Integer bId) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		
		return dao.read(bId);
	}

	@Override
	public void update(BoardDto dto) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(Integer bId) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.delete(bId);
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
	public void bDislike(int bId) throws Exception {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		dao.bDislike(bId);
	}

	@Override
	public List<BoardDto> listMenu(String bGroupKind) {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		List<BoardDto> dtos= dao.listMenu(bGroupKind);
		return dtos;
	}

	@Override
	public List<String> menuKind() {
		BoardDao dao = sqlSession.getMapper(BoardDao.class);
		List<String> dtos= dao.menuKind();
		return dtos;
	}

}
